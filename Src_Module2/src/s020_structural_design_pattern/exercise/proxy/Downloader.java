package s020_structural_design_pattern.exercise.proxy;

import java.net.URLConnection;

public interface Downloader {
    URLConnection download();
}
