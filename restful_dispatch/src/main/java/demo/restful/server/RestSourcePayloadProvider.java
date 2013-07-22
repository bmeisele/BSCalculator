



<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<!-- ViewVC :: http://www.viewvc.org/ -->
<head>
<title>[Apache-SVN] Log of /cxf/trunk/distribution/src/main/release/samples/restful_dispatch/src/main/java/demo/restful/server/RestSourcePayloadProvider.java</title>
<meta name="generator" content="ViewVC 1.2-dev" />
<link rel="shortcut icon" href="/viewvc/*docroot*/images/favicon.ico" />
<link rel="stylesheet" href="/viewvc/*docroot*/styles.css" type="text/css" />

</head>
<body>
<div class="vc_navheader">
<table><tr>
<td><strong><a href="/viewvc?view=roots"><span class="pathdiv">/</span></a><a href="/viewvc/">[Apache-SVN]</a><span class="pathdiv">/</span><a href="/viewvc/cxf/">cxf</a><span class="pathdiv">/</span><a href="/viewvc/cxf/trunk/">trunk</a><span class="pathdiv">/</span><a href="/viewvc/cxf/trunk/distribution/">distribution</a><span class="pathdiv">/</span><a href="/viewvc/cxf/trunk/distribution/src/">src</a><span class="pathdiv">/</span><a href="/viewvc/cxf/trunk/distribution/src/main/">main</a><span class="pathdiv">/</span><a href="/viewvc/cxf/trunk/distribution/src/main/release/">release</a><span class="pathdiv">/</span><a href="/viewvc/cxf/trunk/distribution/src/main/release/samples/">samples</a><span class="pathdiv">/</span><a href="/viewvc/cxf/trunk/distribution/src/main/release/samples/restful_dispatch/">restful_dispatch</a><span class="pathdiv">/</span><a href="/viewvc/cxf/trunk/distribution/src/main/release/samples/restful_dispatch/src/">src</a><span class="pathdiv">/</span><a href="/viewvc/cxf/trunk/distribution/src/main/release/samples/restful_dispatch/src/main/">main</a><span class="pathdiv">/</span><a href="/viewvc/cxf/trunk/distribution/src/main/release/samples/restful_dispatch/src/main/java/">java</a><span class="pathdiv">/</span><a href="/viewvc/cxf/trunk/distribution/src/main/release/samples/restful_dispatch/src/main/java/demo/">demo</a><span class="pathdiv">/</span><a href="/viewvc/cxf/trunk/distribution/src/main/release/samples/restful_dispatch/src/main/java/demo/restful/">restful</a><span class="pathdiv">/</span><a href="/viewvc/cxf/trunk/distribution/src/main/release/samples/restful_dispatch/src/main/java/demo/restful/server/">server</a><span class="pathdiv">/</span>RestSourcePayloadProvider.java</strong></td>
<td style="text-align: right;"></td>
</tr></table>
</div>
<div style="float: right; padding: 5px;"><a href="http://www.viewvc.org/" title="ViewVC Home"><img src="/viewvc/*docroot*/images/viewvc-logo.png" alt="ViewVC logotype" width="240" height="70" /></a></div>
<h1>Log of /cxf/trunk/distribution/src/main/release/samples/restful_dispatch/src/main/java/demo/restful/server/RestSourcePayloadProvider.java</h1>

<p style="margin:0;">

<a href="/viewvc/cxf/trunk/distribution/src/main/release/samples/restful_dispatch/src/main/java/demo/restful/server/"><img src="/viewvc/*docroot*/images/back_small.png" class="vc_icon" alt="Parent Directory" /> Parent Directory</a>

| <a href="/viewvc/cxf/trunk/distribution/src/main/release/samples/restful_dispatch/src/main/java/demo/restful/server/RestSourcePayloadProvider.java?view=log"><img src="/viewvc/*docroot*/images/log.png" class="vc_icon" alt="Revision Log" /> Revision Log</a>




</p>

<hr />
<table class="auto">



<tr>
<td>Links to HEAD:</td>
<td>
(<a href="/viewvc/cxf/trunk/distribution/src/main/release/samples/restful_dispatch/src/main/java/demo/restful/server/RestSourcePayloadProvider.java?view=markup">view</a>)
(<a href="/viewvc/cxf/trunk/distribution/src/main/release/samples/restful_dispatch/src/main/java/demo/restful/server/RestSourcePayloadProvider.java?view=co">download</a>)

