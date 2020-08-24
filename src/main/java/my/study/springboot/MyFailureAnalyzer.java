package my.study.springboot;

import org.springframework.boot.diagnostics.FailureAnalysis;
import org.springframework.boot.diagnostics.FailureAnalyzer;

public class MyFailureAnalyzer implements FailureAnalyzer {
    @Override
    public FailureAnalysis analyze(Throwable failure) {
        System.out.println("[MyFailureAnalyzer] Failure: " + failure);
        return new FailureAnalysis("This is description.", "This is action.", failure);
    }
}
