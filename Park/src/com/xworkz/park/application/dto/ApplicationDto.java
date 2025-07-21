package com.xworkz.park.application.dto;

import java.util.Objects;

public class ApplicationDto implements Comparable<ApplicationDto> {

    private Double version;
    private String AppName;

    public ApplicationDto(Double version, String appName) {
        this.version = version;
        AppName = appName;
    }

    @Override
    public String toString() {
        return "ApplicationDto{" +
                "version=" + version +
                ", AppName='" + AppName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ApplicationDto)) return false;
        ApplicationDto that = (ApplicationDto) o;
        return Objects.equals(version, that.version) && Objects.equals(AppName, that.AppName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(version, AppName);
    }

    public Double getVersion() {
        return version;
    }

    public void setVersion(Double version) {
        this.version = version;
    }

    public String getAppName() {
        return AppName;
    }

    public void setAppName(String appName) {
        AppName = appName;
    }

    @Override
    public int compareTo(ApplicationDto dto) {
        if (this.version >dto.getVersion()  ) {
            return 1;

        } else if (this.version == dto.getVersion()  ) {
            return 0;
        } else {
            return -1;
        }

    }
}