(<a href="/viewvc/cxf/trunk/distribution/src/main/release/samples/restful_dispatch/src/main/java/demo/restful/server/RestSourcePayloadProvider.java?view=annotate">annotate</a>)
</td>
</tr>



<tr>
<td>Sticky Revision:</td>
<td><form method="get" action="/viewvc" style="display: inline">
<div style="display: inline">
<input type="hidden" name="orig_pathtype" value="FILE"/><input type="hidden" name="orig_view" value="log"/><input type="hidden" name="orig_path" value="cxf/trunk/distribution/src/main/release/samples/restful_dispatch/src/main/java/demo/restful/server/RestSourcePayloadProvider.java"/><input type="hidden" name="view" value="redirect_pathrev"/>

<input type="text" name="pathrev" value="" size="6"/>

<input type="submit" value="Set" />
</div>
</form>

</td>
</tr>
</table>
 







<div>
<hr />

<a name="rev1411230"></a>


Revision <a href="/viewvc?view=revision&amp;revision=1411230"><strong>1411230</strong></a> -


(<a href="/viewvc/cxf/trunk/distribution/src/main/release/samples/restful_dispatch/src/main/java/demo/restful/server/RestSourcePayloadProvider.java?revision=1411230&amp;view=markup">view</a>)


(<a href="/viewvc/cxf/trunk/distribution/src/main/release/samples/restful_dispatch/src/main/java/demo/restful/server/RestSourcePayloadProvider.java?revision=1411230&amp;view=co">download</a>)

(<a href="/viewvc/cxf/trunk/distribution/src/main/release/samples/restful_dispatch/src/main/java/demo/restful/server/RestSourcePayloadProvider.java?annotate=1411230">annotate</a>)



- <a href="/viewvc/cxf/trunk/distribution/src/main/release/samples/restful_dispatch/src/main/java/demo/restful/server/RestSourcePayloadProvider.java?r1=1411230&amp;view=log">[select for diffs]</a>




<br />

Modified

<em>Mon Nov 19 15:04:46 2012 UTC</em>
(8 months ago)
by <em>gmazza</em>









<br />File length: 3783 byte(s)







<br />Diff to <a href="/viewvc/cxf/trunk/distribution/src/main/release/samples/restful_dispatch/src/main/java/demo/restful/server/RestSourcePayloadProvider.java?r1=1173027&amp;r2=1411230">previous 1173027</a>

(<a href="/viewvc/cxf/trunk/distribution/src/main/release/samples/restful_dispatch/src/main/java/demo/restful/server/RestSourcePayloadProvider.java?r1=1173027&amp;r2=1411230&amp;diff_format=h">colored</a>)






<pre class="vc_log">Removed Maven antrun plugin from restful_dispatch sample (makes it easier to load via m2e)</pre>
</div>



<div>
<hr />

<a name="rev1173027"></a>


Revision <a href="/viewvc?view=revision&amp;revision=1173027"><strong>1173027</strong></a> -


(<a href="/viewvc/cxf/trunk/distribution/src/main/release/samples/restful_dispatch/src/main/java/demo/restful/server/RestSourcePayloadProvider.java?revision=1173027&amp;view=markup">view</a>)


(<a href="/viewvc/cxf/trunk/distribution/src/main/release/samples/restful_dispatch/src/main/java/demo/restful/server/RestSourcePayloadProvider.java?revision=1173027&amp;view=co">download</a>)

(<a href="/viewvc/cxf/trunk/distribution/src/main/release/samples/restful_dispatch/src/main/java/demo/restful/server/RestSourcePayloadProvider.java?annotate=1173027">annotate</a>)



- <a href="/viewvc/cxf/trunk/distribution/src/main/release/samples/restful_dispatch/src/main/java/demo/restful/server/RestSourcePayloadProvider.java?r1=1173027&amp;view=log">[select for diffs]</a>




<br />

Modified

<em>Tue Sep 20 08:46:04 2011 UTC</em>
(22 months ago)
by <em>ningjiang</em>









<br />File length: 3780 byte(s)







<br />Diff to <a href="/viewvc/cxf/trunk/distribution/src/main/release/samples/restful_dispatch/src/main/java/demo/restful/server/RestSourcePayloadProvider.java?r1=651669&amp;r2=1173027">previous 651669</a>

