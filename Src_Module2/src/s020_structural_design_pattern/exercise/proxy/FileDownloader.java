package s020_structural_design_pattern.exercise.proxy;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class FileDownloader implements Downloader {
    @Override
    public URLConnection download() {

        try {
            return new URL("https://www.google.com.vn/url?sa=i&url=https%3A%2F%2Fdanhgiacongnghe.net%2Fcach-tai-file-pdf-tren-google-drive-bi-chan-tai-xuong-nhanh-nhat%2F&psig=AOvVaw1Ru29u9WWp8CxRMWJOL-Eb&ust=1635931672381000&source=images&cd=vfe&ved=0CAsQjRxqFwoTCPDQhcau-fMCFQAAAAAdAAAAABAD").openConnection();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
