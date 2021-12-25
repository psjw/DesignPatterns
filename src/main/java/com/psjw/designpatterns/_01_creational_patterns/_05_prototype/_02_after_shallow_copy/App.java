package com.psjw.designpatterns._01_creational_patterns._05_prototype._02_after_shallow_copy;

public class App {

    public static void main(String[] args) throws CloneNotSupportedException {
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

        GithubIssue clone = (GithubIssue) githubIssue.clone();
        System.out.println(clone.getUrl());

        System.out.println(clone != githubIssue);
        System.out.println(clone.equals(githubIssue)); //equals 구현
        System.out.println(clone.getClass() == githubIssue.getClass());
        System.out.println(clone.getRepository() == githubIssue.getRepository());
        //얕은 복사 (shallow copy) : githubRepsotry는 동일한 리파지토리 참조
        repository.setName("psjw");
        System.out.println(clone.getRepository() == githubIssue.getRepository());
        System.out.println(clone.getUrl());
        System.out.println(githubIssue.getUrl());
    }

}
