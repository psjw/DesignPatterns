package com.psjw.designpatterns._01_creational_patterns._05_prototype._01_before;

public class App {

    public static void main(String[] args) {
        GithubRepository repository = new GithubRepository();
        repository.setUser("whiteship");
        repository.setName("live-study");

        GithubIssue githubIssue = new GithubIssue(repository);
        githubIssue.setId(1);
        githubIssue.setTitle("1주차 과제: JVM은 무엇이며 자바 코드는 어떻게 실행하는 것인가.");

        String url = githubIssue.getUrl();
        System.out.println(url);

        //기존에 있던 인스턴스를 통해서 복제를 해서 만듬 -> 기존 인스턴스가 프로토 타입
//        GithubIssue clone = githubIssue.clone();
        //TODO clone != githubIssue -> 새로운 객체 생성 이기 때문에 다르다.
        //TODO clone.equals(githubIssue) -> 같은 내용인지 확인(true)

    }

}
