package Queue;
class QueueUsingArray {
    static class Queue{
        int arr[];
        int size;
        int rear;
        Queue(int n){
            arr=new int[n];
            rear=-1;
            size=n;
        }
        public boolean isEmpty(){
            return rear==-1;
        }
        public void add(int data){
            if(rear==size-1){
                System.out.println("The Queue is Full");
                return;
            }
            // rear =rear + 1;
            arr[++rear]=data;
        }
        public int remove(){
            if(rear==-1){
                System.out.println("The Queue is Empty cant remove");
                return -1;
            }
            int front =arr[0];
            for(int i=0;i<rear;i++){
                arr[i]=arr[i+1];
            }
            rear --; //rear = rear - 1;
            return front;
        }
        public int peek(){
            if(rear==-1){
                System.out.println("The Queue is Empty");
                return -1;
            }
            return arr[0];
        }
        public void emptyQueue(){
            if(rear==-1){
                System.out.println("the Queue is Empty");
                return;
            }
            while(!isEmpty()){
                System.out.println(peek());
                remove();
            }
        }

    }

    public static void main(String[] args) {
        Queue q=new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.remove();
        q.remove();
        System.out.println(q.peek());
        System.out.println(q.arr[q.rear]);
        System.out.println(q.isEmpty());
        q.emptyQueue();
        System.out.println("The Queue is Empty: "+q.isEmpty());
        
    }
    
}
