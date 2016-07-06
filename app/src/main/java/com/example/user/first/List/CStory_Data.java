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
}