(<a href="/viewvc/cxf/trunk/distribution/src/main/release/samples/restful_dispatch/src/main/java/demo/restful/server/RestSourcePayloadProvider.java?r1=651669&amp;r2=1173027&amp;diff_format=h">colored</a>)






<pre class="vc_log">CXF-3690 using the maven stander main/java as the java source directory</pre>
</div>



<div>
<hr />

<a name="rev651669"></a>


Revision <a href="/viewvc?view=revision&amp;revision=651669"><strong>651669</strong></a> -


(<a href="/viewvc/cxf/trunk/distribution/src/main/release/samples/restful_dispatch/src/main/java/demo/restful/server/RestSourcePayloadProvider.java?revision=651669&amp;view=markup">view</a>)


(<a href="/viewvc/cxf/trunk/distribution/src/main/release/samples/restful_dispatch/src/main/java/demo/restful/server/RestSourcePayloadProvider.java?revision=651669&amp;view=co">download</a>)

(<a href="/viewvc/cxf/trunk/distribution/src/main/release/samples/restful_dispatch/src/main/java/demo/restful/server/RestSourcePayloadProvider.java?annotate=651669">annotate</a>)



- <a href="/viewvc/cxf/trunk/distribution/src/main/release/samples/restful_dispatch/src/main/java/demo/restful/server/RestSourcePayloadProvider.java?r1=651669&amp;view=log">[select for diffs]</a>




<br />

Modified

<em>Fri Apr 25 17:57:57 2008 UTC</em>
(5 years, 2 months ago)
by <em>joes</em>

<br />Original Path: <a href="/viewvc/cxf/trunk/distribution/src/main/release/samples/restful_dispatch/src/demo/restful/server/RestSourcePayloadProvider.java?view=log&amp;pathrev=651669"><em>cxf/trunk/distribution/src/main/release/samples/restful_dispatch/src/demo/restful/server/RestSourcePayloadProvider.java</em></a>









<br />File length: 3780 byte(s)







<br />Diff to <a href="/viewvc/cxf/trunk/distribution/src/main/release/samples/restful_dispatch/src/main/java/demo/restful/server/RestSourcePayloadProvider.java?r1=528895&amp;r2=651669">previous 528895</a>

(<a href="/viewvc/cxf/trunk/distribution/src/main/release/samples/restful_dispatch/src/main/java/demo/restful/server/RestSourcePayloadProvider.java?r1=528895&amp;r2=651669&amp;diff_format=h">colored</a>)






<pre class="vc_log">move cxf to tlp
</pre>
</div>



<div>
<hr />

<a name="rev528895"></a>


Revision <a href="/viewvc?view=revision&amp;revision=528895"><strong>528895</strong></a> -


(<a href="/viewvc/cxf/trunk/distribution/src/main/release/samples/restful_dispatch/src/main/java/demo/restful/server/RestSourcePayloadProvider.java?revision=528895&amp;view=markup">view</a>)


(<a href="/viewvc/cxf/trunk/distribution/src/main/release/samples/restful_dispatch/src/main/java/demo/restful/server/RestSourcePayloadProvider.java?revision=528895&amp;view=co">download</a>)

(<a href="/viewvc/cxf/trunk/distribution/src/main/release/samples/restful_dispatch/src/main/java/demo/restful/server/RestSourcePayloadProvider.java?annotate=528895">annotate</a>)



- <a href="/viewvc/cxf/trunk/distribution/src/main/release/samples/restful_dispatch/src/main/java/demo/restful/server/RestSourcePayloadProvider.java?r1=528895&amp;view=log">[select for diffs]</a>




<br />

Modified

<em>Sun Apr 15 00:14:42 2007 UTC</em>
(6 years, 3 months ago)
by <em>dandiep</em>

<br />Original Path: <a href="/viewvc/incubator/cxf/trunk/distribution/src/main/release/samples/restful_dispatch/src/demo/restful/server/RestSourcePayloadProvider.java?view=log&amp;pathrev=528895"><em>incubator/cxf/trunk/distribution/src/main/release/samples/restful_dispatch/src/demo/restful/server/RestSourcePayloadProvider.java</em></a>









<br />File length: 3780 byte(s)







