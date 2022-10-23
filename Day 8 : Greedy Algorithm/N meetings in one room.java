class MeetingDetails
{
    int startTime , endTime;
    public MeetingDetails(int startTime , int endTime)
    {
        this.startTime = startTime;
        this.endTime = endTime;
    }
}
class MyComparator implements Comparator<MeetingDetails>
{
    public int compare(MeetingDetails meetingA , MeetingDetails meetingB)
    {
        return (meetingA.endTime - meetingB.endTime);
    }
}
class Solution 
{
    //Function to find the maximum number of meetings that can
    //be performed in a meeting room.
    public static int maxMeetings(int start[], int end[], int n)
    {
       List<MeetingDetails> meetings = new ArrayList<>(n);
       for(int i = 0 ; i < n ; i++) // N
          meetings.add(new MeetingDetails(start[i] , end[i])); 
       Collections.sort(meetings , new MyComparator()); // NlogN
     //Sooner the meeting finishes, we have much more chance to perform more meetings.
       int maximumMeetings = 1;
       int endTime = meetings.get(0).endTime;
       
       for(int i = 1 ; i < n ; i++) // N
       {
           if(meetings.get(i).startTime > endTime)
           {
               maximumMeetings += 1;
               endTime = meetings.get(i).endTime;
           }
       }
       return maximumMeetings;       
    }
}
// TC : N log N + N + N => O(Nlog N)
