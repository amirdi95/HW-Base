//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.04 at 05:00:58 PM IST 
//
package il.ac.bgu.cs.formalmethodsintro.base.goal;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for anonymous complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Formula" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Alphabet">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Proposition" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="StateSet">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="State" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Label" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Y" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                             &lt;element name="X" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *                             &lt;element name="Properties" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="sid" type="{http://www.w3.org/2001/XMLSchema}long" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="InitialStateSet">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="StateID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TransitionSet">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Transition" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="From" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                             &lt;element name="To" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                             &lt;element name="Label" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Properties" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="tid" type="{http://www.w3.org/2001/XMLSchema}short" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="complete" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Acc">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="StateID" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Properties" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *       &lt;attribute name="label-on" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"name", "description", "formula", "alphabet", "stateSet", "initialStateSet", "transitionSet", "acc", "properties"})
@XmlRootElement(name = "Structure")
public class GoalStructure {

    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Description", required = true)
    protected String description;
    @XmlElement(name = "Formula", required = true)
    protected String formula;
    @XmlElement(name = "Alphabet", required = true)
    protected GoalStructure.Alphabet alphabet;
    @XmlElement(name = "StateSet", required = true)
    protected GoalStructure.StateSet stateSet;
    @XmlElement(name = "InitialStateSet", required = true)
    protected GoalStructure.InitialStateSet initialStateSet;
    @XmlElement(name = "TransitionSet", required = true)
    protected GoalStructure.TransitionSet transitionSet;
    @XmlElement(name = "Acc", required = true)
    protected GoalStructure.Acc acc;
    @XmlElement(name = "Properties", required = true)
    protected String properties;
    @XmlAttribute(name = "label-on")
    protected String labelOn;
    @XmlAttribute(name = "type")
    protected String type;

    /**
     * Gets the value of the name property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the description property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the formula property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getFormula() {
        return formula;
    }

    /**
     * Sets the value of the formula property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setFormula(String value) {
        this.formula = value;
    }

    /**
     * Gets the value of the alphabet property.
     *
     * @return possible object is {@link GoalStructure.Alphabet }
     *
     */
    public GoalStructure.Alphabet getAlphabet() {
        return alphabet;
    }

    /**
     * Sets the value of the alphabet property.
     *
     * @param value allowed object is {@link GoalStructure.Alphabet }
     *
     */
    public void setAlphabet(GoalStructure.Alphabet value) {
        this.alphabet = value;
    }

    /**
     * Gets the value of the stateSet property.
     *
     * @return possible object is {@link GoalStructure.StateSet }
     *
     */
    public GoalStructure.StateSet getStateSet() {
        return stateSet;
    }

    /**
     * Sets the value of the stateSet property.
     *
     * @param value allowed object is {@link GoalStructure.StateSet }
     *
     */
    public void setStateSet(GoalStructure.StateSet value) {
        this.stateSet = value;
    }

    /**
     * Gets the value of the initialStateSet property.
     *
     * @return possible object is {@link GoalStructure.InitialStateSet }
     *
     */
    public GoalStructure.InitialStateSet getInitialStateSet() {
        return initialStateSet;
    }

    /**
     * Sets the value of the initialStateSet property.
     *
     * @param value allowed object is {@link GoalStructure.InitialStateSet }
     *
     */
    public void setInitialStateSet(GoalStructure.InitialStateSet value) {
        this.initialStateSet = value;
    }

    /**
     * Gets the value of the transitionSet property.
     *
     * @return possible object is {@link GoalStructure.TransitionSet }
     *
     */
    public GoalStructure.TransitionSet getTransitionSet() {
        return transitionSet;
    }

    /**
     * Sets the value of the transitionSet property.
     *
     * @param value allowed object is {@link GoalStructure.TransitionSet }
     *
     */
    public void setTransitionSet(GoalStructure.TransitionSet value) {
        this.transitionSet = value;
    }

    /**
     * Gets the value of the acc property.
     *
     * @return possible object is {@link GoalStructure.Acc }
     *
     */
    public GoalStructure.Acc getAcc() {
        return acc;
    }

    /**
     * Sets the value of the acc property.
     *
     * @param value allowed object is {@link GoalStructure.Acc }
     *
     */
    public void setAcc(GoalStructure.Acc value) {
        this.acc = value;
    }

    /**
     * Gets the value of the properties property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getProperties() {
        return properties;
    }

    /**
     * Sets the value of the properties property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setProperties(String value) {
        this.properties = value;
    }

    /**
     * Gets the value of the labelOn property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getLabelOn() {
        return labelOn;
    }

    /**
     * Sets the value of the labelOn property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setLabelOn(String value) {
        this.labelOn = value;
    }

    /**
     * Gets the value of the type property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * <p>
     * Java class for anonymous complex type.
     *
     * <p>
     * The following schema fragment specifies the expected content contained
     * within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="StateID" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {"stateID"})
    public static class Acc {

        @XmlElement(name = "StateID", type = long.class)
        protected List<Long> stateID;
        @XmlAttribute(name = "type")
        protected String type;

        /**
         * Gets the value of the stateID property.
         *
         * <p>
         * This accessor method returns a reference to the live list, not a
         * snapshot. Therefore any modification you make to the returned list
         * will be present inside the JAXB object. This is why there is not a
         * <CODE>set</CODE> method for the stateID property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         *
         * <pre>
         * getStateID().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list {@link long
         * }
         *
         *
         */
        public List<Long> getStateID() {
            if (stateID == null) {
                stateID = new ArrayList<Long>();
            }
            return this.stateID;
        }

        /**
         * Gets the value of the type property.
         *
         * @return possible object is {@link String }
         *
         */
        public String getType() {
            return type;
        }

        /**
         * Sets the value of the type property.
         *
         * @param value allowed object is {@link String }
         *
         */
        public void setType(String value) {
            this.type = value;
        }

    }

    /**
     * <p>
     * Java class for anonymous complex type.
     *
     * <p>
     * The following schema fragment specifies the expected content contained
     * within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Proposition" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {"proposition"})
    public static class Alphabet {

        @XmlElement(name = "Proposition")
        protected List<String> proposition;
        @XmlAttribute(name = "type")
        protected String type;

        /**
         * Gets the value of the proposition property.
         *
         * <p>
         * This accessor method returns a reference to the live list, not a
         * snapshot. Therefore any modification you make to the returned list
         * will be present inside the JAXB object. This is why there is not a
         * <CODE>set</CODE> method for the proposition property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         *
         * <pre>
         * getProposition().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
		 * {@link String }
         *
         *
         */
        public List<String> getProposition() {
            if (proposition == null) {
                proposition = new ArrayList<String>();
            }
            return this.proposition;
        }

        /**
         * Gets the value of the type property.
         *
         * @return possible object is {@link String }
         *
         */
        public String getType() {
            return type;
        }

        /**
         * Sets the value of the type property.
         *
         * @param value allowed object is {@link String }
         *
         */
        public void setType(String value) {
            this.type = value;
        }

    }

    /**
     * <p>
     * Java class for anonymous complex type.
     *
     * <p>
     * The following schema fragment specifies the expected content contained
     * within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="StateID" type="{http://www.w3.org/2001/XMLSchema}long"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {"stateID"})
    public static class InitialStateSet {

        @XmlElement(name = "StateID")
        protected long stateID;

        /**
         * Gets the value of the stateID property.
         *
         */
        public long getStateID() {
            return stateID;
        }

        /**
         * Sets the value of the stateID property.
         *
         */
        public void setStateID(long value) {
            this.stateID = value;
        }

    }

    /**
     * <p>
     * Java class for anonymous complex type.
     *
     * <p>
     * The following schema fragment specifies the expected content contained
     * within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="State" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Label" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Y" type="{http://www.w3.org/2001/XMLSchema}long"/>
     *                   &lt;element name="X" type="{http://www.w3.org/2001/XMLSchema}short"/>
     *                   &lt;element name="Properties" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="sid" type="{http://www.w3.org/2001/XMLSchema}long" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {"state"})
    public static class StateSet {

        @XmlElement(name = "State")
        protected List<GoalStructure.StateSet.State> state;

        /**
         * Gets the value of the state property.
         *
         * <p>
         * This accessor method returns a reference to the live list, not a
         * snapshot. Therefore any modification you make to the returned list
         * will be present inside the JAXB object. This is why there is not a
         * <CODE>set</CODE> method for the state property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         *
         * <pre>
         * getState().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
		 * {@link GoalStructure.StateSet.State }
         *
         *
         */
        public List<GoalStructure.StateSet.State> getState() {
            if (state == null) {
                state = new ArrayList<GoalStructure.StateSet.State>();
            }
            return this.state;
        }

        /**
         * <p>
         * Java class for anonymous complex type.
         *
         * <p>
         * The following schema fragment specifies the expected content
         * contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="Label" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Y" type="{http://www.w3.org/2001/XMLSchema}long"/>
         *         &lt;element name="X" type="{http://www.w3.org/2001/XMLSchema}short"/>
         *         &lt;element name="Properties" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *       &lt;attribute name="sid" type="{http://www.w3.org/2001/XMLSchema}long" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {"label", "y", "x", "properties"})
        public static class State {

            @XmlElement(name = "Label", required = true)
            protected String label;
            @XmlElement(name = "Y")
            protected long y;
            @XmlElement(name = "X")
            protected short x;
            @XmlElement(name = "Properties", required = true)
            protected String properties;
            @XmlAttribute(name = "sid")
            protected Long sid;

            @Override
            public int hashCode() {
                final int prime = 31;
                int result = 1;
                result = prime * result + ((sid == null) ? 0 : sid.hashCode());
                return result;
            }

            @Override
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null) {
                    return false;
                }
                if (getClass() != obj.getClass()) {
                    return false;
                }
                State other = (State) obj;
                if (sid == null) {
                    if (other.sid != null) {
                        return false;
                    }
                } else if (!sid.equals(other.sid)) {
                    return false;
                }
                return true;
            }

            /**
             * Gets the value of the label property.
             *
             * @return possible object is {@link String }
             *
             */
            public String getLabel() {
                return label;
            }

            /**
             * Sets the value of the label property.
             *
             * @param value allowed object is {@link String }
             *
             */
            public void setLabel(String value) {
                this.label = value;
            }

            /**
             * Gets the value of the y property.
             *
             */
            public long getY() {
                return y;
            }

            /**
             * Sets the value of the y property.
             *
             */
            public void setY(long value) {
                this.y = value;
            }

            /**
             * Gets the value of the x property.
             *
             */
            public short getX() {
                return x;
            }

            /**
             * Sets the value of the x property.
             *
             */
            public void setX(short value) {
                this.x = value;
            }

            /**
             * Gets the value of the properties property.
             *
             * @return possible object is {@link String }
             *
             */
            public String getProperties() {
                return properties;
            }

            /**
             * Sets the value of the properties property.
             *
             * @param value allowed object is {@link String }
             *
             */
            public void setProperties(String value) {
                this.properties = value;
            }

            /**
             * Gets the value of the sid property.
             *
             * @return possible object is {@link long }
             *
             */
            public Long getSid() {
                return sid;
            }

            /**
             * Sets the value of the sid property.
             *
             * @param value allowed object is {@link long }
             *
             */
            public void setSid(Long value) {
                this.sid = value;
            }

        }

    }

    /**
     * <p>
     * Java class for anonymous complex type.
     *
     * <p>
     * The following schema fragment specifies the expected content contained
     * within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Transition" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="From" type="{http://www.w3.org/2001/XMLSchema}long"/>
     *                   &lt;element name="To" type="{http://www.w3.org/2001/XMLSchema}long"/>
     *                   &lt;element name="Label" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Properties" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="tid" type="{http://www.w3.org/2001/XMLSchema}short" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="complete" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {"transition"})
    public static class TransitionSet {

        @XmlElement(name = "Transition")
        protected List<GoalStructure.TransitionSet.Transition> transition;
        @XmlAttribute(name = "complete")
        protected String complete;

        /**
         * Gets the value of the transition property.
         *
         * <p>
         * This accessor method returns a reference to the live list, not a
         * snapshot. Therefore any modification you make to the returned list
         * will be present inside the JAXB object. This is why there is not a
         * <CODE>set</CODE> method for the transition property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         *
         * <pre>
         * getTransition().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
		 * {@link GoalStructure.TransitionSet.Transition }
         *
         *
         */
        public List<GoalStructure.TransitionSet.Transition> getTransition() {
            if (transition == null) {
                transition = new ArrayList<GoalStructure.TransitionSet.Transition>();
            }
            return this.transition;
        }

        /**
         * Gets the value of the complete property.
         *
         * @return possible object is {@link String }
         *
         */
        public String getComplete() {
            return complete;
        }

        /**
         * Sets the value of the complete property.
         *
         * @param value allowed object is {@link String }
         *
         */
        public void setComplete(String value) {
            this.complete = value;
        }

        /**
         * <p>
         * Java class for anonymous complex type.
         *
         * <p>
         * The following schema fragment specifies the expected content
         * contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="From" type="{http://www.w3.org/2001/XMLSchema}long"/>
         *         &lt;element name="To" type="{http://www.w3.org/2001/XMLSchema}long"/>
         *         &lt;element name="Label" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Properties" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *       &lt;attribute name="tid" type="{http://www.w3.org/2001/XMLSchema}short" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {"from", "to", "label", "properties"})
        public static class Transition {

            @Override
            public String toString() {
                return "Transition [from=" + from + ", to=" + to + ", label=" + label + ", properties=" + properties
                        + "]";
            }

            @XmlElement(name = "From")
            protected Long from;
            @XmlElement(name = "To")
            protected Long to;
            @XmlElement(name = "Label", required = true)
            protected String label;
            @XmlElement(name = "Properties", required = true)
            protected String properties;
            @XmlAttribute(name = "tid")
            protected Long tid;

            /**
             * Gets the value of the from property.
             *
             */
            public Long getFrom() {
                return from;
            }

            /**
             * Sets the value of the from property.
             *
             */
            public void setFrom(Long value) {
                this.from = value;
            }

            /**
             * Gets the value of the to property.
             *
             */
            public long getTo() {
                return to;
            }

            /**
             * Sets the value of the to property.
             *
             */
            public void setTo(long value) {
                this.to = value;
            }

            /**
             * Gets the value of the label property.
             *
             * @return possible object is {@link String }
             *
             */
            public String getLabel() {
                return label;
            }

            /**
             * Sets the value of the label property.
             *
             * @param value allowed object is {@link String }
             *
             */
            public void setLabel(String value) {
                this.label = value;
            }

            /**
             * Gets the value of the properties property.
             *
             * @return possible object is {@link String }
             *
             */
            public String getProperties() {
                return properties;
            }

            /**
             * Sets the value of the properties property.
             *
             * @param value allowed object is {@link String }
             *
             */
            public void setProperties(String value) {
                this.properties = value;
            }

            /**
             * Gets the value of the tid property.
             *
             * @return possible object is {@link Short }
             *
             */
            public Long getTid() {
                return tid;
            }

            /**
             * Sets the value of the tid property.
             *
             * @param value allowed object is {@link Short }
             *
             */
            public void setTid(Long value) {
                this.tid = value;
            }

        }

    }

}
