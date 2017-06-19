package UsfDemo;

public class DynamicStack {
	
	private int stackSize;
	private int[] stackArr;
	private int top;
	
	public DynamicStack(int size) {
		this.stackSize = size;
		this.stackArr = new int[size];
		this.top = -1;
	}
	
	public boolean isStackFull() {
		return (top == stackSize - 1);
	}
	
	public boolean isStackEmaty() {
		return (top == -1);
	}
	
	public void push(int element) {
		if(isStackFull()) {
			System.out.println("Stack is full, increase size!");
			doubleStackSize();
		}
		System.out.println("Add element: " + element);
		this.stackArr[++top] = element;
	}
	
	public int pop() throws Exception {
		if(isStackEmaty()) {
			throw new Exception("Stack is empty. Can not remove element.");
		}
		System.out.println("Remove element: " + this.stackArr[top]);
		return this.stackArr[top--];
	}
	
	public int peek() {
		return this.stackArr[top];
	}
	public void doubleStackSize() {
		int[] newStack = new int[this.stackSize * 2];
		for (int i = 0; i < this.stackSize; i++) {
			newStack[i] = this.stackArr[i];
		}
		
		this.stackArr = newStack;
		this.stackSize *= 2;
	}
	public static void main(String[] args) {
		DynamicStack stack = new DynamicStack(2);
        for(int i=0;i<10;i++){
            stack.push(i);
        }
        
        for(int i=0;i<4;i++){
            try {
                stack.pop();
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
	}
	
}
