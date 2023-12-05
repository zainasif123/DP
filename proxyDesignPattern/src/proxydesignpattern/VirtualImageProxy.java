/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proxydesignpattern;

/**
 *
 * @author T
 */
class VirtualProxyImage implements Image {
    private RealImage realImage;
    private String filename;

    public VirtualProxyImage(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        if (isSupportedFileType(filename)) {
            if (realImage == null) {
                realImage = new RealImage(filename);
            }
            realImage.display();
        } else {
            System.out.println("Unsupported file type: " + getFileType(filename));
        }
    }

    // Check if the file type is supported (e.g., only support mp4)
    private boolean isSupportedFileType(String filename) {
        String fileType = getFileType(filename);
        return fileType != null && fileType.equalsIgnoreCase("mp4");
    }

    // Extract file type from the filename
    private String getFileType(String filename) {
        int dotIndex = filename.lastIndexOf(".");
        if (dotIndex > 0 && dotIndex < filename.length() - 1) {
            return filename.substring(dotIndex + 1).toLowerCase();
        }
        return null;
    }
}
