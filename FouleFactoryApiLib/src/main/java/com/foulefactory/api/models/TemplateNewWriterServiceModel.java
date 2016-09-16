/*
 * FouleFactoryApiLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ) on 09/16/2016
 */
package com.foulefactory.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class TemplateNewWriterServiceModel 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 5650891176478179334L;
    private int idProjectType;
    private String title;
    private String description;
    private List<TemplateInstructionWriterServiceModel> instructions;
    private List<TemplateColumnWriterServiceModel> columns;
    private List<TemplateQuestionWriterServiceModel> questions;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("IdProjectType")
    public int getIdProjectType ( ) { 
        return this.idProjectType;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("IdProjectType")
    public void setIdProjectType (int value) { 
        this.idProjectType = value;
        notifyObservers(this.idProjectType);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Title")
    public String getTitle ( ) { 
        return this.title;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Title")
    public void setTitle (String value) { 
        this.title = value;
        notifyObservers(this.title);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Description")
    public String getDescription ( ) { 
        return this.description;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Description")
    public void setDescription (String value) { 
        this.description = value;
        notifyObservers(this.description);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Instructions")
    public List<TemplateInstructionWriterServiceModel> getInstructions ( ) { 
        return this.instructions;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Instructions")
    public void setInstructions (List<TemplateInstructionWriterServiceModel> value) { 
        this.instructions = value;
        notifyObservers(this.instructions);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Columns")
    public List<TemplateColumnWriterServiceModel> getColumns ( ) { 
        return this.columns;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Columns")
    public void setColumns (List<TemplateColumnWriterServiceModel> value) { 
        this.columns = value;
        notifyObservers(this.columns);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Questions")
    public List<TemplateQuestionWriterServiceModel> getQuestions ( ) { 
        return this.questions;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Questions")
    public void setQuestions (List<TemplateQuestionWriterServiceModel> value) { 
        this.questions = value;
        notifyObservers(this.questions);
    }
 
}
 