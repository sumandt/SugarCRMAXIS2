
/**
 * SugarsoapMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.3  Built on : Nov 12, 2010 (02:24:07 CET)
 */
        package com.sugarcrm.www.sugarcrm;

        /**
        *  SugarsoapMessageReceiverInOut message receiver
        */

        public class SugarsoapMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        SugarsoapSkeleton skel = (SugarsoapSkeleton)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){

        

            if("set_note_attachment".equals(methodName)){
                
                com.sugarcrm.www.sugarcrm.Set_note_attachmentResponse set_note_attachmentResponse1 = null;
	                        com.sugarcrm.www.sugarcrm.Set_note_attachment wrappedParam =
                                                             (com.sugarcrm.www.sugarcrm.Set_note_attachment)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.sugarcrm.www.sugarcrm.Set_note_attachment.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               set_note_attachmentResponse1 =
                                                   
                                                   
                                                         skel.set_note_attachment(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), set_note_attachmentResponse1, false);
                                    } else 

            if("logout".equals(methodName)){
                
                com.sugarcrm.www.sugarcrm.LogoutResponse logoutResponse3 = null;
	                        com.sugarcrm.www.sugarcrm.Logout wrappedParam =
                                                             (com.sugarcrm.www.sugarcrm.Logout)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.sugarcrm.www.sugarcrm.Logout.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               logoutResponse3 =
                                                   
                                                   
                                                         skel.logout(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), logoutResponse3, false);
                                    } else 

            if("get_user_id".equals(methodName)){
                
                com.sugarcrm.www.sugarcrm.Get_user_idResponse get_user_idResponse5 = null;
	                        com.sugarcrm.www.sugarcrm.Get_user_id wrappedParam =
                                                             (com.sugarcrm.www.sugarcrm.Get_user_id)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.sugarcrm.www.sugarcrm.Get_user_id.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               get_user_idResponse5 =
                                                   
                                                   
                                                         skel.get_user_id(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), get_user_idResponse5, false);
                                    } else 

            if("set_relationships".equals(methodName)){
                
                com.sugarcrm.www.sugarcrm.Set_relationshipsResponse set_relationshipsResponse7 = null;
	                        com.sugarcrm.www.sugarcrm.Set_relationships wrappedParam =
                                                             (com.sugarcrm.www.sugarcrm.Set_relationships)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.sugarcrm.www.sugarcrm.Set_relationships.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               set_relationshipsResponse7 =
                                                   
                                                   
                                                         skel.set_relationships(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), set_relationshipsResponse7, false);
                                    } else 

            if("set_entry".equals(methodName)){
                
                com.sugarcrm.www.sugarcrm.Set_entryResponse set_entryResponse9 = null;
	                        com.sugarcrm.www.sugarcrm.Set_entry wrappedParam =
                                                             (com.sugarcrm.www.sugarcrm.Set_entry)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.sugarcrm.www.sugarcrm.Set_entry.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               set_entryResponse9 =
                                                   
                                                   
                                                         skel.set_entry(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), set_entryResponse9, false);
                                    } else 

            if("get_available_modules".equals(methodName)){
                
                com.sugarcrm.www.sugarcrm.Get_available_modulesResponse get_available_modulesResponse11 = null;
	                        com.sugarcrm.www.sugarcrm.Get_available_modules wrappedParam =
                                                             (com.sugarcrm.www.sugarcrm.Get_available_modules)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.sugarcrm.www.sugarcrm.Get_available_modules.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               get_available_modulesResponse11 =
                                                   
                                                   
                                                         skel.get_available_modules(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), get_available_modulesResponse11, false);
                                    } else 

            if("login".equals(methodName)){
                
                com.sugarcrm.www.sugarcrm.LoginResponse loginResponse13 = null;
	                        com.sugarcrm.www.sugarcrm.Login wrappedParam =
                                                             (com.sugarcrm.www.sugarcrm.Login)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.sugarcrm.www.sugarcrm.Login.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               loginResponse13 =
                                                   
                                                   
                                                         skel.login(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), loginResponse13, false);
                                    } else 

            if("get_user_team_id".equals(methodName)){
                
                com.sugarcrm.www.sugarcrm.Get_user_team_idResponse get_user_team_idResponse15 = null;
	                        com.sugarcrm.www.sugarcrm.Get_user_team_id wrappedParam =
                                                             (com.sugarcrm.www.sugarcrm.Get_user_team_id)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.sugarcrm.www.sugarcrm.Get_user_team_id.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               get_user_team_idResponse15 =
                                                   
                                                   
                                                         skel.get_user_team_id(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), get_user_team_idResponse15, false);
                                    } else 

            if("get_document_revision".equals(methodName)){
                
                com.sugarcrm.www.sugarcrm.Get_document_revisionResponse get_document_revisionResponse17 = null;
	                        com.sugarcrm.www.sugarcrm.Get_document_revision wrappedParam =
                                                             (com.sugarcrm.www.sugarcrm.Get_document_revision)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.sugarcrm.www.sugarcrm.Get_document_revision.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               get_document_revisionResponse17 =
                                                   
                                                   
                                                         skel.get_document_revision(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), get_document_revisionResponse17, false);
                                    } else 

            if("get_entries_count".equals(methodName)){
                
                com.sugarcrm.www.sugarcrm.Get_entries_countResponse get_entries_countResponse19 = null;
	                        com.sugarcrm.www.sugarcrm.Get_entries_count wrappedParam =
                                                             (com.sugarcrm.www.sugarcrm.Get_entries_count)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.sugarcrm.www.sugarcrm.Get_entries_count.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               get_entries_countResponse19 =
                                                   
                                                   
                                                         skel.get_entries_count(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), get_entries_countResponse19, false);
                                    } else 

            if("get_module_fields".equals(methodName)){
                
                com.sugarcrm.www.sugarcrm.Get_module_fieldsResponse get_module_fieldsResponse21 = null;
	                        com.sugarcrm.www.sugarcrm.Get_module_fields wrappedParam =
                                                             (com.sugarcrm.www.sugarcrm.Get_module_fields)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.sugarcrm.www.sugarcrm.Get_module_fields.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               get_module_fieldsResponse21 =
                                                   
                                                   
                                                         skel.get_module_fields(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), get_module_fieldsResponse21, false);
                                    } else 

            if("set_relationship".equals(methodName)){
                
                com.sugarcrm.www.sugarcrm.Set_relationshipResponse set_relationshipResponse23 = null;
	                        com.sugarcrm.www.sugarcrm.Set_relationship wrappedParam =
                                                             (com.sugarcrm.www.sugarcrm.Set_relationship)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.sugarcrm.www.sugarcrm.Set_relationship.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               set_relationshipResponse23 =
                                                   
                                                   
                                                         skel.set_relationship(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), set_relationshipResponse23, false);
                                    } else 

            if("get_last_viewed".equals(methodName)){
                
                com.sugarcrm.www.sugarcrm.Get_last_viewedResponse get_last_viewedResponse25 = null;
	                        com.sugarcrm.www.sugarcrm.Get_last_viewed wrappedParam =
                                                             (com.sugarcrm.www.sugarcrm.Get_last_viewed)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.sugarcrm.www.sugarcrm.Get_last_viewed.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               get_last_viewedResponse25 =
                                                   
                                                   
                                                         skel.get_last_viewed(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), get_last_viewedResponse25, false);
                                    } else 

            if("set_campaign_merge".equals(methodName)){
                
                com.sugarcrm.www.sugarcrm.Set_campaign_mergeResponse set_campaign_mergeResponse27 = null;
	                        com.sugarcrm.www.sugarcrm.Set_campaign_merge wrappedParam =
                                                             (com.sugarcrm.www.sugarcrm.Set_campaign_merge)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.sugarcrm.www.sugarcrm.Set_campaign_merge.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               set_campaign_mergeResponse27 =
                                                   
                                                   
                                                         skel.set_campaign_merge(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), set_campaign_mergeResponse27, false);
                                    } else 

            if("search_by_module".equals(methodName)){
                
                com.sugarcrm.www.sugarcrm.Search_by_moduleResponse search_by_moduleResponse29 = null;
	                        com.sugarcrm.www.sugarcrm.Search_by_module wrappedParam =
                                                             (com.sugarcrm.www.sugarcrm.Search_by_module)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.sugarcrm.www.sugarcrm.Search_by_module.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               search_by_moduleResponse29 =
                                                   
                                                   
                                                         skel.search_by_module(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), search_by_moduleResponse29, false);
                                    } else 

            if("get_server_info".equals(methodName)){
                
                com.sugarcrm.www.sugarcrm.Get_server_infoResponse get_server_infoResponse31 = null;
	                        com.sugarcrm.www.sugarcrm.Get_server_info wrappedParam =
                                                             (com.sugarcrm.www.sugarcrm.Get_server_info)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.sugarcrm.www.sugarcrm.Get_server_info.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               get_server_infoResponse31 =
                                                   
                                                   
                                                         skel.get_server_info(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), get_server_infoResponse31, false);
                                    } else 

            if("get_module_fields_md5".equals(methodName)){
                
                com.sugarcrm.www.sugarcrm.Get_module_fields_md5Response get_module_fields_md5Response33 = null;
	                        com.sugarcrm.www.sugarcrm.Get_module_fields_md5 wrappedParam =
                                                             (com.sugarcrm.www.sugarcrm.Get_module_fields_md5)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.sugarcrm.www.sugarcrm.Get_module_fields_md5.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               get_module_fields_md5Response33 =
                                                   
                                                   
                                                         skel.get_module_fields_md5(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), get_module_fields_md5Response33, false);
                                    } else 

            if("set_document_revision".equals(methodName)){
                
                com.sugarcrm.www.sugarcrm.Set_document_revisionResponse set_document_revisionResponse35 = null;
	                        com.sugarcrm.www.sugarcrm.Set_document_revision wrappedParam =
                                                             (com.sugarcrm.www.sugarcrm.Set_document_revision)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.sugarcrm.www.sugarcrm.Set_document_revision.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               set_document_revisionResponse35 =
                                                   
                                                   
                                                         skel.set_document_revision(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), set_document_revisionResponse35, false);
                                    } else 

            if("set_entries".equals(methodName)){
                
                com.sugarcrm.www.sugarcrm.Set_entriesResponse set_entriesResponse37 = null;
	                        com.sugarcrm.www.sugarcrm.Set_entries wrappedParam =
                                                             (com.sugarcrm.www.sugarcrm.Set_entries)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.sugarcrm.www.sugarcrm.Set_entries.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               set_entriesResponse37 =
                                                   
                                                   
                                                         skel.set_entries(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), set_entriesResponse37, false);
                                    } else 

            if("get_entry_list".equals(methodName)){
                
                com.sugarcrm.www.sugarcrm.Get_entry_listResponse get_entry_listResponse39 = null;
	                        com.sugarcrm.www.sugarcrm.Get_entry_list wrappedParam =
                                                             (com.sugarcrm.www.sugarcrm.Get_entry_list)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.sugarcrm.www.sugarcrm.Get_entry_list.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               get_entry_listResponse39 =
                                                   
                                                   
                                                         skel.get_entry_list(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), get_entry_listResponse39, false);
                                    } else 

            if("get_upcoming_activities".equals(methodName)){
                
                com.sugarcrm.www.sugarcrm.Get_upcoming_activitiesResponse get_upcoming_activitiesResponse41 = null;
	                        com.sugarcrm.www.sugarcrm.Get_upcoming_activities wrappedParam =
                                                             (com.sugarcrm.www.sugarcrm.Get_upcoming_activities)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.sugarcrm.www.sugarcrm.Get_upcoming_activities.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               get_upcoming_activitiesResponse41 =
                                                   
                                                   
                                                         skel.get_upcoming_activities(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), get_upcoming_activitiesResponse41, false);
                                    } else 

            if("get_relationships".equals(methodName)){
                
                com.sugarcrm.www.sugarcrm.Get_relationshipsResponse get_relationshipsResponse43 = null;
	                        com.sugarcrm.www.sugarcrm.Get_relationships wrappedParam =
                                                             (com.sugarcrm.www.sugarcrm.Get_relationships)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.sugarcrm.www.sugarcrm.Get_relationships.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               get_relationshipsResponse43 =
                                                   
                                                   
                                                         skel.get_relationships(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), get_relationshipsResponse43, false);
                                    } else 

            if("get_note_attachment".equals(methodName)){
                
                com.sugarcrm.www.sugarcrm.Get_note_attachmentResponse get_note_attachmentResponse45 = null;
	                        com.sugarcrm.www.sugarcrm.Get_note_attachment wrappedParam =
                                                             (com.sugarcrm.www.sugarcrm.Get_note_attachment)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.sugarcrm.www.sugarcrm.Get_note_attachment.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               get_note_attachmentResponse45 =
                                                   
                                                   
                                                         skel.get_note_attachment(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), get_note_attachmentResponse45, false);
                                    } else 

            if("get_entry".equals(methodName)){
                
                com.sugarcrm.www.sugarcrm.Get_entryResponse get_entryResponse47 = null;
	                        com.sugarcrm.www.sugarcrm.Get_entry wrappedParam =
                                                             (com.sugarcrm.www.sugarcrm.Get_entry)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.sugarcrm.www.sugarcrm.Get_entry.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               get_entryResponse47 =
                                                   
                                                   
                                                         skel.get_entry(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), get_entryResponse47, false);
                                    } else 

            if("get_entries".equals(methodName)){
                
                com.sugarcrm.www.sugarcrm.Get_entriesResponse get_entriesResponse49 = null;
	                        com.sugarcrm.www.sugarcrm.Get_entries wrappedParam =
                                                             (com.sugarcrm.www.sugarcrm.Get_entries)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.sugarcrm.www.sugarcrm.Get_entries.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               get_entriesResponse49 =
                                                   
                                                   
                                                         skel.get_entries(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), get_entriesResponse49, false);
                                    } else 

            if("seamless_login".equals(methodName)){
                
                com.sugarcrm.www.sugarcrm.Seamless_loginResponse seamless_loginResponse51 = null;
	                        com.sugarcrm.www.sugarcrm.Seamless_login wrappedParam =
                                                             (com.sugarcrm.www.sugarcrm.Seamless_login)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.sugarcrm.www.sugarcrm.Seamless_login.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               seamless_loginResponse51 =
                                                   
                                                   
                                                         skel.seamless_login(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), seamless_loginResponse51, false);
                                    
            } else {
              throw new java.lang.RuntimeException("method not found");
            }
        

        newMsgContext.setEnvelope(envelope);
        }
        }
        catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
        }
        
        //
            private  org.apache.axiom.om.OMElement  toOM(com.sugarcrm.www.sugarcrm.Set_note_attachment param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sugarcrm.www.sugarcrm.Set_note_attachment.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.sugarcrm.www.sugarcrm.Set_note_attachmentResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sugarcrm.www.sugarcrm.Set_note_attachmentResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.sugarcrm.www.sugarcrm.Logout param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sugarcrm.www.sugarcrm.Logout.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.sugarcrm.www.sugarcrm.LogoutResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sugarcrm.www.sugarcrm.LogoutResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.sugarcrm.www.sugarcrm.Get_user_id param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sugarcrm.www.sugarcrm.Get_user_id.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.sugarcrm.www.sugarcrm.Get_user_idResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sugarcrm.www.sugarcrm.Get_user_idResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.sugarcrm.www.sugarcrm.Set_relationships param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sugarcrm.www.sugarcrm.Set_relationships.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.sugarcrm.www.sugarcrm.Set_relationshipsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sugarcrm.www.sugarcrm.Set_relationshipsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.sugarcrm.www.sugarcrm.Set_entry param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sugarcrm.www.sugarcrm.Set_entry.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.sugarcrm.www.sugarcrm.Set_entryResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sugarcrm.www.sugarcrm.Set_entryResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.sugarcrm.www.sugarcrm.Get_available_modules param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sugarcrm.www.sugarcrm.Get_available_modules.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.sugarcrm.www.sugarcrm.Get_available_modulesResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sugarcrm.www.sugarcrm.Get_available_modulesResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.sugarcrm.www.sugarcrm.Login param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sugarcrm.www.sugarcrm.Login.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.sugarcrm.www.sugarcrm.LoginResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sugarcrm.www.sugarcrm.LoginResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.sugarcrm.www.sugarcrm.Get_user_team_id param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sugarcrm.www.sugarcrm.Get_user_team_id.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.sugarcrm.www.sugarcrm.Get_user_team_idResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sugarcrm.www.sugarcrm.Get_user_team_idResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.sugarcrm.www.sugarcrm.Get_document_revision param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sugarcrm.www.sugarcrm.Get_document_revision.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.sugarcrm.www.sugarcrm.Get_document_revisionResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sugarcrm.www.sugarcrm.Get_document_revisionResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.sugarcrm.www.sugarcrm.Get_entries_count param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sugarcrm.www.sugarcrm.Get_entries_count.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.sugarcrm.www.sugarcrm.Get_entries_countResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sugarcrm.www.sugarcrm.Get_entries_countResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.sugarcrm.www.sugarcrm.Get_module_fields param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sugarcrm.www.sugarcrm.Get_module_fields.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.sugarcrm.www.sugarcrm.Get_module_fieldsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sugarcrm.www.sugarcrm.Get_module_fieldsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.sugarcrm.www.sugarcrm.Set_relationship param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sugarcrm.www.sugarcrm.Set_relationship.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.sugarcrm.www.sugarcrm.Set_relationshipResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sugarcrm.www.sugarcrm.Set_relationshipResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.sugarcrm.www.sugarcrm.Get_last_viewed param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sugarcrm.www.sugarcrm.Get_last_viewed.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.sugarcrm.www.sugarcrm.Get_last_viewedResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sugarcrm.www.sugarcrm.Get_last_viewedResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.sugarcrm.www.sugarcrm.Set_campaign_merge param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sugarcrm.www.sugarcrm.Set_campaign_merge.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.sugarcrm.www.sugarcrm.Set_campaign_mergeResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sugarcrm.www.sugarcrm.Set_campaign_mergeResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.sugarcrm.www.sugarcrm.Search_by_module param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sugarcrm.www.sugarcrm.Search_by_module.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.sugarcrm.www.sugarcrm.Search_by_moduleResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sugarcrm.www.sugarcrm.Search_by_moduleResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.sugarcrm.www.sugarcrm.Get_server_info param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sugarcrm.www.sugarcrm.Get_server_info.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.sugarcrm.www.sugarcrm.Get_server_infoResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sugarcrm.www.sugarcrm.Get_server_infoResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.sugarcrm.www.sugarcrm.Get_module_fields_md5 param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sugarcrm.www.sugarcrm.Get_module_fields_md5.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.sugarcrm.www.sugarcrm.Get_module_fields_md5Response param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sugarcrm.www.sugarcrm.Get_module_fields_md5Response.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.sugarcrm.www.sugarcrm.Set_document_revision param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sugarcrm.www.sugarcrm.Set_document_revision.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.sugarcrm.www.sugarcrm.Set_document_revisionResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sugarcrm.www.sugarcrm.Set_document_revisionResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.sugarcrm.www.sugarcrm.Set_entries param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sugarcrm.www.sugarcrm.Set_entries.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.sugarcrm.www.sugarcrm.Set_entriesResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sugarcrm.www.sugarcrm.Set_entriesResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.sugarcrm.www.sugarcrm.Get_entry_list param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sugarcrm.www.sugarcrm.Get_entry_list.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.sugarcrm.www.sugarcrm.Get_entry_listResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sugarcrm.www.sugarcrm.Get_entry_listResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.sugarcrm.www.sugarcrm.Get_upcoming_activities param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sugarcrm.www.sugarcrm.Get_upcoming_activities.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.sugarcrm.www.sugarcrm.Get_upcoming_activitiesResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sugarcrm.www.sugarcrm.Get_upcoming_activitiesResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.sugarcrm.www.sugarcrm.Get_relationships param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sugarcrm.www.sugarcrm.Get_relationships.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.sugarcrm.www.sugarcrm.Get_relationshipsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sugarcrm.www.sugarcrm.Get_relationshipsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.sugarcrm.www.sugarcrm.Get_note_attachment param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sugarcrm.www.sugarcrm.Get_note_attachment.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.sugarcrm.www.sugarcrm.Get_note_attachmentResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sugarcrm.www.sugarcrm.Get_note_attachmentResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.sugarcrm.www.sugarcrm.Get_entry param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sugarcrm.www.sugarcrm.Get_entry.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.sugarcrm.www.sugarcrm.Get_entryResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sugarcrm.www.sugarcrm.Get_entryResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.sugarcrm.www.sugarcrm.Get_entries param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sugarcrm.www.sugarcrm.Get_entries.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.sugarcrm.www.sugarcrm.Get_entriesResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sugarcrm.www.sugarcrm.Get_entriesResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.sugarcrm.www.sugarcrm.Seamless_login param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sugarcrm.www.sugarcrm.Seamless_login.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.sugarcrm.www.sugarcrm.Seamless_loginResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.sugarcrm.www.sugarcrm.Seamless_loginResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.sugarcrm.www.sugarcrm.Set_note_attachmentResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.sugarcrm.www.sugarcrm.Set_note_attachmentResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.sugarcrm.www.sugarcrm.Set_note_attachmentResponse wrapset_note_attachment(){
                                com.sugarcrm.www.sugarcrm.Set_note_attachmentResponse wrappedElement = new com.sugarcrm.www.sugarcrm.Set_note_attachmentResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.sugarcrm.www.sugarcrm.LogoutResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.sugarcrm.www.sugarcrm.LogoutResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.sugarcrm.www.sugarcrm.LogoutResponse wraplogout(){
                                com.sugarcrm.www.sugarcrm.LogoutResponse wrappedElement = new com.sugarcrm.www.sugarcrm.LogoutResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.sugarcrm.www.sugarcrm.Get_user_idResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.sugarcrm.www.sugarcrm.Get_user_idResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.sugarcrm.www.sugarcrm.Get_user_idResponse wrapget_user_id(){
                                com.sugarcrm.www.sugarcrm.Get_user_idResponse wrappedElement = new com.sugarcrm.www.sugarcrm.Get_user_idResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.sugarcrm.www.sugarcrm.Set_relationshipsResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.sugarcrm.www.sugarcrm.Set_relationshipsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.sugarcrm.www.sugarcrm.Set_relationshipsResponse wrapset_relationships(){
                                com.sugarcrm.www.sugarcrm.Set_relationshipsResponse wrappedElement = new com.sugarcrm.www.sugarcrm.Set_relationshipsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.sugarcrm.www.sugarcrm.Set_entryResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.sugarcrm.www.sugarcrm.Set_entryResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.sugarcrm.www.sugarcrm.Set_entryResponse wrapset_entry(){
                                com.sugarcrm.www.sugarcrm.Set_entryResponse wrappedElement = new com.sugarcrm.www.sugarcrm.Set_entryResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.sugarcrm.www.sugarcrm.Get_available_modulesResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.sugarcrm.www.sugarcrm.Get_available_modulesResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.sugarcrm.www.sugarcrm.Get_available_modulesResponse wrapget_available_modules(){
                                com.sugarcrm.www.sugarcrm.Get_available_modulesResponse wrappedElement = new com.sugarcrm.www.sugarcrm.Get_available_modulesResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.sugarcrm.www.sugarcrm.LoginResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.sugarcrm.www.sugarcrm.LoginResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.sugarcrm.www.sugarcrm.LoginResponse wraplogin(){
                                com.sugarcrm.www.sugarcrm.LoginResponse wrappedElement = new com.sugarcrm.www.sugarcrm.LoginResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.sugarcrm.www.sugarcrm.Get_user_team_idResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.sugarcrm.www.sugarcrm.Get_user_team_idResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.sugarcrm.www.sugarcrm.Get_user_team_idResponse wrapget_user_team_id(){
                                com.sugarcrm.www.sugarcrm.Get_user_team_idResponse wrappedElement = new com.sugarcrm.www.sugarcrm.Get_user_team_idResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.sugarcrm.www.sugarcrm.Get_document_revisionResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.sugarcrm.www.sugarcrm.Get_document_revisionResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.sugarcrm.www.sugarcrm.Get_document_revisionResponse wrapget_document_revision(){
                                com.sugarcrm.www.sugarcrm.Get_document_revisionResponse wrappedElement = new com.sugarcrm.www.sugarcrm.Get_document_revisionResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.sugarcrm.www.sugarcrm.Get_entries_countResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.sugarcrm.www.sugarcrm.Get_entries_countResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.sugarcrm.www.sugarcrm.Get_entries_countResponse wrapget_entries_count(){
                                com.sugarcrm.www.sugarcrm.Get_entries_countResponse wrappedElement = new com.sugarcrm.www.sugarcrm.Get_entries_countResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.sugarcrm.www.sugarcrm.Get_module_fieldsResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.sugarcrm.www.sugarcrm.Get_module_fieldsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.sugarcrm.www.sugarcrm.Get_module_fieldsResponse wrapget_module_fields(){
                                com.sugarcrm.www.sugarcrm.Get_module_fieldsResponse wrappedElement = new com.sugarcrm.www.sugarcrm.Get_module_fieldsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.sugarcrm.www.sugarcrm.Set_relationshipResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.sugarcrm.www.sugarcrm.Set_relationshipResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.sugarcrm.www.sugarcrm.Set_relationshipResponse wrapset_relationship(){
                                com.sugarcrm.www.sugarcrm.Set_relationshipResponse wrappedElement = new com.sugarcrm.www.sugarcrm.Set_relationshipResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.sugarcrm.www.sugarcrm.Get_last_viewedResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.sugarcrm.www.sugarcrm.Get_last_viewedResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.sugarcrm.www.sugarcrm.Get_last_viewedResponse wrapget_last_viewed(){
                                com.sugarcrm.www.sugarcrm.Get_last_viewedResponse wrappedElement = new com.sugarcrm.www.sugarcrm.Get_last_viewedResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.sugarcrm.www.sugarcrm.Set_campaign_mergeResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.sugarcrm.www.sugarcrm.Set_campaign_mergeResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.sugarcrm.www.sugarcrm.Set_campaign_mergeResponse wrapset_campaign_merge(){
                                com.sugarcrm.www.sugarcrm.Set_campaign_mergeResponse wrappedElement = new com.sugarcrm.www.sugarcrm.Set_campaign_mergeResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.sugarcrm.www.sugarcrm.Search_by_moduleResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.sugarcrm.www.sugarcrm.Search_by_moduleResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.sugarcrm.www.sugarcrm.Search_by_moduleResponse wrapsearch_by_module(){
                                com.sugarcrm.www.sugarcrm.Search_by_moduleResponse wrappedElement = new com.sugarcrm.www.sugarcrm.Search_by_moduleResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.sugarcrm.www.sugarcrm.Get_server_infoResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.sugarcrm.www.sugarcrm.Get_server_infoResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.sugarcrm.www.sugarcrm.Get_server_infoResponse wrapget_server_info(){
                                com.sugarcrm.www.sugarcrm.Get_server_infoResponse wrappedElement = new com.sugarcrm.www.sugarcrm.Get_server_infoResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.sugarcrm.www.sugarcrm.Get_module_fields_md5Response param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.sugarcrm.www.sugarcrm.Get_module_fields_md5Response.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.sugarcrm.www.sugarcrm.Get_module_fields_md5Response wrapget_module_fields_md5(){
                                com.sugarcrm.www.sugarcrm.Get_module_fields_md5Response wrappedElement = new com.sugarcrm.www.sugarcrm.Get_module_fields_md5Response();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.sugarcrm.www.sugarcrm.Set_document_revisionResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.sugarcrm.www.sugarcrm.Set_document_revisionResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.sugarcrm.www.sugarcrm.Set_document_revisionResponse wrapset_document_revision(){
                                com.sugarcrm.www.sugarcrm.Set_document_revisionResponse wrappedElement = new com.sugarcrm.www.sugarcrm.Set_document_revisionResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.sugarcrm.www.sugarcrm.Set_entriesResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.sugarcrm.www.sugarcrm.Set_entriesResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.sugarcrm.www.sugarcrm.Set_entriesResponse wrapset_entries(){
                                com.sugarcrm.www.sugarcrm.Set_entriesResponse wrappedElement = new com.sugarcrm.www.sugarcrm.Set_entriesResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.sugarcrm.www.sugarcrm.Get_entry_listResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.sugarcrm.www.sugarcrm.Get_entry_listResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.sugarcrm.www.sugarcrm.Get_entry_listResponse wrapget_entry_list(){
                                com.sugarcrm.www.sugarcrm.Get_entry_listResponse wrappedElement = new com.sugarcrm.www.sugarcrm.Get_entry_listResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.sugarcrm.www.sugarcrm.Get_upcoming_activitiesResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.sugarcrm.www.sugarcrm.Get_upcoming_activitiesResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.sugarcrm.www.sugarcrm.Get_upcoming_activitiesResponse wrapget_upcoming_activities(){
                                com.sugarcrm.www.sugarcrm.Get_upcoming_activitiesResponse wrappedElement = new com.sugarcrm.www.sugarcrm.Get_upcoming_activitiesResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.sugarcrm.www.sugarcrm.Get_relationshipsResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.sugarcrm.www.sugarcrm.Get_relationshipsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.sugarcrm.www.sugarcrm.Get_relationshipsResponse wrapget_relationships(){
                                com.sugarcrm.www.sugarcrm.Get_relationshipsResponse wrappedElement = new com.sugarcrm.www.sugarcrm.Get_relationshipsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.sugarcrm.www.sugarcrm.Get_note_attachmentResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.sugarcrm.www.sugarcrm.Get_note_attachmentResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.sugarcrm.www.sugarcrm.Get_note_attachmentResponse wrapget_note_attachment(){
                                com.sugarcrm.www.sugarcrm.Get_note_attachmentResponse wrappedElement = new com.sugarcrm.www.sugarcrm.Get_note_attachmentResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.sugarcrm.www.sugarcrm.Get_entryResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.sugarcrm.www.sugarcrm.Get_entryResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.sugarcrm.www.sugarcrm.Get_entryResponse wrapget_entry(){
                                com.sugarcrm.www.sugarcrm.Get_entryResponse wrappedElement = new com.sugarcrm.www.sugarcrm.Get_entryResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.sugarcrm.www.sugarcrm.Get_entriesResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.sugarcrm.www.sugarcrm.Get_entriesResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.sugarcrm.www.sugarcrm.Get_entriesResponse wrapget_entries(){
                                com.sugarcrm.www.sugarcrm.Get_entriesResponse wrappedElement = new com.sugarcrm.www.sugarcrm.Get_entriesResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.sugarcrm.www.sugarcrm.Seamless_loginResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.sugarcrm.www.sugarcrm.Seamless_loginResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.sugarcrm.www.sugarcrm.Seamless_loginResponse wrapseamless_login(){
                                com.sugarcrm.www.sugarcrm.Seamless_loginResponse wrappedElement = new com.sugarcrm.www.sugarcrm.Seamless_loginResponse();
                                return wrappedElement;
                         }
                    


        /**
        *  get the default envelope
        */
        private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory){
        return factory.getDefaultEnvelope();
        }


        private  java.lang.Object fromOM(
        org.apache.axiom.om.OMElement param,
        java.lang.Class type,
        java.util.Map extraNamespaces) throws org.apache.axis2.AxisFault{

        try {
        
                if (com.sugarcrm.www.sugarcrm.Set_note_attachment.class.equals(type)){
                
                           return com.sugarcrm.www.sugarcrm.Set_note_attachment.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sugarcrm.www.sugarcrm.Set_note_attachmentResponse.class.equals(type)){
                
                           return com.sugarcrm.www.sugarcrm.Set_note_attachmentResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sugarcrm.www.sugarcrm.Logout.class.equals(type)){
                
                           return com.sugarcrm.www.sugarcrm.Logout.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sugarcrm.www.sugarcrm.LogoutResponse.class.equals(type)){
                
                           return com.sugarcrm.www.sugarcrm.LogoutResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sugarcrm.www.sugarcrm.Get_user_id.class.equals(type)){
                
                           return com.sugarcrm.www.sugarcrm.Get_user_id.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sugarcrm.www.sugarcrm.Get_user_idResponse.class.equals(type)){
                
                           return com.sugarcrm.www.sugarcrm.Get_user_idResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sugarcrm.www.sugarcrm.Set_relationships.class.equals(type)){
                
                           return com.sugarcrm.www.sugarcrm.Set_relationships.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sugarcrm.www.sugarcrm.Set_relationshipsResponse.class.equals(type)){
                
                           return com.sugarcrm.www.sugarcrm.Set_relationshipsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sugarcrm.www.sugarcrm.Set_entry.class.equals(type)){
                
                           return com.sugarcrm.www.sugarcrm.Set_entry.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sugarcrm.www.sugarcrm.Set_entryResponse.class.equals(type)){
                
                           return com.sugarcrm.www.sugarcrm.Set_entryResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sugarcrm.www.sugarcrm.Get_available_modules.class.equals(type)){
                
                           return com.sugarcrm.www.sugarcrm.Get_available_modules.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sugarcrm.www.sugarcrm.Get_available_modulesResponse.class.equals(type)){
                
                           return com.sugarcrm.www.sugarcrm.Get_available_modulesResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sugarcrm.www.sugarcrm.Login.class.equals(type)){
                
                           return com.sugarcrm.www.sugarcrm.Login.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sugarcrm.www.sugarcrm.LoginResponse.class.equals(type)){
                
                           return com.sugarcrm.www.sugarcrm.LoginResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sugarcrm.www.sugarcrm.Get_user_team_id.class.equals(type)){
                
                           return com.sugarcrm.www.sugarcrm.Get_user_team_id.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sugarcrm.www.sugarcrm.Get_user_team_idResponse.class.equals(type)){
                
                           return com.sugarcrm.www.sugarcrm.Get_user_team_idResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sugarcrm.www.sugarcrm.Get_document_revision.class.equals(type)){
                
                           return com.sugarcrm.www.sugarcrm.Get_document_revision.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sugarcrm.www.sugarcrm.Get_document_revisionResponse.class.equals(type)){
                
                           return com.sugarcrm.www.sugarcrm.Get_document_revisionResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sugarcrm.www.sugarcrm.Get_entries_count.class.equals(type)){
                
                           return com.sugarcrm.www.sugarcrm.Get_entries_count.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sugarcrm.www.sugarcrm.Get_entries_countResponse.class.equals(type)){
                
                           return com.sugarcrm.www.sugarcrm.Get_entries_countResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sugarcrm.www.sugarcrm.Get_module_fields.class.equals(type)){
                
                           return com.sugarcrm.www.sugarcrm.Get_module_fields.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sugarcrm.www.sugarcrm.Get_module_fieldsResponse.class.equals(type)){
                
                           return com.sugarcrm.www.sugarcrm.Get_module_fieldsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sugarcrm.www.sugarcrm.Set_relationship.class.equals(type)){
                
                           return com.sugarcrm.www.sugarcrm.Set_relationship.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sugarcrm.www.sugarcrm.Set_relationshipResponse.class.equals(type)){
                
                           return com.sugarcrm.www.sugarcrm.Set_relationshipResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sugarcrm.www.sugarcrm.Get_last_viewed.class.equals(type)){
                
                           return com.sugarcrm.www.sugarcrm.Get_last_viewed.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sugarcrm.www.sugarcrm.Get_last_viewedResponse.class.equals(type)){
                
                           return com.sugarcrm.www.sugarcrm.Get_last_viewedResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sugarcrm.www.sugarcrm.Set_campaign_merge.class.equals(type)){
                
                           return com.sugarcrm.www.sugarcrm.Set_campaign_merge.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sugarcrm.www.sugarcrm.Set_campaign_mergeResponse.class.equals(type)){
                
                           return com.sugarcrm.www.sugarcrm.Set_campaign_mergeResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sugarcrm.www.sugarcrm.Search_by_module.class.equals(type)){
                
                           return com.sugarcrm.www.sugarcrm.Search_by_module.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sugarcrm.www.sugarcrm.Search_by_moduleResponse.class.equals(type)){
                
                           return com.sugarcrm.www.sugarcrm.Search_by_moduleResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sugarcrm.www.sugarcrm.Get_server_info.class.equals(type)){
                
                           return com.sugarcrm.www.sugarcrm.Get_server_info.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sugarcrm.www.sugarcrm.Get_server_infoResponse.class.equals(type)){
                
                           return com.sugarcrm.www.sugarcrm.Get_server_infoResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sugarcrm.www.sugarcrm.Get_module_fields_md5.class.equals(type)){
                
                           return com.sugarcrm.www.sugarcrm.Get_module_fields_md5.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sugarcrm.www.sugarcrm.Get_module_fields_md5Response.class.equals(type)){
                
                           return com.sugarcrm.www.sugarcrm.Get_module_fields_md5Response.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sugarcrm.www.sugarcrm.Set_document_revision.class.equals(type)){
                
                           return com.sugarcrm.www.sugarcrm.Set_document_revision.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sugarcrm.www.sugarcrm.Set_document_revisionResponse.class.equals(type)){
                
                           return com.sugarcrm.www.sugarcrm.Set_document_revisionResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sugarcrm.www.sugarcrm.Set_entries.class.equals(type)){
                
                           return com.sugarcrm.www.sugarcrm.Set_entries.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sugarcrm.www.sugarcrm.Set_entriesResponse.class.equals(type)){
                
                           return com.sugarcrm.www.sugarcrm.Set_entriesResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sugarcrm.www.sugarcrm.Get_entry_list.class.equals(type)){
                
                           return com.sugarcrm.www.sugarcrm.Get_entry_list.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sugarcrm.www.sugarcrm.Get_entry_listResponse.class.equals(type)){
                
                           return com.sugarcrm.www.sugarcrm.Get_entry_listResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sugarcrm.www.sugarcrm.Get_upcoming_activities.class.equals(type)){
                
                           return com.sugarcrm.www.sugarcrm.Get_upcoming_activities.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sugarcrm.www.sugarcrm.Get_upcoming_activitiesResponse.class.equals(type)){
                
                           return com.sugarcrm.www.sugarcrm.Get_upcoming_activitiesResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sugarcrm.www.sugarcrm.Get_relationships.class.equals(type)){
                
                           return com.sugarcrm.www.sugarcrm.Get_relationships.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sugarcrm.www.sugarcrm.Get_relationshipsResponse.class.equals(type)){
                
                           return com.sugarcrm.www.sugarcrm.Get_relationshipsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sugarcrm.www.sugarcrm.Get_note_attachment.class.equals(type)){
                
                           return com.sugarcrm.www.sugarcrm.Get_note_attachment.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sugarcrm.www.sugarcrm.Get_note_attachmentResponse.class.equals(type)){
                
                           return com.sugarcrm.www.sugarcrm.Get_note_attachmentResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sugarcrm.www.sugarcrm.Get_entry.class.equals(type)){
                
                           return com.sugarcrm.www.sugarcrm.Get_entry.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sugarcrm.www.sugarcrm.Get_entryResponse.class.equals(type)){
                
                           return com.sugarcrm.www.sugarcrm.Get_entryResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sugarcrm.www.sugarcrm.Get_entries.class.equals(type)){
                
                           return com.sugarcrm.www.sugarcrm.Get_entries.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sugarcrm.www.sugarcrm.Get_entriesResponse.class.equals(type)){
                
                           return com.sugarcrm.www.sugarcrm.Get_entriesResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sugarcrm.www.sugarcrm.Seamless_login.class.equals(type)){
                
                           return com.sugarcrm.www.sugarcrm.Seamless_login.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.sugarcrm.www.sugarcrm.Seamless_loginResponse.class.equals(type)){
                
                           return com.sugarcrm.www.sugarcrm.Seamless_loginResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
        } catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
           return null;
        }



    

        /**
        *  A utility method that copies the namepaces from the SOAPEnvelope
        */
        private java.util.Map getEnvelopeNamespaces(org.apache.axiom.soap.SOAPEnvelope env){
        java.util.Map returnMap = new java.util.HashMap();
        java.util.Iterator namespaceIterator = env.getAllDeclaredNamespaces();
        while (namespaceIterator.hasNext()) {
        org.apache.axiom.om.OMNamespace ns = (org.apache.axiom.om.OMNamespace) namespaceIterator.next();
        returnMap.put(ns.getPrefix(),ns.getNamespaceURI());
        }
        return returnMap;
        }

        private org.apache.axis2.AxisFault createAxisFault(java.lang.Exception e) {
        org.apache.axis2.AxisFault f;
        Throwable cause = e.getCause();
        if (cause != null) {
            f = new org.apache.axis2.AxisFault(e.getMessage(), cause);
        } else {
            f = new org.apache.axis2.AxisFault(e.getMessage());
        }

        return f;
    }

        }//end of class
    