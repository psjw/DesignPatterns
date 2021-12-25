package com.psjw.designpatterns._01_creational_patterns._05_prototype._02_after_shallow_copy;

import java.util.Objects;

public class GithubIssue implements Cloneable{

    private int id;

    private String title;

    private GithubRepository repository;

    public GithubIssue(GithubRepository repository) {
        this.repository = repository;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public GithubRepository getRepository() {
        return repository;
    }

    public String getUrl() {
        return String.format("https://github.com/%s/%s/issues/%d",
                repository.getUser(),
                repository.getName(),
                this.getId());
    }

    //얕은 복사 (shallow copy) : githubRepsotry는 동일한 리파지토리 참조
    @Override
    protected Object clone() throws CloneNotSupportedException {
        //기본적으로 제공해주는 clone기능을 사용
        return super.clone();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GithubIssue that = (GithubIssue) o;
        return getId() == that.getId() && Objects.equals(getTitle(), that.getTitle()) && Objects.equals(getRepository(), that.getRepository());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getTitle(), getRepository());
    }
}
