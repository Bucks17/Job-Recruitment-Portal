package za.ac.cput.factory;

import za.ac.cput.domain.Employer;
import za.ac.cput.domain.JobListing;

import java.util.ArrayList;
import java.util.List;

public class EmployerFactory {

    public static Employer createEmployer(
            String companyName,
            String industry,
            String website,
            String location,
            String contactPerson,
            List<JobListing> jobListings
    ) {
        if (companyName == null || companyName.isEmpty()) {
            throw new IllegalArgumentException("Company name is required");
        }
        if (industry == null || industry.isEmpty()) {
            throw new IllegalArgumentException("Industry is required");
        }

        return new Employer.Builder()
                .setCompanyName(companyName)
                .setIndustry(industry)
                .setWebsite(website)
                .setLocation(location)
                .setContactPerson(contactPerson)
                .setJobListings(jobListings != null ? jobListings : new ArrayList<>())
                .build();
    }

    // Optional: default Employer for testing
    public static Employer createDefaultEmployer() {
        return createEmployer(
                "TechCorp",
                "Software Development",
                "www.techcorp.com",
                "Cape Town",
                "Siyabonga Jiyane",
                new ArrayList<>()
        );
    }
}

