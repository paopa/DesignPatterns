package per.pao.example.template.request;

public class Test {
    public static void main(String[] args) {
        System.out.println(new T().request("1asdf23"));
    }

    private static class T implements I<String, Integer> {

        @Override
        public Integer process(String s) {
            return Integer.valueOf(s);
        }
    }
}

interface I<I, O> {
    default R<O> request(I i) {
        try {
            return R.ok(process(i));
        } catch (Exception e) {
            return R.error(null, e);
        }
    }

    O process(I i);
}

class R<O> {
    boolean successful;
    O o;
    String exceptionMessage;

    public R(boolean successful, O o, String exceptionMessage) {
        this.successful = successful;
        this.o = o;
        this.exceptionMessage = exceptionMessage;
    }

    @Override
    public String toString() {
        return "R{" +
                "successful=" + successful +
                ", o=" + o +
                '}';
    }

    public static <O> R<O> ok(O o) {
        return new R<>(true, o, null);
    }

    public static <O> R<O> error(O o, Exception e) {
        e.printStackTrace();
        return new R<>(false, o, e.getMessage());
    }
}