<br />Diff to <a href="/viewvc/cxf/trunk/distribution/src/main/release/samples/restful_dispatch/src/main/java/demo/restful/server/RestSourcePayloadProvider.java?r1=486085&amp;r2=528895">previous 486085</a>

(<a href="/viewvc/cxf/trunk/distribution/src/main/release/samples/restful_dispatch/src/main/java/demo/restful/server/RestSourcePayloadProvider.java?r1=486085&amp;r2=528895&amp;diff_format=h">colored</a>)






<pre class="vc_log">Add a RESTful HTTP Binding demo which shows how to use JSON and XML endpoints. Move the RESTful dispatch demo to the restful_dispatch directory. Also, update the http-binding pom to use the latest JRA release with the correct organization/license info.</pre>
</div>



<div>
<hr />

<a name="rev486085"></a>


Revision <a href="/viewvc?view=revision&amp;revision=486085"><strong>486085</strong></a> -


(<a href="/viewvc/cxf/trunk/distribution/src/main/release/samples/restful_dispatch/src/main/java/demo/restful/server/RestSourcePayloadProvider.java?revision=486085&amp;view=markup">view</a>)


(<a href="/viewvc/cxf/trunk/distribution/src/main/release/samples/restful_dispatch/src/main/java/demo/restful/server/RestSourcePayloadProvider.java?revision=486085&amp;view=co">download</a>)

(<a href="/viewvc/cxf/trunk/distribution/src/main/release/samples/restful_dispatch/src/main/java/demo/restful/server/RestSourcePayloadProvider.java?annotate=486085">annotate</a>)



- <a href="/viewvc/cxf/trunk/distribution/src/main/release/samples/restful_dispatch/src/main/java/demo/restful/server/RestSourcePayloadProvider.java?r1=486085&amp;view=log">[select for diffs]</a>




<br />

Modified

<em>Tue Dec 12 10:23:17 2006 UTC</em>
(6 years, 7 months ago)
by <em>jliu</em>

<br />Original Path: <a href="/viewvc/incubator/cxf/trunk/distribution/src/main/release/samples/restful/src/demo/restful/server/RestSourcePayloadProvider.java?view=log&amp;pathrev=486085"><em>incubator/cxf/trunk/distribution/src/main/release/samples/restful/src/demo/restful/server/RestSourcePayloadProvider.java</em></a>









<br />File length: 3780 byte(s)







<br />Diff to <a href="/viewvc/cxf/trunk/distribution/src/main/release/samples/restful_dispatch/src/main/java/demo/restful/server/RestSourcePayloadProvider.java?r1=466014&amp;r2=486085">previous 466014</a>

(<a href="/viewvc/cxf/trunk/distribution/src/main/release/samples/restful_dispatch/src/main/java/demo/restful/server/RestSourcePayloadProvider.java?r1=466014&amp;r2=486085&amp;diff_format=h">colored</a>)






<pre class="vc_log">Update restful sample to use HTTP binding instead of XML binding, removes the presence of wsdl file from sample's server side code. </pre>
</div>



<div>
<hr />

<a name="rev466014"></a>


Revision <a href="/viewvc?view=revision&amp;revision=466014"><strong>466014</strong></a> -


(<a href="/viewvc/cxf/trunk/distribution/src/main/release/samples/restful_dispatch/src/main/java/demo/restful/server/RestSourcePayloadProvider.java?revision=466014&amp;view=markup">view</a>)


(<a href="/viewvc/cxf/trunk/distribution/src/main/release/samples/restful_dispatch/src/main/java/demo/restful/server/RestSourcePayloadProvider.java?revision=466014&amp;view=co">download</a>)

(<a href="/viewvc/cxf/trunk/distribution/src/main/release/samples/restful_dispatch/src/main/java/demo/restful/server/RestSourcePayloadProvider.java?annotate=466014">annotate</a>)



- <a href="/viewvc/cxf/trunk/distribution/src/main/release/samples/restful_dispatch/src/main/java/demo/restful/server/RestSourcePayloadProvider.java?r1=466014&amp;view=log">[select for diffs]</a>




<br />

Modified

<em>Fri Oct 20 06:49:20 2006 UTC</em>
(6 years, 9 months ago)
by <em>ningjiang</em>

