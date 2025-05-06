package L11RealLifeMiniChallenges;
import java.util.*;
import java.util.stream.Collectors;

class Job {
    private String name;
    private String status; // e.g., "SUCCESS", "FAILED"

    public Job(String name, String status) {
        this.name = name;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public String getStatus() {
        return status;
    }
}

public class Q55BatchJobSimulator {
    public static void main(String[] args) {
        List<Job> jobs = Arrays.asList(
                new Job("DataImport", "SUCCESS"),
                new Job("DataCleanup", "FAILED"),
                new Job("ReportGeneration", "FAILED"),
                new Job("EmailNotification", "SUCCESS"),
                new Job("ArchiveLogs", "FAILED")
        );

        List<String> failedJobsUppercase = jobs.stream()
                .filter(job -> "FAILED".equalsIgnoreCase(job.getStatus()))
                .map(job -> job.getName().toUpperCase())
                .sorted()
                .collect(Collectors.toList());

        // Output
        System.out.println("Failed Jobs (Uppercase, Sorted):");
        failedJobsUppercase.forEach(System.out::println);
    }
}
