/**
 * ChebiWebServiceBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.ac.ebi.ws.chebi;

public class ChebiWebServiceBindingStub extends org.apache.axis.client.Stub implements uk.ac.ebi.ws.chebi.ChebiWebServicePortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[7];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCompleteEntity");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.ebi.ac.uk/webservices/chebi", "chebiId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.ebi.ac.uk/webservices/chebi", "Entity"));
        oper.setReturnClass(uk.ac.ebi.ws.chebi.Entity.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.ebi.ac.uk/webservices/chebi", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.ebi.ac.uk/webservices/chebi", "ChebiWebServiceFault"),
                      "uk.ac.ebi.ws.chebi.ChebiWebServiceFault",
                      new javax.xml.namespace.QName("http://www.ebi.ac.uk/webservices/chebi", "ChebiWebServiceFault"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCompleteEntityByList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.ebi.ac.uk/webservices/chebi", "ListOfChEBIIds"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.ebi.ac.uk/webservices/chebi", "Entity"));
        oper.setReturnClass(uk.ac.ebi.ws.chebi.Entity[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.ebi.ac.uk/webservices/chebi", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.ebi.ac.uk/webservices/chebi", "ChebiWebServiceFault"),
                      "uk.ac.ebi.ws.chebi.ChebiWebServiceFault",
                      new javax.xml.namespace.QName("http://www.ebi.ac.uk/webservices/chebi", "ChebiWebServiceFault"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getLiteEntity");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.ebi.ac.uk/webservices/chebi", "search"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.ebi.ac.uk/webservices/chebi", "searchCategory"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.ebi.ac.uk/webservices/chebi", "SearchCategory"), uk.ac.ebi.ws.chebi.SearchCategory.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.ebi.ac.uk/webservices/chebi", "maximumResults"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.ebi.ac.uk/webservices/chebi", "stars"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.ebi.ac.uk/webservices/chebi", "StarsCategory"), uk.ac.ebi.ws.chebi.StarsCategory.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.ebi.ac.uk/webservices/chebi", "LiteEntityList"));
        oper.setReturnClass(uk.ac.ebi.ws.chebi.LiteEntityList.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.ebi.ac.uk/webservices/chebi", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.ebi.ac.uk/webservices/chebi", "ChebiWebServiceFault"),
                      "uk.ac.ebi.ws.chebi.ChebiWebServiceFault",
                      new javax.xml.namespace.QName("http://www.ebi.ac.uk/webservices/chebi", "ChebiWebServiceFault"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getOntologyParents");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.ebi.ac.uk/webservices/chebi", "chebiId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.ebi.ac.uk/webservices/chebi", "OntologyDataItemList"));
        oper.setReturnClass(uk.ac.ebi.ws.chebi.OntologyDataItemList.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.ebi.ac.uk/webservices/chebi", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.ebi.ac.uk/webservices/chebi", "ChebiWebServiceFault"),
                      "uk.ac.ebi.ws.chebi.ChebiWebServiceFault",
                      new javax.xml.namespace.QName("http://www.ebi.ac.uk/webservices/chebi", "ChebiWebServiceFault"), 
                      true
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getOntologyChildren");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.ebi.ac.uk/webservices/chebi", "chebiId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.ebi.ac.uk/webservices/chebi", "OntologyDataItemList"));
        oper.setReturnClass(uk.ac.ebi.ws.chebi.OntologyDataItemList.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.ebi.ac.uk/webservices/chebi", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.ebi.ac.uk/webservices/chebi", "ChebiWebServiceFault"),
                      "uk.ac.ebi.ws.chebi.ChebiWebServiceFault",
                      new javax.xml.namespace.QName("http://www.ebi.ac.uk/webservices/chebi", "ChebiWebServiceFault"), 
                      true
                     ));
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAllOntologyChildrenInPath");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.ebi.ac.uk/webservices/chebi", "chebiId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.ebi.ac.uk/webservices/chebi", "relationshipType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.ebi.ac.uk/webservices/chebi", "RelationshipType"), uk.ac.ebi.ws.chebi.RelationshipType.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.ebi.ac.uk/webservices/chebi", "structureOnly"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.ebi.ac.uk/webservices/chebi", "LiteEntityList"));
        oper.setReturnClass(uk.ac.ebi.ws.chebi.LiteEntityList.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.ebi.ac.uk/webservices/chebi", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.ebi.ac.uk/webservices/chebi", "ChebiWebServiceFault"),
                      "uk.ac.ebi.ws.chebi.ChebiWebServiceFault",
                      new javax.xml.namespace.QName("http://www.ebi.ac.uk/webservices/chebi", "ChebiWebServiceFault"), 
                      true
                     ));
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getStructureSearch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.ebi.ac.uk/webservices/chebi", "structure"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.ebi.ac.uk/webservices/chebi", "type"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.ebi.ac.uk/webservices/chebi", "StructureType"), uk.ac.ebi.ws.chebi.StructureType.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.ebi.ac.uk/webservices/chebi", "structureSearchCategory"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.ebi.ac.uk/webservices/chebi", "StructureSearchCategory"), uk.ac.ebi.ws.chebi.StructureSearchCategory.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.ebi.ac.uk/webservices/chebi", "totalResults"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.ebi.ac.uk/webservices/chebi", "tanimotoCutoff"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"), float.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.ebi.ac.uk/webservices/chebi", "LiteEntityList"));
        oper.setReturnClass(uk.ac.ebi.ws.chebi.LiteEntityList.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.ebi.ac.uk/webservices/chebi", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.ebi.ac.uk/webservices/chebi", "ChebiWebServiceFault"),
                      "uk.ac.ebi.ws.chebi.ChebiWebServiceFault",
                      new javax.xml.namespace.QName("http://www.ebi.ac.uk/webservices/chebi", "ChebiWebServiceFault"), 
                      true
                     ));
        _operations[6] = oper;

    }

    public ChebiWebServiceBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public ChebiWebServiceBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public ChebiWebServiceBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.1");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://www.ebi.ac.uk/webservices/chebi", "ChebiWebServiceFault");
            cachedSerQNames.add(qName);
            cls = uk.ac.ebi.ws.chebi.ChebiWebServiceFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.ebi.ac.uk/webservices/chebi", "CommentDataItem");
            cachedSerQNames.add(qName);
            cls = uk.ac.ebi.ws.chebi.CommentDataItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.ebi.ac.uk/webservices/chebi", "DataItem");
            cachedSerQNames.add(qName);
            cls = uk.ac.ebi.ws.chebi.DataItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.ebi.ac.uk/webservices/chebi", "Entity");
            cachedSerQNames.add(qName);
            cls = uk.ac.ebi.ws.chebi.Entity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.ebi.ac.uk/webservices/chebi", "LiteEntity");
            cachedSerQNames.add(qName);
            cls = uk.ac.ebi.ws.chebi.LiteEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.ebi.ac.uk/webservices/chebi", "LiteEntityList");
            cachedSerQNames.add(qName);
            cls = uk.ac.ebi.ws.chebi.LiteEntityList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.ebi.ac.uk/webservices/chebi", "OntologyDataItem");
            cachedSerQNames.add(qName);
            cls = uk.ac.ebi.ws.chebi.OntologyDataItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.ebi.ac.uk/webservices/chebi", "OntologyDataItemList");
            cachedSerQNames.add(qName);
            cls = uk.ac.ebi.ws.chebi.OntologyDataItemList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.ebi.ac.uk/webservices/chebi", "RelationshipType");
            cachedSerQNames.add(qName);
            cls = uk.ac.ebi.ws.chebi.RelationshipType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.ebi.ac.uk/webservices/chebi", "SearchCategory");
            cachedSerQNames.add(qName);
            cls = uk.ac.ebi.ws.chebi.SearchCategory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.ebi.ac.uk/webservices/chebi", "StarsCategory");
            cachedSerQNames.add(qName);
            cls = uk.ac.ebi.ws.chebi.StarsCategory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.ebi.ac.uk/webservices/chebi", "StructureDataItem");
            cachedSerQNames.add(qName);
            cls = uk.ac.ebi.ws.chebi.StructureDataItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.ebi.ac.uk/webservices/chebi", "StructureSearchCategory");
            cachedSerQNames.add(qName);
            cls = uk.ac.ebi.ws.chebi.StructureSearchCategory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.ebi.ac.uk/webservices/chebi", "StructureType");
            cachedSerQNames.add(qName);
            cls = uk.ac.ebi.ws.chebi.StructureType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public uk.ac.ebi.ws.chebi.Entity getCompleteEntity(java.lang.String chebiId) throws java.rmi.RemoteException, uk.ac.ebi.ws.chebi.ChebiWebServiceFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.ebi.ac.uk/webservices/chebi", "getCompleteEntity"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {chebiId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (uk.ac.ebi.ws.chebi.Entity) _resp;
            } catch (java.lang.Exception _exception) {
                return (uk.ac.ebi.ws.chebi.Entity) org.apache.axis.utils.JavaUtils.convert(_resp, uk.ac.ebi.ws.chebi.Entity.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof uk.ac.ebi.ws.chebi.ChebiWebServiceFault) {
              throw (uk.ac.ebi.ws.chebi.ChebiWebServiceFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public uk.ac.ebi.ws.chebi.Entity[] getCompleteEntityByList(java.lang.String[] listOfChEBIIds) throws java.rmi.RemoteException, uk.ac.ebi.ws.chebi.ChebiWebServiceFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.ebi.ac.uk/webservices/chebi", "getCompleteEntityByList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {listOfChEBIIds});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (uk.ac.ebi.ws.chebi.Entity[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (uk.ac.ebi.ws.chebi.Entity[]) org.apache.axis.utils.JavaUtils.convert(_resp, uk.ac.ebi.ws.chebi.Entity[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof uk.ac.ebi.ws.chebi.ChebiWebServiceFault) {
              throw (uk.ac.ebi.ws.chebi.ChebiWebServiceFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public uk.ac.ebi.ws.chebi.LiteEntityList getLiteEntity(java.lang.String search, uk.ac.ebi.ws.chebi.SearchCategory searchCategory, int maximumResults, uk.ac.ebi.ws.chebi.StarsCategory stars) throws java.rmi.RemoteException, uk.ac.ebi.ws.chebi.ChebiWebServiceFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.ebi.ac.uk/webservices/chebi", "getLiteEntity"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {search, searchCategory, new java.lang.Integer(maximumResults), stars});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (uk.ac.ebi.ws.chebi.LiteEntityList) _resp;
            } catch (java.lang.Exception _exception) {
                return (uk.ac.ebi.ws.chebi.LiteEntityList) org.apache.axis.utils.JavaUtils.convert(_resp, uk.ac.ebi.ws.chebi.LiteEntityList.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof uk.ac.ebi.ws.chebi.ChebiWebServiceFault) {
              throw (uk.ac.ebi.ws.chebi.ChebiWebServiceFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public uk.ac.ebi.ws.chebi.OntologyDataItemList getOntologyParents(java.lang.String chebiId) throws java.rmi.RemoteException, uk.ac.ebi.ws.chebi.ChebiWebServiceFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.ebi.ac.uk/webservices/chebi", "getOntologyParents"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {chebiId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (uk.ac.ebi.ws.chebi.OntologyDataItemList) _resp;
            } catch (java.lang.Exception _exception) {
                return (uk.ac.ebi.ws.chebi.OntologyDataItemList) org.apache.axis.utils.JavaUtils.convert(_resp, uk.ac.ebi.ws.chebi.OntologyDataItemList.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof uk.ac.ebi.ws.chebi.ChebiWebServiceFault) {
              throw (uk.ac.ebi.ws.chebi.ChebiWebServiceFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public uk.ac.ebi.ws.chebi.OntologyDataItemList getOntologyChildren(java.lang.String chebiId) throws java.rmi.RemoteException, uk.ac.ebi.ws.chebi.ChebiWebServiceFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.ebi.ac.uk/webservices/chebi", "getOntologyChildren"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {chebiId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (uk.ac.ebi.ws.chebi.OntologyDataItemList) _resp;
            } catch (java.lang.Exception _exception) {
                return (uk.ac.ebi.ws.chebi.OntologyDataItemList) org.apache.axis.utils.JavaUtils.convert(_resp, uk.ac.ebi.ws.chebi.OntologyDataItemList.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof uk.ac.ebi.ws.chebi.ChebiWebServiceFault) {
              throw (uk.ac.ebi.ws.chebi.ChebiWebServiceFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public uk.ac.ebi.ws.chebi.LiteEntityList getAllOntologyChildrenInPath(java.lang.String chebiId, uk.ac.ebi.ws.chebi.RelationshipType relationshipType, boolean structureOnly) throws java.rmi.RemoteException, uk.ac.ebi.ws.chebi.ChebiWebServiceFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.ebi.ac.uk/webservices/chebi", "getAllOntologyChildrenInPath"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {chebiId, relationshipType, new java.lang.Boolean(structureOnly)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (uk.ac.ebi.ws.chebi.LiteEntityList) _resp;
            } catch (java.lang.Exception _exception) {
                return (uk.ac.ebi.ws.chebi.LiteEntityList) org.apache.axis.utils.JavaUtils.convert(_resp, uk.ac.ebi.ws.chebi.LiteEntityList.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof uk.ac.ebi.ws.chebi.ChebiWebServiceFault) {
              throw (uk.ac.ebi.ws.chebi.ChebiWebServiceFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public uk.ac.ebi.ws.chebi.LiteEntityList getStructureSearch(java.lang.String structure, uk.ac.ebi.ws.chebi.StructureType type, uk.ac.ebi.ws.chebi.StructureSearchCategory structureSearchCategory, int totalResults, float tanimotoCutoff) throws java.rmi.RemoteException, uk.ac.ebi.ws.chebi.ChebiWebServiceFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.ebi.ac.uk/webservices/chebi", "getStructureSearch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {structure, type, structureSearchCategory, new java.lang.Integer(totalResults), new java.lang.Float(tanimotoCutoff)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (uk.ac.ebi.ws.chebi.LiteEntityList) _resp;
            } catch (java.lang.Exception _exception) {
                return (uk.ac.ebi.ws.chebi.LiteEntityList) org.apache.axis.utils.JavaUtils.convert(_resp, uk.ac.ebi.ws.chebi.LiteEntityList.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof uk.ac.ebi.ws.chebi.ChebiWebServiceFault) {
              throw (uk.ac.ebi.ws.chebi.ChebiWebServiceFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
