package per.pao.example.factory.file;

public class Test {
    public static void main(String[] args) {
        IFileSimpleParser a = Factory.createSimple("csv");
        a.analysis();
    }
}


interface IFileSimpleParser {
    void analysis();
}

interface IFileComplexParser {
    void summary();

    default void a(){

    }

    default void b(){

    }
}

class CsvSimpleParser extends BaseSimpleParser implements IFileSimpleParser {

    @Override
    public void analysis() {

    }
}

class CsvComplexParser extends BaseComplexParser implements IFileComplexParser {

    @Override
    public void summary() {
        a();
        b();
    }
}

class BaseSimpleParser{

}

class BaseComplexParser{

}

class Factory {
    public static IFileSimpleParser createSimple(String parser) {
        switch (parser) {
            case "csv":
                return new CsvSimpleParser();
        }
        return null;
    }

    public static IFileComplexParser createComplex(String parser) {
        switch (parser) {
            case "csv":
                return new CsvComplexParser();
        }
        return null;
    }
}