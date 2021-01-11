package per.pao.example.builder.simple;

public class Issue {
    private Integer id;
    private String name;

    public Integer getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    private Issue(IssueBuilder builder) {
        this.id = builder.id;
        this.name = builder.name;
    }

    public static class IssueBuilder {
        private Integer id;
        private String name;

        public IssueBuilder id(Integer id) {
            this.id = id;
            return this;
        }

        public IssueBuilder name(String name) {
            this.name = name;
            return this;
        }

        public Issue build() {
            return new Issue(this);
        }
    }

}
