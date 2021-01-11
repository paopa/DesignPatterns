package per.pao.example.builder.simple;

public class Test {
    public static void main(String[] args) {
        Issue issue = new Issue.IssueBuilder().id(1).build();
        System.out.println(issue.getId());
        System.out.println(issue.getName());
    }
}
