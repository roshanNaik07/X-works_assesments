package com.xworkz.external;

import com.xworkz.internal.VideoStreaming;

public class TV {
    VideoStreaming videoStreaming;

    public TV(VideoStreaming videoStreaming) {
        this.videoStreaming = videoStreaming;
        System.out.println("Running VideoStreaming param const in TV");
    }

    public void watchShow() {
        System.out.println("Running watchShow in TV");
        this.videoStreaming.streamVideo();
    }
}
