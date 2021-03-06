package io.loli.box.service;

import io.loli.box.entity.User;

import javax.transaction.Transactional;
import java.io.IOException;
import java.io.InputStream;

/**
 * All storage service should implements this interface
 *
 * @author choco
 */
public interface StorageService {

    /**
     * Upload an InputStream with file name
     *
     * @param is          file to upload. After uploaded, file name will be changed to
     *                    nano time.
     * @param filename    origin name of this file
     * @param contentType
     * @return A relative url str generated by storage service
     * @throws IOException Will be throwed while IO error occurred
     */
    public String upload(InputStream is, String filename, String contentType, long length) throws IOException;


    @Transactional
    public void deleteFile(String name);

    @Transactional
    boolean deleteFile(String name, User user);
}
