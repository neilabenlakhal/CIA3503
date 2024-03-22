/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decoratordpex6;

/**
 *
 */
public class WindowDecorator implements Window { //step 0

    protected Window wrappee; //step 1

    public WindowDecorator(Window wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public void draw() { //behavior to be changed
        wrappee.draw();

    }

    @Override
    public String getDescription() { //behavior to be changed
        return wrappee.getDescription();
    }

}
