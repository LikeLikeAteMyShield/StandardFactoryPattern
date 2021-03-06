package com.jonnyc.standard_factory;

import com.jonnyc.standard_factory.model.*;

public class ShapeFactory {

    public Shape getShape(String shape){

        if(shape == null)
            return null;

        if(shape.equalsIgnoreCase("CIRCLE"))
            return new Circle();

        else if(shape.equalsIgnoreCase("SQUARE"))
            return new Square();

        else if(shape.equalsIgnoreCase("RECTANGLE"))
            return new Rectangle();

        return null;
    }
}
