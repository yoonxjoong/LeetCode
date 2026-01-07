class MyQueue {

    private Stack<Integer> inputStack;
    private Stack<Integer> outputStack;

    public MyQueue() {
        inputStack = new Stack<>();
        outputStack = new Stack<>();
    }
    
    public void push(int x) {
        this.inputStack.push(x);
    }
    
    public int pop() {

        while(!this.inputStack.isEmpty()) {
            int value = this.inputStack.pop();
            this.outputStack.push(value);
        }

        int ret = this.outputStack.pop();

        while(!this.outputStack.isEmpty()) {
            int value = this.outputStack.pop();
            this.inputStack.push(value);
        }

        return ret;
    }
    
    public int peek() {
        while(!this.inputStack.isEmpty()) {
            int value = this.inputStack.pop();
            this.outputStack.push(value);
        }

        int ret = this.outputStack.peek();

        while(!this.outputStack.isEmpty()) {
            int value = this.outputStack.pop();
            this.inputStack.push(value);
        }

        return ret;
    }
    
    public boolean empty() {
        return inputStack.empty();
    }
}