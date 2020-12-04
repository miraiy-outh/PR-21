package com.company.z3;

public class CreateTextDocument implements ICreateDocument{
    @Override
    public TextDocument createNew() {
        System.out.println("Создан новый документ");
        return new TextDocument();
    }
}
