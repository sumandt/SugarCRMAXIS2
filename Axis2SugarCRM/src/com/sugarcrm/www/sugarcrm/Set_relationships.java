
/**
 * Set_relationships.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.3  Built on : Nov 12, 2010 (02:25:00 CET)
 */
            
                package com.sugarcrm.www.sugarcrm;
            

            /**
            *  Set_relationships bean class
            */
        
        public  class Set_relationships
        implements org.apache.axis2.databinding.ADBBean{
        
                public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://www.sugarcrm.com/sugarcrm",
                "set_relationships",
                "ns3");

            

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://www.sugarcrm.com/sugarcrm")){
                return "ns3";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        

                        /**
                        * field for Session
                        */

                        
                                    protected java.lang.String localSession ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getSession(){
                               return localSession;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Session
                               */
                               public void setSession(java.lang.String param){
                            
                                            this.localSession=param;
                                    

                               }
                            

                        /**
                        * field for Module_names
                        */

                        
                                    protected com.sugarcrm.www.sugarcrm.Select_fields localModule_names ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.sugarcrm.www.sugarcrm.Select_fields
                           */
                           public  com.sugarcrm.www.sugarcrm.Select_fields getModule_names(){
                               return localModule_names;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Module_names
                               */
                               public void setModule_names(com.sugarcrm.www.sugarcrm.Select_fields param){
                            
                                            this.localModule_names=param;
                                    

                               }
                            

                        /**
                        * field for Module_ids
                        */

                        
                                    protected com.sugarcrm.www.sugarcrm.Select_fields localModule_ids ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.sugarcrm.www.sugarcrm.Select_fields
                           */
                           public  com.sugarcrm.www.sugarcrm.Select_fields getModule_ids(){
                               return localModule_ids;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Module_ids
                               */
                               public void setModule_ids(com.sugarcrm.www.sugarcrm.Select_fields param){
                            
                                            this.localModule_ids=param;
                                    

                               }
                            

                        /**
                        * field for Link_field_names
                        */

                        
                                    protected com.sugarcrm.www.sugarcrm.Select_fields localLink_field_names ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.sugarcrm.www.sugarcrm.Select_fields
                           */
                           public  com.sugarcrm.www.sugarcrm.Select_fields getLink_field_names(){
                               return localLink_field_names;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Link_field_names
                               */
                               public void setLink_field_names(com.sugarcrm.www.sugarcrm.Select_fields param){
                            
                                            this.localLink_field_names=param;
                                    

                               }
                            

                        /**
                        * field for Related_ids
                        */

                        
                                    protected com.sugarcrm.www.sugarcrm.New_set_relationhip_ids localRelated_ids ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.sugarcrm.www.sugarcrm.New_set_relationhip_ids
                           */
                           public  com.sugarcrm.www.sugarcrm.New_set_relationhip_ids getRelated_ids(){
                               return localRelated_ids;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Related_ids
                               */
                               public void setRelated_ids(com.sugarcrm.www.sugarcrm.New_set_relationhip_ids param){
                            
                                            this.localRelated_ids=param;
                                    

                               }
                            

                        /**
                        * field for Name_value_lists
                        */

                        
                                    protected com.sugarcrm.www.sugarcrm.Name_value_lists localName_value_lists ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.sugarcrm.www.sugarcrm.Name_value_lists
                           */
                           public  com.sugarcrm.www.sugarcrm.Name_value_lists getName_value_lists(){
                               return localName_value_lists;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Name_value_lists
                               */
                               public void setName_value_lists(com.sugarcrm.www.sugarcrm.Name_value_lists param){
                            
                                            this.localName_value_lists=param;
                                    

                               }
                            

                        /**
                        * field for Delete_array
                        */

                        
                                    protected com.sugarcrm.www.sugarcrm.Deleted_array localDelete_array ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.sugarcrm.www.sugarcrm.Deleted_array
                           */
                           public  com.sugarcrm.www.sugarcrm.Deleted_array getDelete_array(){
                               return localDelete_array;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Delete_array
                               */
                               public void setDelete_array(com.sugarcrm.www.sugarcrm.Deleted_array param){
                            
                                            this.localDelete_array=param;
                                    

                               }
                            

     /**
     * isReaderMTOMAware
     * @return true if the reader supports MTOM
     */
   public static boolean isReaderMTOMAware(javax.xml.stream.XMLStreamReader reader) {
        boolean isReaderMTOMAware = false;
        
        try{
          isReaderMTOMAware = java.lang.Boolean.TRUE.equals(reader.getProperty(org.apache.axiom.om.OMConstants.IS_DATA_HANDLERS_AWARE));
        }catch(java.lang.IllegalArgumentException e){
          isReaderMTOMAware = false;
        }
        return isReaderMTOMAware;
   }
     
     
        /**
        *
        * @param parentQName
        * @param factory
        * @return org.apache.axiom.om.OMElement
        */
       public org.apache.axiom.om.OMElement getOMElement (
               final javax.xml.namespace.QName parentQName,
               final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{


        
                org.apache.axiom.om.OMDataSource dataSource =
                       new org.apache.axis2.databinding.ADBDataSource(this,MY_QNAME){

                 public void serialize(org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
                       Set_relationships.this.serialize(MY_QNAME,factory,xmlWriter);
                 }
               };
               return new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(
               MY_QNAME,factory,dataSource);
            
       }

         public void serialize(final javax.xml.namespace.QName parentQName,
                                       final org.apache.axiom.om.OMFactory factory,
                                       org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter)
                                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
                           serialize(parentQName,factory,xmlWriter,false);
         }

         public void serialize(final javax.xml.namespace.QName parentQName,
                               final org.apache.axiom.om.OMFactory factory,
                               org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter,
                               boolean serializeType)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
            
                


                java.lang.String prefix = null;
                java.lang.String namespace = null;
                

                    prefix = parentQName.getPrefix();
                    namespace = parentQName.getNamespaceURI();

                    if ((namespace != null) && (namespace.trim().length() > 0)) {
                        java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
                        if (writerPrefix != null) {
                            xmlWriter.writeStartElement(namespace, parentQName.getLocalPart());
                        } else {
                            if (prefix == null) {
                                prefix = generatePrefix(namespace);
                            }

                            xmlWriter.writeStartElement(prefix, parentQName.getLocalPart(), namespace);
                            xmlWriter.writeNamespace(prefix, namespace);
                            xmlWriter.setPrefix(prefix, namespace);
                        }
                    } else {
                        xmlWriter.writeStartElement(parentQName.getLocalPart());
                    }
                
                  if (serializeType){
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://www.sugarcrm.com/sugarcrm");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":set_relationships",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "set_relationships",
                           xmlWriter);
                   }

               
                   }
               
                                    namespace = "";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"session", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"session");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("session");
                                    }
                                

                                          if (localSession==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("session cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localSession);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                            if (localModule_names==null){
                                                 throw new org.apache.axis2.databinding.ADBException("module_names cannot be null!!");
                                            }
                                           localModule_names.serialize(new javax.xml.namespace.QName("","module_names"),
                                               factory,xmlWriter);
                                        
                                            if (localModule_ids==null){
                                                 throw new org.apache.axis2.databinding.ADBException("module_ids cannot be null!!");
                                            }
                                           localModule_ids.serialize(new javax.xml.namespace.QName("","module_ids"),
                                               factory,xmlWriter);
                                        
                                            if (localLink_field_names==null){
                                                 throw new org.apache.axis2.databinding.ADBException("link_field_names cannot be null!!");
                                            }
                                           localLink_field_names.serialize(new javax.xml.namespace.QName("","link_field_names"),
                                               factory,xmlWriter);
                                        
                                            if (localRelated_ids==null){
                                                 throw new org.apache.axis2.databinding.ADBException("related_ids cannot be null!!");
                                            }
                                           localRelated_ids.serialize(new javax.xml.namespace.QName("","related_ids"),
                                               factory,xmlWriter);
                                        
                                            if (localName_value_lists==null){
                                                 throw new org.apache.axis2.databinding.ADBException("name_value_lists cannot be null!!");
                                            }
                                           localName_value_lists.serialize(new javax.xml.namespace.QName("","name_value_lists"),
                                               factory,xmlWriter);
                                        
                                            if (localDelete_array==null){
                                                 throw new org.apache.axis2.databinding.ADBException("delete_array cannot be null!!");
                                            }
                                           localDelete_array.serialize(new javax.xml.namespace.QName("","delete_array"),
                                               factory,xmlWriter);
                                        
                    xmlWriter.writeEndElement();
               

        }

         /**
          * Util method to write an attribute with the ns prefix
          */
          private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                                      java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
              if (xmlWriter.getPrefix(namespace) == null) {
                       xmlWriter.writeNamespace(prefix, namespace);
                       xmlWriter.setPrefix(prefix, namespace);

              }

              xmlWriter.writeAttribute(namespace,attName,attValue);

         }

        /**
          * Util method to write an attribute without the ns prefix
          */
          private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                                      java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
                if (namespace.equals(""))
              {
                  xmlWriter.writeAttribute(attName,attValue);
              }
              else
              {
                  registerPrefix(xmlWriter, namespace);
                  xmlWriter.writeAttribute(namespace,attName,attValue);
              }
          }


           /**
             * Util method to write an attribute without the ns prefix
             */
            private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                             javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

                java.lang.String attributeNamespace = qname.getNamespaceURI();
                java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
                if (attributePrefix == null) {
                    attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
                }
                java.lang.String attributeValue;
                if (attributePrefix.trim().length() > 0) {
                    attributeValue = attributePrefix + ":" + qname.getLocalPart();
                } else {
                    attributeValue = qname.getLocalPart();
                }

                if (namespace.equals("")) {
                    xmlWriter.writeAttribute(attName, attributeValue);
                } else {
                    registerPrefix(xmlWriter, namespace);
                    xmlWriter.writeAttribute(namespace, attName, attributeValue);
                }
            }
        /**
         *  method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }

                if (prefix.trim().length() > 0){
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix,namespaceURI);
                        }

                        if (prefix.trim().length() > 0){
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


         /**
         * Register a namespace prefix
         */
         private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
                java.lang.String prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = generatePrefix(namespace);

                    while (xmlWriter.getNamespaceContext().getNamespaceURI(prefix) != null) {
                        prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                    }

                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);
                }

                return prefix;
            }


  
        /**
        * databinding method to get an XML representation of this object
        *
        */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                    throws org.apache.axis2.databinding.ADBException{


        
                 java.util.ArrayList elementList = new java.util.ArrayList();
                 java.util.ArrayList attribList = new java.util.ArrayList();

                
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "session"));
                                 
                                        if (localSession != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSession));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("session cannot be null!!");
                                        }
                                    
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "module_names"));
                            
                            
                                    if (localModule_names==null){
                                         throw new org.apache.axis2.databinding.ADBException("module_names cannot be null!!");
                                    }
                                    elementList.add(localModule_names);
                                
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "module_ids"));
                            
                            
                                    if (localModule_ids==null){
                                         throw new org.apache.axis2.databinding.ADBException("module_ids cannot be null!!");
                                    }
                                    elementList.add(localModule_ids);
                                
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "link_field_names"));
                            
                            
                                    if (localLink_field_names==null){
                                         throw new org.apache.axis2.databinding.ADBException("link_field_names cannot be null!!");
                                    }
                                    elementList.add(localLink_field_names);
                                
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "related_ids"));
                            
                            
                                    if (localRelated_ids==null){
                                         throw new org.apache.axis2.databinding.ADBException("related_ids cannot be null!!");
                                    }
                                    elementList.add(localRelated_ids);
                                
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "name_value_lists"));
                            
                            
                                    if (localName_value_lists==null){
                                         throw new org.apache.axis2.databinding.ADBException("name_value_lists cannot be null!!");
                                    }
                                    elementList.add(localName_value_lists);
                                
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "delete_array"));
                            
                            
                                    if (localDelete_array==null){
                                         throw new org.apache.axis2.databinding.ADBException("delete_array cannot be null!!");
                                    }
                                    elementList.add(localDelete_array);
                                

                return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
            
            

        }

  

     /**
      *  Factory class that keeps the parse method
      */
    public static class Factory{

        
        

        /**
        * static method to create the object
        * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
        *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
        * Postcondition: If this object is an element, the reader is positioned at its end element
        *                If this object is a complex type, the reader is positioned at the end element of its outer element
        */
        public static Set_relationships parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            Set_relationships object =
                new Set_relationships();

            int event;
            java.lang.String nillableValue = null;
            java.lang.String prefix ="";
            java.lang.String namespaceuri ="";
            try {
                
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                
                if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
                  java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                        "type");
                  if (fullTypeName!=null){
                    java.lang.String nsPrefix = null;
                    if (fullTypeName.indexOf(":") > -1){
                        nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
                    }
                    nsPrefix = nsPrefix==null?"":nsPrefix;

                    java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
                    
                            if (!"set_relationships".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (Set_relationships)com.sugarcrm.www.sugarcrm.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                 
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","session").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSession(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","module_names").equals(reader.getName())){
                                
                                                object.setModule_names(com.sugarcrm.www.sugarcrm.Select_fields.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","module_ids").equals(reader.getName())){
                                
                                                object.setModule_ids(com.sugarcrm.www.sugarcrm.Select_fields.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","link_field_names").equals(reader.getName())){
                                
                                                object.setLink_field_names(com.sugarcrm.www.sugarcrm.Select_fields.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","related_ids").equals(reader.getName())){
                                
                                                object.setRelated_ids(com.sugarcrm.www.sugarcrm.New_set_relationhip_ids.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","name_value_lists").equals(reader.getName())){
                                
                                                object.setName_value_lists(com.sugarcrm.www.sugarcrm.Name_value_lists.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","delete_array").equals(reader.getName())){
                                
                                                object.setDelete_array(com.sugarcrm.www.sugarcrm.Deleted_array.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                              
                            while (!reader.isStartElement() && !reader.isEndElement())
                                reader.next();
                            
                                if (reader.isStartElement())
                                // A start element we are not expecting indicates a trailing invalid property
                                throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                            



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
          