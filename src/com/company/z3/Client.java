package com.company.z3;

public class Client {
    IDocument iDocument;
    Client(ICreateDocument iCreateDocument) {iDocument = iCreateDocument.createNew();}
}
