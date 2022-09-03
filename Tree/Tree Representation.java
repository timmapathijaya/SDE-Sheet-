class Node 
{
    int data;
    Node left , right ;
    public Node(int data)
    {
        this.data = data;
    }
}
class Test
{
    public static void main(String [] args)
    {
        /*
               1
              /  \
             2    3
             \
              5
        */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(5);
    }
}
