interface Bounceable {

    public void setBounceFactor(int factor);

    public void bounce();

    /* Inteface can not have private methods Causes compiler error */
    /* Bounceable.java:#: error: modifier private not allowed here */
    /* private void bounce2(); */
}