<br />Original Path: <a href="/viewvc/incubator/cxf/trunk/distribution/src/main/release/samples/restful/src/demo/restful/server/RestSourcePayloadProvider.java?view=log&amp;pathrev=466014"><em>incubator/cxf/trunk/distribution/src/main/release/samples/restful/src/demo/restful/server/RestSourcePayloadProvider.java</em></a>









<br />File length: 3856 byte(s)







<br />Diff to <a href="/viewvc/cxf/trunk/distribution/src/main/release/samples/restful_dispatch/src/main/java/demo/restful/server/RestSourcePayloadProvider.java?r1=448148&amp;r2=466014">previous 448148</a>

(<a href="/viewvc/cxf/trunk/distribution/src/main/release/samples/restful_dispatch/src/main/java/demo/restful/server/RestSourcePayloadProvider.java?r1=448148&amp;r2=466014&amp;diff_format=h">colored</a>)






<pre class="vc_log">[JIRA CXF-133] Updated the restful demo</pre>
</div>



<div>
<hr />

<a name="rev448148"></a>


Revision <a href="/viewvc?view=revision&amp;revision=448148"><strong>448148</strong></a> -


(<a href="/viewvc/cxf/trunk/distribution/src/main/release/samples/restful_dispatch/src/main/java/demo/restful/server/RestSourcePayloadProvider.java?revision=448148&amp;view=markup">view</a>)


(<a href="/viewvc/cxf/trunk/distribution/src/main/release/samples/restful_dispatch/src/main/java/demo/restful/server/RestSourcePayloadProvider.java?revision=448148&amp;view=co">download</a>)

(<a href="/viewvc/cxf/trunk/distribution/src/main/release/samples/restful_dispatch/src/main/java/demo/restful/server/RestSourcePayloadProvider.java?annotate=448148">annotate</a>)



- <a href="/viewvc/cxf/trunk/distribution/src/main/release/samples/restful_dispatch/src/main/java/demo/restful/server/RestSourcePayloadProvider.java?r1=448148&amp;view=log">[select for diffs]</a>




<br />

Added

<em>Wed Sep 20 10:15:39 2006 UTC</em>
(6 years, 10 months ago)
by <em>jliu</em>

<br />Original Path: <a href="/viewvc/incubator/cxf/trunk/distribution/src/main/release/samples/restful/src/demo/restful/server/RestSourcePayloadProvider.java?view=log&amp;pathrev=448148"><em>incubator/cxf/trunk/distribution/src/main/release/samples/restful/src/demo/restful/server/RestSourcePayloadProvider.java</em></a>







<br />File length: 3854 byte(s)











<pre class="vc_log">[CXF-93]
* Added RESTful sample</pre>
</div>

 


 <hr />
<p><a name="diff"></a>
This form allows you to request diffs between any two revisions of this file.
For each of the two "sides" of the diff,

enter a numeric revision.

</p>
<form method="get" action="/viewvc/cxf/trunk/distribution/src/main/release/samples/restful_dispatch/src/main/java/demo/restful/server/RestSourcePayloadProvider.java" id="diff_select">
<table cellpadding="2" cellspacing="0" class="auto">
<tr>
<td>&nbsp;</td>
<td>
<input type="hidden" name="view" value="diff"/>
Diffs between

<input type="text" size="12" name="r1"
value="1411230" />

and

<input type="text" size="12" name="r2" value="448148" />

</td>
</tr>
<tr>
<td>&nbsp;</td>
<td>
Type of Diff should be a
<select name="diff_format" onchange="submit()">
<option value="h" >Colored Diff</option>
<option value="l" >Long Colored Diff</option>
<option value="f" >Full Colored Diff</option>
<option value="u" selected="selected">Unidiff</option>
<option value="c" >Context Diff</option>
<option value="s" >Side by Side</option>
</select>
<input type="submit" value=" Get Diffs " />
</td>
</tr>
</table>
</form>





<hr />
<table>
<tr>
<td><address><a href="mailto:infrastructure at apache.org">infrastructure at apache.org</a></address></td>
<td style="text-align: right;"><strong><a href="/viewvc/*docroot*/help_log.html">ViewVC Help</a></strong></td>
</tr>
<tr>
<td>Powered by <a href="http://viewvc.tigris.org/">ViewVC 1.2-dev</a></td>
<td style="text-align: right;">&nbsp;</td>
</tr>
</table>
</body>
</html>


