package Presenter;

public enum restURL {
    SCHEMA{
        @Override
        public String getUrl() {
            return restURL.BASE+"schema";
        }
    },
    JOBS{
        @Override
        public String getUrl() {
            return restURL.BASE+"getJobsCount";
        }
    },
    COMPANY{
        @Override
        public String getUrl() {
            return restURL.BASE+"getCompanysCount";
        }
    },
    LOCATIONS{
        @Override
        public String getUrl() {
            return restURL.BASE+"getLocationsCount";
        }
    },
    SKILLS{
        @Override
        public String getUrl() {
            return restURL.BASE+"getSkills";
        }
    };
    private static final String BASE = "http://localhost:8081/wuzzufDataAnalysis/api/";
    public abstract String getUrl();
}
