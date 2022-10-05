package org.example;

import org.junit.Test;

import java.awt.image.PixelGrabber;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class JobApplicationTest {

    @Test
    public void userAccountCreationFailed(){
        User user = new User(null,null);
        assertEquals(false,user.getAccountStatus());
    }
    @Test
    public void userAccountCreationSuccessful(){
        // Users creates an account
        User user = new User("john","Johns-Resume");
        assertEquals(true,user.getAccountStatus());
    }

    @Test
    public void userResumeUploadFail(){
        //Resume Uploaded Not Successful
        Resume resume = mock(Resume.class);
        verify(resume).getResume("John-resume-in-string");
        UserResumeUpload userResumeUpload = ()->false;
        User user = new User("john","Johns-resume");
        user.resumeStatus(userResumeUpload.getStatus());
        assertEquals(false,user.resumeGetStatus());
    }


    @Test
    public void userResumeUploadSuccessful(){
        //Resume Uploaded Successfully
        UserResumeUpload userResumeUpload = ()->true;
        User user = new User("john","Johns-resume");
        user.resumeStatus(userResumeUpload.getStatus());
        assertEquals(true,user.resumeGetStatus());
    }



}
