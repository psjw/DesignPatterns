package com.psjw.designpatterns._01_creational_patterns._05_prototype._04_java;

import com.psjw.designpatterns._01_creational_patterns._05_prototype._03_after_deep_copy.GithubIssue;
import com.psjw.designpatterns._01_creational_patterns._05_prototype._03_after_deep_copy.GithubRepository;
import org.modelmapper.ModelMapper;

/**
 * packageName : com.psjw.designpatterns._01_creational_patterns._05_prototype._04_java
 * fileName : ModelMapperExample
 * author : psjw
 * date : 2021-12-09
 * description :
 * ===========================================================
 * DATE              AUTHOR          NOTE
 * -----------------------------------------------------------
 * 2021-12-09        psjw         최초 생성
 */
public class ModelMapperExample {
    public static void main(String[] args) {
        GithubRepository repository = new GithubRepository();
        repository.setUser("whiteship");
        repository.setName("live-study");

        GithubIssue githubIssue = new GithubIssue(repository);
        githubIssue.setId(1);
        githubIssue.setTitle("1주차 과제 : JVM은 무엇이며 자바코드는 어떻게 실행하는 것인가?");

        //API를 만들때 많이 사용 요청으로 들어온 본문을 파싱할경우 직접 값 세팅
        GithubIssueData githubIssueData = new GithubIssueData();
        githubIssueData.setId(githubIssue.getId());
        githubIssueData.setRepositoryName(githubIssue.getRepository().getName());

        //TODO ModelMapper 라이브러리를 사용하여 복사
        ModelMapper modelMapper = new ModelMapper();
        //리플렉션울 통해 생성
        GithubIssueData githubIssueData1 = modelMapper.map(githubIssue, GithubIssueData.class);
        System.out.println(githubIssueData1);
    }
}

