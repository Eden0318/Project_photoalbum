package com.squarecross.photoalbum.domain;

import javax.persistence.*;

@Entity
@Table(name="photo", schema="photo_album", uniqueConstraints ={@UniqueConstraint(columnNames = "photo_id")})
public class Photo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="photo_id", unique = true, nullable = false)
    private Long photoId;
    @Column(name="file_name", unique = false, nullable = true)
    private String fileName;

    @Column(name="thumb_url", unique = false, nullable = true)
    private String thumbUrl;

    @Column(name="original_url", unique = false, nullable = true)
    private String originalUrl;

    @Column(name="file_size", unique = false, nullable = true)
    private Long fileSize;

    @Column(name="uploaded_at", unique = false, nullable = true)
    private String uploadedAt;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="album_id")
    private Album album;

    public Photo() {};

    public Long getPhotoId() {
        return photoId;
    }

    public void setPhotoId(Long photoId) {
        this.photoId = photoId;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getThumbUrl() {
        return thumbUrl;
    }

    public void setThumbUrl(String thumbUrl) {
        this.thumbUrl = thumbUrl;
    }

    public String getOriginalUrl() {
        return originalUrl;
    }

    public void setOriginalUrl(String originalUrl) {
        this.originalUrl = originalUrl;
    }

    public Long getFileSize() {
        return fileSize;
    }

    public void setFileSize(Long fileSize) {
        this.fileSize = fileSize;
    }

    public String getUploadedAt() {
        return uploadedAt;
    }

    public void setUploadedAt(String uploadedAt) {
        this.uploadedAt = uploadedAt;
    }
}
