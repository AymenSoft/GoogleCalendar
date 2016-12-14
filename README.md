# MyImageViewZoom
<p>Simply add events to Google Agenda</p>
<p>1-add permissions to Manifest</p>
<pre style="background-color:#2b2b2b;color:#a9b7c6;font-family:'Courier New';font-size:12,0pt;"><span style="color:#e8bf6a;">&lt;uses-permission </span><span style="color:#9876aa;">android</span><span style="color:#bababa;">:name=</span><span style="color:#6a8759;">&quot;android.permission.READ_CALENDAR&quot; </span><span style="color:#e8bf6a;">/&gt;
&lt;uses-permission </span><span style="color:#9876aa;">android</span><span style="color:#bababa;">:name=</span><span style="color:#6a8759;">&quot;android.permission.WRITE_CALENDAR&quot; </span><span style="color:#e8bf6a;">/&gt;</span></pre>
<p>2-add java code from MainActivity and edit (startdate, enddate) to change 
event date.</p>
<p>3-edit extras to change event details:</p>
<pre style="background-color:#2b2b2b;color:#a9b7c6;font-family:'Courier New';font-size:12,0pt;"><span style="background-color:#344134;">intent</span>.putExtra(<span style="color:#6a8759;">&quot;title&quot;</span><span style="color:#cc7832;">, </span><span style="color:#6a8759;">&quot;Title Event&quot;</span>)<span style="color:#cc7832;">;
</span><span style="background-color:#344134;">intent</span>.putExtra(<span style="color:#6a8759;">&quot;description&quot;</span><span style="color:#cc7832;">, </span><span style="color:#6a8759;">&quot;This is a sample description&quot;</span>)<span style="color:#cc7832;">;
</span><span style="background-color:#344134;">intent</span>.putExtra(<span style="color:#6a8759;">&quot;allDay&quot;</span><span style="color:#cc7832;">, false</span>)<span style="color:#cc7832;">;
</span><span style="background-color:#344134;">intent</span>.putExtra(<span style="color:#6a8759;">&quot;eventLocation&quot;</span><span style="color:#cc7832;">, </span><span style="color:#6a8759;">&quot;Address&quot;</span>)<span style="color:#cc7832;">;
</span><span style="background-color:#344134;">intent</span>.putExtra(<span style="color:#6a8759;">&quot;eventTimezone&quot;</span><span style="color:#cc7832;">, </span><span style="color:#6a8759;">&quot;Africa/Tunisia&quot;</span>)<span style="color:#cc7832;">;</span></pre>
<p>Result:</p>
<p>
<img border="0" src="http://img4.hostingpics.net/pics/309740QuickMemo20161005125837.png"></p>
<p>
Enjoy Developping with simple trics from AymenSoft<br>
WebSite: www.aymen-soft.com<br>
Facebook: https://www.facebook.com/AymenSoft<br>
twitter: https://twitter.com/aymen_soft<br>
GooglePlus: https://plus.google.com/+AymenSoftOfficial<br>
Telegram: https://telegram.me/AymenSoftOfficial<br>
</p>
