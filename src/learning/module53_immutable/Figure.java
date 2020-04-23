package learning.module53_immutable;

public class Figure extends Object {

    public final String figure;

//    public Figure(String figure) { // если входное значение не final, то
//        this.figure = figure;
//        assert figure != null;
//        figure = null;              // в данной строке оно будет изменено
//    }

    public Figure(final String figure) { // если входное значение final, то
        this.figure = figure;
        assert figure != null;
//        figure = null;              // в данной строке оно не будет легитимно
    }

}
