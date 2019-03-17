class Node {
    int data;
    Node next;
    Node previous;


    public void setpre(Node previous)
    {
        this.previous=previous;
    }

    public Node getdpre()
    {
        return previous;
    }


    public void setdata(int data) {
        this.data = data;
    }

    public int getdata() {
        return data;
    }

    public void setnext(Node next) {
        this.next = next;
    }

    public Node getnext() {
        return next;
    }

}

    public class Doubly
    {
        Node start=null;
        Node pre=null;

    public boolean isempty()
    {
        return start==null;
    }
        public void insertfirst(int val)
        {
            Node n=new Node();
            if(isempty())
            {
                n.setnext(null);
                n.setpre(null);
             n.setdata(val);
             start=n;
            }

            else
            {
                Node temp=start;
                n.setdata(val);
                n.setnext(start);
                n.setpre(null);
                start=n;
            }


            }

        public void display()
        {
            Node temp=start;
            while(temp!=null)
            {
                System.out.print(temp.getdata()+"<-->");
                temp=temp.getnext();
            }
            System.out.println("null");

        }


        public void insertlast(int val)
        {
            Node n=new Node();
            if(isempty())
            {
                n.setdata(val);
                n.setnext(null);
                n.setpre(null);
                start=n;
            }

            else
            {
                Node temp=start;
                Node temp1=null;
                while(temp.next!=null)
                {
                    temp1=temp;
                    temp=temp.getnext();
                }
                temp.setnext(n);
                n.setnext(null);
                n.setdata(val);
                n.setpre(temp1);
            }
        }

        public void deletefirst()
        {
            if(isempty())
            {
                System.out.println("list is empty");
            }
            else
            {
                Node temp=start;
                System.out.println("deleted elemnt from first "+temp.getdata());
                start=temp.getnext();
            }
        }

        public void deletelast()
        {
            if(isempty())
            {
                System.out.println("list is empty");
            }

            else
            {
                Node temp=start;
                Node pre=null;
                while(temp.next!=null)
                {
                    pre=temp;
                    temp=temp.getnext();
                }
                System.out.println("deleted element from last"+temp.getdata());
                pre.setnext(null);
            }
        }
        public static void main(String[] args) {
            Doubly obj=new Doubly();
        obj.insertfirst(5);
            obj.insertfirst(4);
            obj.insertfirst(3);
            obj.insertfirst(2);
            obj.insertfirst(1);
            obj.insertlast(6);
            obj.display();
            obj.deletefirst();
            obj.display();
            obj.deletelast();
            obj.display();
    }
    }

