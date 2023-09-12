abstract class data_structure{
    int[] data;

    abstract int getData(int index);
    abstract void putData(int index, int dataEle);
}

class my_stack extends data_structure{
	int top;

	my_stack(){
		top=-1;
		data = new int[5];
	}

	@Override
    int getData(int index){
		top--;
        return data[index];
    }

	@Override
    void putData(int index, int dataEle){
		top++;
		data[++index] = dataEle;
    }

	void push(int n){
		if(top==data.length-1){
			System.out.println("Stack Overflow");
			System.exit(0);
		}
		else
			putData(top, n);
	}

	void pop(){
		if(top==-1){
			System.out.println("Stack Underflow");
			System.exit(0);
		}
		else{
			System.out.println(getData(top)+" removed sucessfully");
			data[++top] = 0;
		}
	}

	void display(){
		System.out.println("Current Stack Data:");
		for(int i=data.length-1;i>=0;i--)
			System.out.println(data[i]);
		System.out.println();
	}
}

class my_queue extends data_structure{
	int front, rear;

	my_queue(){
		front = 0;
		rear = -1;
		data = new int[5];
	}

	@Override
	int getData(int index){
		front++;
        return data[index];
    }

	@Override
    void putData(int index, int dataEle){
		rear++;
		data[++index] = dataEle;
    }

	void add(int n){
		if(rear >= data.length)
			System.out.println("Queue Overflow");
		else
			putData(rear, n);
	}

	void remove(){			
		if(rear == -1){
			System.out.println("Queue Underflow");
			System.exit(0);
		}

		// reset queue
		else if(front == rear){
			front = 0;
			rear = -1;
		}

		// simply remove data
		else
			System.out.println(getData(front)+" removed sucessfully");
	}

	void display(){
		if(rear==-1){
			System.out.println("No Data in Queue");
		}
		else{
			System.out.println("Current Queue Data:");
			for(int i = front; i <= rear; i++)
				System.out.println("Queue [ "+i+" ] = "+ data[i]);
		}
	}
}

class Q3_a {
    public static void main(String[] args){
		my_stack s1 = new my_stack();
		s1.push(10);
		s1.push(20);
		s1.pop();
		s1. display();

		my_queue q1 = new my_queue();
		q1.add(40);
		q1.add(80);
		q1.remove();
		q1.display();
    }
}
