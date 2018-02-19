class Sub extends Super {
    
    public String doAction() {
        System.out.println("Did an action");
        return "Action performed";
    }

    public static void main(String[] args)
	{
		// class is abstract you can't instantiate it
        //Super super = new Super();
        
        Sub s = new Sub();
        s.doAction2();
	}
}
