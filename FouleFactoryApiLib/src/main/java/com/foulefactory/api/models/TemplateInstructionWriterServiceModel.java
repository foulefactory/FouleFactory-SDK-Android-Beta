/*
 * FouleFactoryApiLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ) on 09/16/2016
 */
package com.foulefactory.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class TemplateInstructionWriterServiceModel 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 4781351110123810013L;
    private String instruction;
    private int order;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Instruction")
    public String getInstruction ( ) { 
        return this.instruction;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Instruction")
    public void setInstruction (String value) { 
        this.instruction = value;
        notifyObservers(this.instruction);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Order")
    public int getOrder ( ) { 
        return this.order;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Order")
    public void setOrder (int value) { 
        this.order = value;
        notifyObservers(this.order);
    }
 
}
 