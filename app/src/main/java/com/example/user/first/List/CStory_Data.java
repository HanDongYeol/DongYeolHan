package com.example.user.first.List;

import android.graphics.drawable.Drawable;

/**
 * Created by KICT-15 on 2016-07-05.
 */
public class CStory_Data
{
    private Drawable m_thumbnail;
    private String m_title;
    private String m_ex;
    private String m_url;

    public CStory_Data()
    {

    }

    public CStory_Data(Drawable thumbnail, String title, String ex, String url)
    {
        this.m_thumbnail = thumbnail;
        this.m_title = title;
        this.m_ex = ex;
        this.m_url = url;
    }

    public Drawable Get_m_thumbnail()
    {
        return this.m_thumbnail;
    }
    public void Set_m_thumbnail(Drawable m_thumbnail)
    {
        this.m_thumbnail = m_thumbnail;
    }

    public String Get_m_title()
    {
        return this.m_title;
    }
    public void Set_m_title(String m_title)
    {
        this.m_title = m_title;
    }

    public String Get_m_ex()
    {
        return this.m_ex;
    }
    public void Set_m_ex(String m_ex)
    {
        this.m_ex = m_ex;
    }

    public String Get_m_url()
    {
        return this.m_url;
    }
    public void Set_m_url(String m_url)
    {
        this.m_url = m_url;
    }
}