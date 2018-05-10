/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorypattern;

/**
 *
 * @author alu20490610w
 */
public class FactoryPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        
        Shape shape1 = factory.getShape("CIRCLE");
        shape1.draw();
        System.out.println(shape1);
        
        Shape shape2 = factory.getShape("RECTANGLE");
        shape1.draw();
        System.out.println(shape1);
        
        Shape shape3 = factory.getShape("SQUARE");
        shape1.draw();
        System.out.println(shape1);
    }
    
}
