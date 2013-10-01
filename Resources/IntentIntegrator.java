



<!DOCTYPE html>
<html>
<head>
 <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" >
 <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" >
 
 <meta name="ROBOTS" content="NOARCHIVE">
 
 <link rel="icon" type="image/vnd.microsoft.icon" href="http://www.gstatic.com/codesite/ph/images/phosting.ico">
 
 
 <script type="text/javascript">
 
 
 
 
 var codesite_token = "fYejgLYFwOdcd8x9Z_WH-vpk9Fw:1376820832250";
 
 
 var CS_env = {"assetVersionPath":"http://www.gstatic.com/codesite/ph/16876283342775096309","profileUrl":"/u/113418019975187221874/","projectHomeUrl":"/p/zxing","token":"fYejgLYFwOdcd8x9Z_WH-vpk9Fw:1376820832250","relativeBaseUrl":"","domainName":null,"assetHostPath":"http://www.gstatic.com/codesite/ph","projectName":"zxing","loggedInUserEmail":"m.mirys@gmail.com"};
 var _gaq = _gaq || [];
 _gaq.push(
 ['siteTracker._setAccount', 'UA-18071-1'],
 ['siteTracker._trackPageview']);
 
 _gaq.push(
 ['projectTracker._setAccount', 'UA-788492-4'],
 ['projectTracker._trackPageview']);
 
 (function() {
 var ga = document.createElement('script'); ga.type = 'text/javascript'; ga.async = true;
 ga.src = ('https:' == document.location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js';
 (document.getElementsByTagName('head')[0] || document.getElementsByTagName('body')[0]).appendChild(ga);
 })();
 
 </script>
 
 
 <title>IntentIntegrator.java - 
 zxing -
 
 
 Multi-format 1D/2D barcode image processing library with clients for Android, Java - Google Project Hosting
 </title>
 <link type="text/css" rel="stylesheet" href="http://www.gstatic.com/codesite/ph/16876283342775096309/css/core.css">
 
 <link type="text/css" rel="stylesheet" href="http://www.gstatic.com/codesite/ph/16876283342775096309/css/ph_detail.css" >
 
 
 <link type="text/css" rel="stylesheet" href="http://www.gstatic.com/codesite/ph/16876283342775096309/css/d_sb.css" >
 
 
 
<!--[if IE]>
 <link type="text/css" rel="stylesheet" href="http://www.gstatic.com/codesite/ph/16876283342775096309/css/d_ie.css" >
<![endif]-->
 <style type="text/css">
 .menuIcon.off { background: no-repeat url(http://www.gstatic.com/codesite/ph/images/dropdown_sprite.gif) 0 -42px }
 .menuIcon.on { background: no-repeat url(http://www.gstatic.com/codesite/ph/images/dropdown_sprite.gif) 0 -28px }
 .menuIcon.down { background: no-repeat url(http://www.gstatic.com/codesite/ph/images/dropdown_sprite.gif) 0 0; }
 
 
 
  tr.inline_comment {
 background: #fff;
 vertical-align: top;
 }
 div.draft, div.published {
 padding: .3em;
 border: 1px solid #999; 
 margin-bottom: .1em;
 font-family: arial, sans-serif;
 max-width: 60em;
 }
 div.draft {
 background: #ffa;
 } 
 div.published {
 background: #e5ecf9;
 }
 div.published .body, div.draft .body {
 padding: .5em .1em .1em .1em;
 max-width: 60em;
 white-space: pre-wrap;
 white-space: -moz-pre-wrap;
 white-space: -pre-wrap;
 white-space: -o-pre-wrap;
 word-wrap: break-word;
 font-size: 1em;
 }
 div.draft .actions {
 margin-left: 1em;
 font-size: 90%;
 }
 div.draft form {
 padding: .5em .5em .5em 0;
 }
 div.draft textarea, div.published textarea {
 width: 95%;
 height: 10em;
 font-family: arial, sans-serif;
 margin-bottom: .5em;
 }

 
 .nocursor, .nocursor td, .cursor_hidden, .cursor_hidden td {
 background-color: white;
 height: 2px;
 }
 .cursor, .cursor td {
 background-color: darkblue;
 height: 2px;
 display: '';
 }
 
 
.list {
 border: 1px solid white;
 border-bottom: 0;
}

 
 </style>
</head>
<body class="t4">
<script type="text/javascript">
 window.___gcfg = {lang: 'en'};
 (function() 
 {var po = document.createElement("script");
 po.type = "text/javascript"; po.async = true;po.src = "https://apis.google.com/js/plusone.js";
 var s = document.getElementsByTagName("script")[0];
 s.parentNode.insertBefore(po, s);
 })();
</script>
<div class="headbg">

 <div id="gaia">
 

 <span>
 
 
 
 <a href="#" id="multilogin-dropdown" onclick="return false;"
 ><u><b>m.mirys@gmail.com</b></u> <small>&#9660;</small></a>
 
 
 | <a href="/u/113418019975187221874/" id="projects-dropdown" onclick="return false;"
 ><u>My favorites</u> <small>&#9660;</small></a>
 | <a href="/u/113418019975187221874/" onclick="_CS_click('/gb/ph/profile');"
 title="Profile, Updates, and Settings"
 ><u>Profile</u></a>
 | <a href="https://www.google.com/accounts/Logout?continue=http%3A%2F%2Fcode.google.com%2Fp%2Fzxing%2Fsource%2Fbrowse%2Ftrunk%2Fandroid-integration%2Fsrc%2Fcom%2Fgoogle%2Fzxing%2Fintegration%2Fandroid%2FIntentIntegrator.java" 
 onclick="_CS_click('/gb/ph/signout');"
 ><u>Sign out</u></a>
 
 </span>

 </div>

 <div class="gbh" style="left: 0pt;"></div>
 <div class="gbh" style="right: 0pt;"></div>
 
 
 <div style="height: 1px"></div>
<!--[if lte IE 7]>
<div style="text-align:center;">
Your version of Internet Explorer is not supported. Try a browser that
contributes to open source, such as <a href="http://www.firefox.com">Firefox</a>,
<a href="http://www.google.com/chrome">Google Chrome</a>, or
<a href="http://code.google.com/chrome/chromeframe/">Google Chrome Frame</a>.
</div>
<![endif]-->



 <table style="padding:0px; margin: 0px 0px 10px 0px; width:100%" cellpadding="0" cellspacing="0"
 itemscope itemtype="http://schema.org/CreativeWork">
 <tr style="height: 58px;">
 
 
 
 <td id="plogo">
 <link itemprop="url" href="/p/zxing">
 <a href="/p/zxing/">
 
 
 <img src="/p/zxing/logo?cct=1373550859"
 alt="Logo" itemprop="image">
 
 </a>
 </td>
 
 <td style="padding-left: 0.5em">
 
 <div id="pname">
 <a href="/p/zxing/"><span itemprop="name">zxing</span></a>
 </div>
 
 <div id="psum">
 <a id="project_summary_link"
 href="/p/zxing/"><span itemprop="description">Multi-format 1D/2D barcode image processing library with clients for Android, Java</span></a>
 
 </div>
 
 
 </td>
 <td style="white-space:nowrap;text-align:right; vertical-align:bottom;">
 
 <form action="/hosting/search">
 <input size="30" name="q" value="" type="text">
 
 <input type="submit" name="projectsearch" value="Search projects" >
 </form>
 
 </tr>
 </table>

</div>

 
<div id="mt" class="gtb"> 
 <a href="/p/zxing/" class="tab ">Project&nbsp;Home</a>
 
 
 
 
 <a href="/p/zxing/downloads/list" class="tab ">Downloads</a>
 
 
 
 
 
 <a href="/p/zxing/w/list" class="tab ">Wiki</a>
 
 
 
 
 
 <a href="/p/zxing/issues/list"
 class="tab ">Issues</a>
 
 
 
 
 
 <a href="/p/zxing/source/checkout"
 class="tab active">Source</a>
 
 
 
 
 
 
 
 
 <div class=gtbc></div>
</div>
<table cellspacing="0" cellpadding="0" width="100%" align="center" border="0" class="st">
 <tr>
 
 
 
 
 
 
 <td class="subt">
 <div class="st2">
 <div class="isf">
 
 


 <span class="inst1"><a href="/p/zxing/source/checkout">Checkout</a></span> &nbsp;
 <span class="inst2"><a href="/p/zxing/source/browse/trunk">Browse</a></span> &nbsp;
 <span class="inst3"><a href="/p/zxing/source/list">Changes</a></span> &nbsp;
 
 
 
 
 
 
 
 </form>
 <script type="text/javascript">
 
 function codesearchQuery(form) {
 var query = document.getElementById('q').value;
 if (query) { form.action += '%20' + query; }
 }
 </script>
 </div>
</div>

 </td>
 
 
 
 <td align="right" valign="top" class="bevel-right"></td>
 </tr>
</table>


<script type="text/javascript">
 var cancelBubble = false;
 function _go(url) { document.location = url; }
</script>
<div id="maincol"
 
>

 




<div class="expand">
<div id="colcontrol">
<style type="text/css">
 #file_flipper { white-space: nowrap; padding-right: 2em; }
 #file_flipper.hidden { display: none; }
 #file_flipper .pagelink { color: #0000CC; text-decoration: underline; }
 #file_flipper #visiblefiles { padding-left: 0.5em; padding-right: 0.5em; }
</style>
<table id="nav_and_rev" class="list"
 cellpadding="0" cellspacing="0" width="100%">
 <tr>
 
 <td nowrap="nowrap" class="src_crumbs src_nav" width="33%">
 <strong class="src_nav">Source path:&nbsp;</strong>
 <span id="crumb_root">
 
 <a href="/p/zxing/source/browse/">svn</a>/&nbsp;</span>
 <span id="crumb_links" class="ifClosed"><a href="/p/zxing/source/browse/trunk/">trunk</a><span class="sp">/&nbsp;</span><a href="/p/zxing/source/browse/trunk/android-integration/">android-integration</a><span class="sp">/&nbsp;</span><a href="/p/zxing/source/browse/trunk/android-integration/src/">src</a><span class="sp">/&nbsp;</span><a href="/p/zxing/source/browse/trunk/android-integration/src/com/">com</a><span class="sp">/&nbsp;</span><a href="/p/zxing/source/browse/trunk/android-integration/src/com/google/">google</a><span class="sp">/&nbsp;</span><a href="/p/zxing/source/browse/trunk/android-integration/src/com/google/zxing/">zxing</a><span class="sp">/&nbsp;</span><a href="/p/zxing/source/browse/trunk/android-integration/src/com/google/zxing/integration/">integration</a><span class="sp">/&nbsp;</span><a href="/p/zxing/source/browse/trunk/android-integration/src/com/google/zxing/integration/android/">android</a><span class="sp">/&nbsp;</span>IntentIntegrator.java</span>
 
 


 </td>
 
 
 <td nowrap="nowrap" width="33%" align="center">
 <a href="/p/zxing/source/browse/trunk/android-integration/src/com/google/zxing/integration/android/IntentIntegrator.java?edit=1"
 ><img src="http://www.gstatic.com/codesite/ph/images/pencil-y14.png"
 class="edit_icon">Edit file</a>
 </td>
 
 
 <td nowrap="nowrap" width="33%" align="right">
 <table cellpadding="0" cellspacing="0" style="font-size: 100%"><tr>
 
 
 <td class="flipper">
 <ul class="leftside">
 
 <li><a href="/p/zxing/source/browse/trunk/android-integration/src/com/google/zxing/integration/android/IntentIntegrator.java?r=2661" title="Previous">&lsaquo;r2661</a></li>
 
 </ul>
 </td>
 
 <td class="flipper"><b>r2867</b></td>
 
 </tr></table>
 </td> 
 </tr>
</table>

<div class="fc">
 
 
 
<style type="text/css">
.undermouse span {
 background-image: url(http://www.gstatic.com/codesite/ph/images/comments.gif); }
</style>
<table class="opened" id="review_comment_area"
><tr>
<td id="nums">
<pre><table width="100%"><tr class="nocursor"><td></td></tr></table></pre>
<pre><table width="100%" id="nums_table_0"><tr id="gr_svn2867_1"

><td id="1"><a href="#1">1</a></td></tr
><tr id="gr_svn2867_2"

><td id="2"><a href="#2">2</a></td></tr
><tr id="gr_svn2867_3"

><td id="3"><a href="#3">3</a></td></tr
><tr id="gr_svn2867_4"

><td id="4"><a href="#4">4</a></td></tr
><tr id="gr_svn2867_5"

><td id="5"><a href="#5">5</a></td></tr
><tr id="gr_svn2867_6"

><td id="6"><a href="#6">6</a></td></tr
><tr id="gr_svn2867_7"

><td id="7"><a href="#7">7</a></td></tr
><tr id="gr_svn2867_8"

><td id="8"><a href="#8">8</a></td></tr
><tr id="gr_svn2867_9"

><td id="9"><a href="#9">9</a></td></tr
><tr id="gr_svn2867_10"

><td id="10"><a href="#10">10</a></td></tr
><tr id="gr_svn2867_11"

><td id="11"><a href="#11">11</a></td></tr
><tr id="gr_svn2867_12"

><td id="12"><a href="#12">12</a></td></tr
><tr id="gr_svn2867_13"

><td id="13"><a href="#13">13</a></td></tr
><tr id="gr_svn2867_14"

><td id="14"><a href="#14">14</a></td></tr
><tr id="gr_svn2867_15"

><td id="15"><a href="#15">15</a></td></tr
><tr id="gr_svn2867_16"

><td id="16"><a href="#16">16</a></td></tr
><tr id="gr_svn2867_17"

><td id="17"><a href="#17">17</a></td></tr
><tr id="gr_svn2867_18"

><td id="18"><a href="#18">18</a></td></tr
><tr id="gr_svn2867_19"

><td id="19"><a href="#19">19</a></td></tr
><tr id="gr_svn2867_20"

><td id="20"><a href="#20">20</a></td></tr
><tr id="gr_svn2867_21"

><td id="21"><a href="#21">21</a></td></tr
><tr id="gr_svn2867_22"

><td id="22"><a href="#22">22</a></td></tr
><tr id="gr_svn2867_23"

><td id="23"><a href="#23">23</a></td></tr
><tr id="gr_svn2867_24"

><td id="24"><a href="#24">24</a></td></tr
><tr id="gr_svn2867_25"

><td id="25"><a href="#25">25</a></td></tr
><tr id="gr_svn2867_26"

><td id="26"><a href="#26">26</a></td></tr
><tr id="gr_svn2867_27"

><td id="27"><a href="#27">27</a></td></tr
><tr id="gr_svn2867_28"

><td id="28"><a href="#28">28</a></td></tr
><tr id="gr_svn2867_29"

><td id="29"><a href="#29">29</a></td></tr
><tr id="gr_svn2867_30"

><td id="30"><a href="#30">30</a></td></tr
><tr id="gr_svn2867_31"

><td id="31"><a href="#31">31</a></td></tr
><tr id="gr_svn2867_32"

><td id="32"><a href="#32">32</a></td></tr
><tr id="gr_svn2867_33"

><td id="33"><a href="#33">33</a></td></tr
><tr id="gr_svn2867_34"

><td id="34"><a href="#34">34</a></td></tr
><tr id="gr_svn2867_35"

><td id="35"><a href="#35">35</a></td></tr
><tr id="gr_svn2867_36"

><td id="36"><a href="#36">36</a></td></tr
><tr id="gr_svn2867_37"

><td id="37"><a href="#37">37</a></td></tr
><tr id="gr_svn2867_38"

><td id="38"><a href="#38">38</a></td></tr
><tr id="gr_svn2867_39"

><td id="39"><a href="#39">39</a></td></tr
><tr id="gr_svn2867_40"

><td id="40"><a href="#40">40</a></td></tr
><tr id="gr_svn2867_41"

><td id="41"><a href="#41">41</a></td></tr
><tr id="gr_svn2867_42"

><td id="42"><a href="#42">42</a></td></tr
><tr id="gr_svn2867_43"

><td id="43"><a href="#43">43</a></td></tr
><tr id="gr_svn2867_44"

><td id="44"><a href="#44">44</a></td></tr
><tr id="gr_svn2867_45"

><td id="45"><a href="#45">45</a></td></tr
><tr id="gr_svn2867_46"

><td id="46"><a href="#46">46</a></td></tr
><tr id="gr_svn2867_47"

><td id="47"><a href="#47">47</a></td></tr
><tr id="gr_svn2867_48"

><td id="48"><a href="#48">48</a></td></tr
><tr id="gr_svn2867_49"

><td id="49"><a href="#49">49</a></td></tr
><tr id="gr_svn2867_50"

><td id="50"><a href="#50">50</a></td></tr
><tr id="gr_svn2867_51"

><td id="51"><a href="#51">51</a></td></tr
><tr id="gr_svn2867_52"

><td id="52"><a href="#52">52</a></td></tr
><tr id="gr_svn2867_53"

><td id="53"><a href="#53">53</a></td></tr
><tr id="gr_svn2867_54"

><td id="54"><a href="#54">54</a></td></tr
><tr id="gr_svn2867_55"

><td id="55"><a href="#55">55</a></td></tr
><tr id="gr_svn2867_56"

><td id="56"><a href="#56">56</a></td></tr
><tr id="gr_svn2867_57"

><td id="57"><a href="#57">57</a></td></tr
><tr id="gr_svn2867_58"

><td id="58"><a href="#58">58</a></td></tr
><tr id="gr_svn2867_59"

><td id="59"><a href="#59">59</a></td></tr
><tr id="gr_svn2867_60"

><td id="60"><a href="#60">60</a></td></tr
><tr id="gr_svn2867_61"

><td id="61"><a href="#61">61</a></td></tr
><tr id="gr_svn2867_62"

><td id="62"><a href="#62">62</a></td></tr
><tr id="gr_svn2867_63"

><td id="63"><a href="#63">63</a></td></tr
><tr id="gr_svn2867_64"

><td id="64"><a href="#64">64</a></td></tr
><tr id="gr_svn2867_65"

><td id="65"><a href="#65">65</a></td></tr
><tr id="gr_svn2867_66"

><td id="66"><a href="#66">66</a></td></tr
><tr id="gr_svn2867_67"

><td id="67"><a href="#67">67</a></td></tr
><tr id="gr_svn2867_68"

><td id="68"><a href="#68">68</a></td></tr
><tr id="gr_svn2867_69"

><td id="69"><a href="#69">69</a></td></tr
><tr id="gr_svn2867_70"

><td id="70"><a href="#70">70</a></td></tr
><tr id="gr_svn2867_71"

><td id="71"><a href="#71">71</a></td></tr
><tr id="gr_svn2867_72"

><td id="72"><a href="#72">72</a></td></tr
><tr id="gr_svn2867_73"

><td id="73"><a href="#73">73</a></td></tr
><tr id="gr_svn2867_74"

><td id="74"><a href="#74">74</a></td></tr
><tr id="gr_svn2867_75"

><td id="75"><a href="#75">75</a></td></tr
><tr id="gr_svn2867_76"

><td id="76"><a href="#76">76</a></td></tr
><tr id="gr_svn2867_77"

><td id="77"><a href="#77">77</a></td></tr
><tr id="gr_svn2867_78"

><td id="78"><a href="#78">78</a></td></tr
><tr id="gr_svn2867_79"

><td id="79"><a href="#79">79</a></td></tr
><tr id="gr_svn2867_80"

><td id="80"><a href="#80">80</a></td></tr
><tr id="gr_svn2867_81"

><td id="81"><a href="#81">81</a></td></tr
><tr id="gr_svn2867_82"

><td id="82"><a href="#82">82</a></td></tr
><tr id="gr_svn2867_83"

><td id="83"><a href="#83">83</a></td></tr
><tr id="gr_svn2867_84"

><td id="84"><a href="#84">84</a></td></tr
><tr id="gr_svn2867_85"

><td id="85"><a href="#85">85</a></td></tr
><tr id="gr_svn2867_86"

><td id="86"><a href="#86">86</a></td></tr
><tr id="gr_svn2867_87"

><td id="87"><a href="#87">87</a></td></tr
><tr id="gr_svn2867_88"

><td id="88"><a href="#88">88</a></td></tr
><tr id="gr_svn2867_89"

><td id="89"><a href="#89">89</a></td></tr
><tr id="gr_svn2867_90"

><td id="90"><a href="#90">90</a></td></tr
><tr id="gr_svn2867_91"

><td id="91"><a href="#91">91</a></td></tr
><tr id="gr_svn2867_92"

><td id="92"><a href="#92">92</a></td></tr
><tr id="gr_svn2867_93"

><td id="93"><a href="#93">93</a></td></tr
><tr id="gr_svn2867_94"

><td id="94"><a href="#94">94</a></td></tr
><tr id="gr_svn2867_95"

><td id="95"><a href="#95">95</a></td></tr
><tr id="gr_svn2867_96"

><td id="96"><a href="#96">96</a></td></tr
><tr id="gr_svn2867_97"

><td id="97"><a href="#97">97</a></td></tr
><tr id="gr_svn2867_98"

><td id="98"><a href="#98">98</a></td></tr
><tr id="gr_svn2867_99"

><td id="99"><a href="#99">99</a></td></tr
><tr id="gr_svn2867_100"

><td id="100"><a href="#100">100</a></td></tr
><tr id="gr_svn2867_101"

><td id="101"><a href="#101">101</a></td></tr
><tr id="gr_svn2867_102"

><td id="102"><a href="#102">102</a></td></tr
><tr id="gr_svn2867_103"

><td id="103"><a href="#103">103</a></td></tr
><tr id="gr_svn2867_104"

><td id="104"><a href="#104">104</a></td></tr
><tr id="gr_svn2867_105"

><td id="105"><a href="#105">105</a></td></tr
><tr id="gr_svn2867_106"

><td id="106"><a href="#106">106</a></td></tr
><tr id="gr_svn2867_107"

><td id="107"><a href="#107">107</a></td></tr
><tr id="gr_svn2867_108"

><td id="108"><a href="#108">108</a></td></tr
><tr id="gr_svn2867_109"

><td id="109"><a href="#109">109</a></td></tr
><tr id="gr_svn2867_110"

><td id="110"><a href="#110">110</a></td></tr
><tr id="gr_svn2867_111"

><td id="111"><a href="#111">111</a></td></tr
><tr id="gr_svn2867_112"

><td id="112"><a href="#112">112</a></td></tr
><tr id="gr_svn2867_113"

><td id="113"><a href="#113">113</a></td></tr
><tr id="gr_svn2867_114"

><td id="114"><a href="#114">114</a></td></tr
><tr id="gr_svn2867_115"

><td id="115"><a href="#115">115</a></td></tr
><tr id="gr_svn2867_116"

><td id="116"><a href="#116">116</a></td></tr
><tr id="gr_svn2867_117"

><td id="117"><a href="#117">117</a></td></tr
><tr id="gr_svn2867_118"

><td id="118"><a href="#118">118</a></td></tr
><tr id="gr_svn2867_119"

><td id="119"><a href="#119">119</a></td></tr
><tr id="gr_svn2867_120"

><td id="120"><a href="#120">120</a></td></tr
><tr id="gr_svn2867_121"

><td id="121"><a href="#121">121</a></td></tr
><tr id="gr_svn2867_122"

><td id="122"><a href="#122">122</a></td></tr
><tr id="gr_svn2867_123"

><td id="123"><a href="#123">123</a></td></tr
><tr id="gr_svn2867_124"

><td id="124"><a href="#124">124</a></td></tr
><tr id="gr_svn2867_125"

><td id="125"><a href="#125">125</a></td></tr
><tr id="gr_svn2867_126"

><td id="126"><a href="#126">126</a></td></tr
><tr id="gr_svn2867_127"

><td id="127"><a href="#127">127</a></td></tr
><tr id="gr_svn2867_128"

><td id="128"><a href="#128">128</a></td></tr
><tr id="gr_svn2867_129"

><td id="129"><a href="#129">129</a></td></tr
><tr id="gr_svn2867_130"

><td id="130"><a href="#130">130</a></td></tr
><tr id="gr_svn2867_131"

><td id="131"><a href="#131">131</a></td></tr
><tr id="gr_svn2867_132"

><td id="132"><a href="#132">132</a></td></tr
><tr id="gr_svn2867_133"

><td id="133"><a href="#133">133</a></td></tr
><tr id="gr_svn2867_134"

><td id="134"><a href="#134">134</a></td></tr
><tr id="gr_svn2867_135"

><td id="135"><a href="#135">135</a></td></tr
><tr id="gr_svn2867_136"

><td id="136"><a href="#136">136</a></td></tr
><tr id="gr_svn2867_137"

><td id="137"><a href="#137">137</a></td></tr
><tr id="gr_svn2867_138"

><td id="138"><a href="#138">138</a></td></tr
><tr id="gr_svn2867_139"

><td id="139"><a href="#139">139</a></td></tr
><tr id="gr_svn2867_140"

><td id="140"><a href="#140">140</a></td></tr
><tr id="gr_svn2867_141"

><td id="141"><a href="#141">141</a></td></tr
><tr id="gr_svn2867_142"

><td id="142"><a href="#142">142</a></td></tr
><tr id="gr_svn2867_143"

><td id="143"><a href="#143">143</a></td></tr
><tr id="gr_svn2867_144"

><td id="144"><a href="#144">144</a></td></tr
><tr id="gr_svn2867_145"

><td id="145"><a href="#145">145</a></td></tr
><tr id="gr_svn2867_146"

><td id="146"><a href="#146">146</a></td></tr
><tr id="gr_svn2867_147"

><td id="147"><a href="#147">147</a></td></tr
><tr id="gr_svn2867_148"

><td id="148"><a href="#148">148</a></td></tr
><tr id="gr_svn2867_149"

><td id="149"><a href="#149">149</a></td></tr
><tr id="gr_svn2867_150"

><td id="150"><a href="#150">150</a></td></tr
><tr id="gr_svn2867_151"

><td id="151"><a href="#151">151</a></td></tr
><tr id="gr_svn2867_152"

><td id="152"><a href="#152">152</a></td></tr
><tr id="gr_svn2867_153"

><td id="153"><a href="#153">153</a></td></tr
><tr id="gr_svn2867_154"

><td id="154"><a href="#154">154</a></td></tr
><tr id="gr_svn2867_155"

><td id="155"><a href="#155">155</a></td></tr
><tr id="gr_svn2867_156"

><td id="156"><a href="#156">156</a></td></tr
><tr id="gr_svn2867_157"

><td id="157"><a href="#157">157</a></td></tr
><tr id="gr_svn2867_158"

><td id="158"><a href="#158">158</a></td></tr
><tr id="gr_svn2867_159"

><td id="159"><a href="#159">159</a></td></tr
><tr id="gr_svn2867_160"

><td id="160"><a href="#160">160</a></td></tr
><tr id="gr_svn2867_161"

><td id="161"><a href="#161">161</a></td></tr
><tr id="gr_svn2867_162"

><td id="162"><a href="#162">162</a></td></tr
><tr id="gr_svn2867_163"

><td id="163"><a href="#163">163</a></td></tr
><tr id="gr_svn2867_164"

><td id="164"><a href="#164">164</a></td></tr
><tr id="gr_svn2867_165"

><td id="165"><a href="#165">165</a></td></tr
><tr id="gr_svn2867_166"

><td id="166"><a href="#166">166</a></td></tr
><tr id="gr_svn2867_167"

><td id="167"><a href="#167">167</a></td></tr
><tr id="gr_svn2867_168"

><td id="168"><a href="#168">168</a></td></tr
><tr id="gr_svn2867_169"

><td id="169"><a href="#169">169</a></td></tr
><tr id="gr_svn2867_170"

><td id="170"><a href="#170">170</a></td></tr
><tr id="gr_svn2867_171"

><td id="171"><a href="#171">171</a></td></tr
><tr id="gr_svn2867_172"

><td id="172"><a href="#172">172</a></td></tr
><tr id="gr_svn2867_173"

><td id="173"><a href="#173">173</a></td></tr
><tr id="gr_svn2867_174"

><td id="174"><a href="#174">174</a></td></tr
><tr id="gr_svn2867_175"

><td id="175"><a href="#175">175</a></td></tr
><tr id="gr_svn2867_176"

><td id="176"><a href="#176">176</a></td></tr
><tr id="gr_svn2867_177"

><td id="177"><a href="#177">177</a></td></tr
><tr id="gr_svn2867_178"

><td id="178"><a href="#178">178</a></td></tr
><tr id="gr_svn2867_179"

><td id="179"><a href="#179">179</a></td></tr
><tr id="gr_svn2867_180"

><td id="180"><a href="#180">180</a></td></tr
><tr id="gr_svn2867_181"

><td id="181"><a href="#181">181</a></td></tr
><tr id="gr_svn2867_182"

><td id="182"><a href="#182">182</a></td></tr
><tr id="gr_svn2867_183"

><td id="183"><a href="#183">183</a></td></tr
><tr id="gr_svn2867_184"

><td id="184"><a href="#184">184</a></td></tr
><tr id="gr_svn2867_185"

><td id="185"><a href="#185">185</a></td></tr
><tr id="gr_svn2867_186"

><td id="186"><a href="#186">186</a></td></tr
><tr id="gr_svn2867_187"

><td id="187"><a href="#187">187</a></td></tr
><tr id="gr_svn2867_188"

><td id="188"><a href="#188">188</a></td></tr
><tr id="gr_svn2867_189"

><td id="189"><a href="#189">189</a></td></tr
><tr id="gr_svn2867_190"

><td id="190"><a href="#190">190</a></td></tr
><tr id="gr_svn2867_191"

><td id="191"><a href="#191">191</a></td></tr
><tr id="gr_svn2867_192"

><td id="192"><a href="#192">192</a></td></tr
><tr id="gr_svn2867_193"

><td id="193"><a href="#193">193</a></td></tr
><tr id="gr_svn2867_194"

><td id="194"><a href="#194">194</a></td></tr
><tr id="gr_svn2867_195"

><td id="195"><a href="#195">195</a></td></tr
><tr id="gr_svn2867_196"

><td id="196"><a href="#196">196</a></td></tr
><tr id="gr_svn2867_197"

><td id="197"><a href="#197">197</a></td></tr
><tr id="gr_svn2867_198"

><td id="198"><a href="#198">198</a></td></tr
><tr id="gr_svn2867_199"

><td id="199"><a href="#199">199</a></td></tr
><tr id="gr_svn2867_200"

><td id="200"><a href="#200">200</a></td></tr
><tr id="gr_svn2867_201"

><td id="201"><a href="#201">201</a></td></tr
><tr id="gr_svn2867_202"

><td id="202"><a href="#202">202</a></td></tr
><tr id="gr_svn2867_203"

><td id="203"><a href="#203">203</a></td></tr
><tr id="gr_svn2867_204"

><td id="204"><a href="#204">204</a></td></tr
><tr id="gr_svn2867_205"

><td id="205"><a href="#205">205</a></td></tr
><tr id="gr_svn2867_206"

><td id="206"><a href="#206">206</a></td></tr
><tr id="gr_svn2867_207"

><td id="207"><a href="#207">207</a></td></tr
><tr id="gr_svn2867_208"

><td id="208"><a href="#208">208</a></td></tr
><tr id="gr_svn2867_209"

><td id="209"><a href="#209">209</a></td></tr
><tr id="gr_svn2867_210"

><td id="210"><a href="#210">210</a></td></tr
><tr id="gr_svn2867_211"

><td id="211"><a href="#211">211</a></td></tr
><tr id="gr_svn2867_212"

><td id="212"><a href="#212">212</a></td></tr
><tr id="gr_svn2867_213"

><td id="213"><a href="#213">213</a></td></tr
><tr id="gr_svn2867_214"

><td id="214"><a href="#214">214</a></td></tr
><tr id="gr_svn2867_215"

><td id="215"><a href="#215">215</a></td></tr
><tr id="gr_svn2867_216"

><td id="216"><a href="#216">216</a></td></tr
><tr id="gr_svn2867_217"

><td id="217"><a href="#217">217</a></td></tr
><tr id="gr_svn2867_218"

><td id="218"><a href="#218">218</a></td></tr
><tr id="gr_svn2867_219"

><td id="219"><a href="#219">219</a></td></tr
><tr id="gr_svn2867_220"

><td id="220"><a href="#220">220</a></td></tr
><tr id="gr_svn2867_221"

><td id="221"><a href="#221">221</a></td></tr
><tr id="gr_svn2867_222"

><td id="222"><a href="#222">222</a></td></tr
><tr id="gr_svn2867_223"

><td id="223"><a href="#223">223</a></td></tr
><tr id="gr_svn2867_224"

><td id="224"><a href="#224">224</a></td></tr
><tr id="gr_svn2867_225"

><td id="225"><a href="#225">225</a></td></tr
><tr id="gr_svn2867_226"

><td id="226"><a href="#226">226</a></td></tr
><tr id="gr_svn2867_227"

><td id="227"><a href="#227">227</a></td></tr
><tr id="gr_svn2867_228"

><td id="228"><a href="#228">228</a></td></tr
><tr id="gr_svn2867_229"

><td id="229"><a href="#229">229</a></td></tr
><tr id="gr_svn2867_230"

><td id="230"><a href="#230">230</a></td></tr
><tr id="gr_svn2867_231"

><td id="231"><a href="#231">231</a></td></tr
><tr id="gr_svn2867_232"

><td id="232"><a href="#232">232</a></td></tr
><tr id="gr_svn2867_233"

><td id="233"><a href="#233">233</a></td></tr
><tr id="gr_svn2867_234"

><td id="234"><a href="#234">234</a></td></tr
><tr id="gr_svn2867_235"

><td id="235"><a href="#235">235</a></td></tr
><tr id="gr_svn2867_236"

><td id="236"><a href="#236">236</a></td></tr
><tr id="gr_svn2867_237"

><td id="237"><a href="#237">237</a></td></tr
><tr id="gr_svn2867_238"

><td id="238"><a href="#238">238</a></td></tr
><tr id="gr_svn2867_239"

><td id="239"><a href="#239">239</a></td></tr
><tr id="gr_svn2867_240"

><td id="240"><a href="#240">240</a></td></tr
><tr id="gr_svn2867_241"

><td id="241"><a href="#241">241</a></td></tr
><tr id="gr_svn2867_242"

><td id="242"><a href="#242">242</a></td></tr
><tr id="gr_svn2867_243"

><td id="243"><a href="#243">243</a></td></tr
><tr id="gr_svn2867_244"

><td id="244"><a href="#244">244</a></td></tr
><tr id="gr_svn2867_245"

><td id="245"><a href="#245">245</a></td></tr
><tr id="gr_svn2867_246"

><td id="246"><a href="#246">246</a></td></tr
><tr id="gr_svn2867_247"

><td id="247"><a href="#247">247</a></td></tr
><tr id="gr_svn2867_248"

><td id="248"><a href="#248">248</a></td></tr
><tr id="gr_svn2867_249"

><td id="249"><a href="#249">249</a></td></tr
><tr id="gr_svn2867_250"

><td id="250"><a href="#250">250</a></td></tr
><tr id="gr_svn2867_251"

><td id="251"><a href="#251">251</a></td></tr
><tr id="gr_svn2867_252"

><td id="252"><a href="#252">252</a></td></tr
><tr id="gr_svn2867_253"

><td id="253"><a href="#253">253</a></td></tr
><tr id="gr_svn2867_254"

><td id="254"><a href="#254">254</a></td></tr
><tr id="gr_svn2867_255"

><td id="255"><a href="#255">255</a></td></tr
><tr id="gr_svn2867_256"

><td id="256"><a href="#256">256</a></td></tr
><tr id="gr_svn2867_257"

><td id="257"><a href="#257">257</a></td></tr
><tr id="gr_svn2867_258"

><td id="258"><a href="#258">258</a></td></tr
><tr id="gr_svn2867_259"

><td id="259"><a href="#259">259</a></td></tr
><tr id="gr_svn2867_260"

><td id="260"><a href="#260">260</a></td></tr
><tr id="gr_svn2867_261"

><td id="261"><a href="#261">261</a></td></tr
><tr id="gr_svn2867_262"

><td id="262"><a href="#262">262</a></td></tr
><tr id="gr_svn2867_263"

><td id="263"><a href="#263">263</a></td></tr
><tr id="gr_svn2867_264"

><td id="264"><a href="#264">264</a></td></tr
><tr id="gr_svn2867_265"

><td id="265"><a href="#265">265</a></td></tr
><tr id="gr_svn2867_266"

><td id="266"><a href="#266">266</a></td></tr
><tr id="gr_svn2867_267"

><td id="267"><a href="#267">267</a></td></tr
><tr id="gr_svn2867_268"

><td id="268"><a href="#268">268</a></td></tr
><tr id="gr_svn2867_269"

><td id="269"><a href="#269">269</a></td></tr
><tr id="gr_svn2867_270"

><td id="270"><a href="#270">270</a></td></tr
><tr id="gr_svn2867_271"

><td id="271"><a href="#271">271</a></td></tr
><tr id="gr_svn2867_272"

><td id="272"><a href="#272">272</a></td></tr
><tr id="gr_svn2867_273"

><td id="273"><a href="#273">273</a></td></tr
><tr id="gr_svn2867_274"

><td id="274"><a href="#274">274</a></td></tr
><tr id="gr_svn2867_275"

><td id="275"><a href="#275">275</a></td></tr
><tr id="gr_svn2867_276"

><td id="276"><a href="#276">276</a></td></tr
><tr id="gr_svn2867_277"

><td id="277"><a href="#277">277</a></td></tr
><tr id="gr_svn2867_278"

><td id="278"><a href="#278">278</a></td></tr
><tr id="gr_svn2867_279"

><td id="279"><a href="#279">279</a></td></tr
><tr id="gr_svn2867_280"

><td id="280"><a href="#280">280</a></td></tr
><tr id="gr_svn2867_281"

><td id="281"><a href="#281">281</a></td></tr
><tr id="gr_svn2867_282"

><td id="282"><a href="#282">282</a></td></tr
><tr id="gr_svn2867_283"

><td id="283"><a href="#283">283</a></td></tr
><tr id="gr_svn2867_284"

><td id="284"><a href="#284">284</a></td></tr
><tr id="gr_svn2867_285"

><td id="285"><a href="#285">285</a></td></tr
><tr id="gr_svn2867_286"

><td id="286"><a href="#286">286</a></td></tr
><tr id="gr_svn2867_287"

><td id="287"><a href="#287">287</a></td></tr
><tr id="gr_svn2867_288"

><td id="288"><a href="#288">288</a></td></tr
><tr id="gr_svn2867_289"

><td id="289"><a href="#289">289</a></td></tr
><tr id="gr_svn2867_290"

><td id="290"><a href="#290">290</a></td></tr
><tr id="gr_svn2867_291"

><td id="291"><a href="#291">291</a></td></tr
><tr id="gr_svn2867_292"

><td id="292"><a href="#292">292</a></td></tr
><tr id="gr_svn2867_293"

><td id="293"><a href="#293">293</a></td></tr
><tr id="gr_svn2867_294"

><td id="294"><a href="#294">294</a></td></tr
><tr id="gr_svn2867_295"

><td id="295"><a href="#295">295</a></td></tr
><tr id="gr_svn2867_296"

><td id="296"><a href="#296">296</a></td></tr
><tr id="gr_svn2867_297"

><td id="297"><a href="#297">297</a></td></tr
><tr id="gr_svn2867_298"

><td id="298"><a href="#298">298</a></td></tr
><tr id="gr_svn2867_299"

><td id="299"><a href="#299">299</a></td></tr
><tr id="gr_svn2867_300"

><td id="300"><a href="#300">300</a></td></tr
><tr id="gr_svn2867_301"

><td id="301"><a href="#301">301</a></td></tr
><tr id="gr_svn2867_302"

><td id="302"><a href="#302">302</a></td></tr
><tr id="gr_svn2867_303"

><td id="303"><a href="#303">303</a></td></tr
><tr id="gr_svn2867_304"

><td id="304"><a href="#304">304</a></td></tr
><tr id="gr_svn2867_305"

><td id="305"><a href="#305">305</a></td></tr
><tr id="gr_svn2867_306"

><td id="306"><a href="#306">306</a></td></tr
><tr id="gr_svn2867_307"

><td id="307"><a href="#307">307</a></td></tr
><tr id="gr_svn2867_308"

><td id="308"><a href="#308">308</a></td></tr
><tr id="gr_svn2867_309"

><td id="309"><a href="#309">309</a></td></tr
><tr id="gr_svn2867_310"

><td id="310"><a href="#310">310</a></td></tr
><tr id="gr_svn2867_311"

><td id="311"><a href="#311">311</a></td></tr
><tr id="gr_svn2867_312"

><td id="312"><a href="#312">312</a></td></tr
><tr id="gr_svn2867_313"

><td id="313"><a href="#313">313</a></td></tr
><tr id="gr_svn2867_314"

><td id="314"><a href="#314">314</a></td></tr
><tr id="gr_svn2867_315"

><td id="315"><a href="#315">315</a></td></tr
><tr id="gr_svn2867_316"

><td id="316"><a href="#316">316</a></td></tr
><tr id="gr_svn2867_317"

><td id="317"><a href="#317">317</a></td></tr
><tr id="gr_svn2867_318"

><td id="318"><a href="#318">318</a></td></tr
><tr id="gr_svn2867_319"

><td id="319"><a href="#319">319</a></td></tr
><tr id="gr_svn2867_320"

><td id="320"><a href="#320">320</a></td></tr
><tr id="gr_svn2867_321"

><td id="321"><a href="#321">321</a></td></tr
><tr id="gr_svn2867_322"

><td id="322"><a href="#322">322</a></td></tr
><tr id="gr_svn2867_323"

><td id="323"><a href="#323">323</a></td></tr
><tr id="gr_svn2867_324"

><td id="324"><a href="#324">324</a></td></tr
><tr id="gr_svn2867_325"

><td id="325"><a href="#325">325</a></td></tr
><tr id="gr_svn2867_326"

><td id="326"><a href="#326">326</a></td></tr
><tr id="gr_svn2867_327"

><td id="327"><a href="#327">327</a></td></tr
><tr id="gr_svn2867_328"

><td id="328"><a href="#328">328</a></td></tr
><tr id="gr_svn2867_329"

><td id="329"><a href="#329">329</a></td></tr
><tr id="gr_svn2867_330"

><td id="330"><a href="#330">330</a></td></tr
><tr id="gr_svn2867_331"

><td id="331"><a href="#331">331</a></td></tr
><tr id="gr_svn2867_332"

><td id="332"><a href="#332">332</a></td></tr
><tr id="gr_svn2867_333"

><td id="333"><a href="#333">333</a></td></tr
><tr id="gr_svn2867_334"

><td id="334"><a href="#334">334</a></td></tr
><tr id="gr_svn2867_335"

><td id="335"><a href="#335">335</a></td></tr
><tr id="gr_svn2867_336"

><td id="336"><a href="#336">336</a></td></tr
><tr id="gr_svn2867_337"

><td id="337"><a href="#337">337</a></td></tr
><tr id="gr_svn2867_338"

><td id="338"><a href="#338">338</a></td></tr
><tr id="gr_svn2867_339"

><td id="339"><a href="#339">339</a></td></tr
><tr id="gr_svn2867_340"

><td id="340"><a href="#340">340</a></td></tr
><tr id="gr_svn2867_341"

><td id="341"><a href="#341">341</a></td></tr
><tr id="gr_svn2867_342"

><td id="342"><a href="#342">342</a></td></tr
><tr id="gr_svn2867_343"

><td id="343"><a href="#343">343</a></td></tr
><tr id="gr_svn2867_344"

><td id="344"><a href="#344">344</a></td></tr
><tr id="gr_svn2867_345"

><td id="345"><a href="#345">345</a></td></tr
><tr id="gr_svn2867_346"

><td id="346"><a href="#346">346</a></td></tr
><tr id="gr_svn2867_347"

><td id="347"><a href="#347">347</a></td></tr
><tr id="gr_svn2867_348"

><td id="348"><a href="#348">348</a></td></tr
><tr id="gr_svn2867_349"

><td id="349"><a href="#349">349</a></td></tr
><tr id="gr_svn2867_350"

><td id="350"><a href="#350">350</a></td></tr
><tr id="gr_svn2867_351"

><td id="351"><a href="#351">351</a></td></tr
><tr id="gr_svn2867_352"

><td id="352"><a href="#352">352</a></td></tr
><tr id="gr_svn2867_353"

><td id="353"><a href="#353">353</a></td></tr
><tr id="gr_svn2867_354"

><td id="354"><a href="#354">354</a></td></tr
><tr id="gr_svn2867_355"

><td id="355"><a href="#355">355</a></td></tr
><tr id="gr_svn2867_356"

><td id="356"><a href="#356">356</a></td></tr
><tr id="gr_svn2867_357"

><td id="357"><a href="#357">357</a></td></tr
><tr id="gr_svn2867_358"

><td id="358"><a href="#358">358</a></td></tr
><tr id="gr_svn2867_359"

><td id="359"><a href="#359">359</a></td></tr
><tr id="gr_svn2867_360"

><td id="360"><a href="#360">360</a></td></tr
><tr id="gr_svn2867_361"

><td id="361"><a href="#361">361</a></td></tr
><tr id="gr_svn2867_362"

><td id="362"><a href="#362">362</a></td></tr
><tr id="gr_svn2867_363"

><td id="363"><a href="#363">363</a></td></tr
><tr id="gr_svn2867_364"

><td id="364"><a href="#364">364</a></td></tr
><tr id="gr_svn2867_365"

><td id="365"><a href="#365">365</a></td></tr
><tr id="gr_svn2867_366"

><td id="366"><a href="#366">366</a></td></tr
><tr id="gr_svn2867_367"

><td id="367"><a href="#367">367</a></td></tr
><tr id="gr_svn2867_368"

><td id="368"><a href="#368">368</a></td></tr
><tr id="gr_svn2867_369"

><td id="369"><a href="#369">369</a></td></tr
><tr id="gr_svn2867_370"

><td id="370"><a href="#370">370</a></td></tr
><tr id="gr_svn2867_371"

><td id="371"><a href="#371">371</a></td></tr
><tr id="gr_svn2867_372"

><td id="372"><a href="#372">372</a></td></tr
><tr id="gr_svn2867_373"

><td id="373"><a href="#373">373</a></td></tr
><tr id="gr_svn2867_374"

><td id="374"><a href="#374">374</a></td></tr
><tr id="gr_svn2867_375"

><td id="375"><a href="#375">375</a></td></tr
><tr id="gr_svn2867_376"

><td id="376"><a href="#376">376</a></td></tr
><tr id="gr_svn2867_377"

><td id="377"><a href="#377">377</a></td></tr
><tr id="gr_svn2867_378"

><td id="378"><a href="#378">378</a></td></tr
><tr id="gr_svn2867_379"

><td id="379"><a href="#379">379</a></td></tr
><tr id="gr_svn2867_380"

><td id="380"><a href="#380">380</a></td></tr
><tr id="gr_svn2867_381"

><td id="381"><a href="#381">381</a></td></tr
><tr id="gr_svn2867_382"

><td id="382"><a href="#382">382</a></td></tr
><tr id="gr_svn2867_383"

><td id="383"><a href="#383">383</a></td></tr
><tr id="gr_svn2867_384"

><td id="384"><a href="#384">384</a></td></tr
><tr id="gr_svn2867_385"

><td id="385"><a href="#385">385</a></td></tr
><tr id="gr_svn2867_386"

><td id="386"><a href="#386">386</a></td></tr
><tr id="gr_svn2867_387"

><td id="387"><a href="#387">387</a></td></tr
><tr id="gr_svn2867_388"

><td id="388"><a href="#388">388</a></td></tr
><tr id="gr_svn2867_389"

><td id="389"><a href="#389">389</a></td></tr
><tr id="gr_svn2867_390"

><td id="390"><a href="#390">390</a></td></tr
><tr id="gr_svn2867_391"

><td id="391"><a href="#391">391</a></td></tr
><tr id="gr_svn2867_392"

><td id="392"><a href="#392">392</a></td></tr
><tr id="gr_svn2867_393"

><td id="393"><a href="#393">393</a></td></tr
><tr id="gr_svn2867_394"

><td id="394"><a href="#394">394</a></td></tr
><tr id="gr_svn2867_395"

><td id="395"><a href="#395">395</a></td></tr
><tr id="gr_svn2867_396"

><td id="396"><a href="#396">396</a></td></tr
><tr id="gr_svn2867_397"

><td id="397"><a href="#397">397</a></td></tr
><tr id="gr_svn2867_398"

><td id="398"><a href="#398">398</a></td></tr
><tr id="gr_svn2867_399"

><td id="399"><a href="#399">399</a></td></tr
><tr id="gr_svn2867_400"

><td id="400"><a href="#400">400</a></td></tr
><tr id="gr_svn2867_401"

><td id="401"><a href="#401">401</a></td></tr
><tr id="gr_svn2867_402"

><td id="402"><a href="#402">402</a></td></tr
><tr id="gr_svn2867_403"

><td id="403"><a href="#403">403</a></td></tr
><tr id="gr_svn2867_404"

><td id="404"><a href="#404">404</a></td></tr
><tr id="gr_svn2867_405"

><td id="405"><a href="#405">405</a></td></tr
><tr id="gr_svn2867_406"

><td id="406"><a href="#406">406</a></td></tr
><tr id="gr_svn2867_407"

><td id="407"><a href="#407">407</a></td></tr
><tr id="gr_svn2867_408"

><td id="408"><a href="#408">408</a></td></tr
><tr id="gr_svn2867_409"

><td id="409"><a href="#409">409</a></td></tr
><tr id="gr_svn2867_410"

><td id="410"><a href="#410">410</a></td></tr
><tr id="gr_svn2867_411"

><td id="411"><a href="#411">411</a></td></tr
><tr id="gr_svn2867_412"

><td id="412"><a href="#412">412</a></td></tr
><tr id="gr_svn2867_413"

><td id="413"><a href="#413">413</a></td></tr
><tr id="gr_svn2867_414"

><td id="414"><a href="#414">414</a></td></tr
><tr id="gr_svn2867_415"

><td id="415"><a href="#415">415</a></td></tr
><tr id="gr_svn2867_416"

><td id="416"><a href="#416">416</a></td></tr
><tr id="gr_svn2867_417"

><td id="417"><a href="#417">417</a></td></tr
><tr id="gr_svn2867_418"

><td id="418"><a href="#418">418</a></td></tr
><tr id="gr_svn2867_419"

><td id="419"><a href="#419">419</a></td></tr
><tr id="gr_svn2867_420"

><td id="420"><a href="#420">420</a></td></tr
><tr id="gr_svn2867_421"

><td id="421"><a href="#421">421</a></td></tr
><tr id="gr_svn2867_422"

><td id="422"><a href="#422">422</a></td></tr
><tr id="gr_svn2867_423"

><td id="423"><a href="#423">423</a></td></tr
><tr id="gr_svn2867_424"

><td id="424"><a href="#424">424</a></td></tr
><tr id="gr_svn2867_425"

><td id="425"><a href="#425">425</a></td></tr
><tr id="gr_svn2867_426"

><td id="426"><a href="#426">426</a></td></tr
><tr id="gr_svn2867_427"

><td id="427"><a href="#427">427</a></td></tr
></table></pre>
<pre><table width="100%"><tr class="nocursor"><td></td></tr></table></pre>
</td>
<td id="lines">
<pre><table width="100%"><tr class="cursor_stop cursor_hidden"><td></td></tr></table></pre>
<pre class="prettyprint lang-java"><table id="src_table_0"><tr
id=sl_svn2867_1

><td class="source">/*<br></td></tr
><tr
id=sl_svn2867_2

><td class="source"> * Copyright 2009 ZXing authors<br></td></tr
><tr
id=sl_svn2867_3

><td class="source"> *<br></td></tr
><tr
id=sl_svn2867_4

><td class="source"> * Licensed under the Apache License, Version 2.0 (the &quot;License&quot;);<br></td></tr
><tr
id=sl_svn2867_5

><td class="source"> * you may not use this file except in compliance with the License.<br></td></tr
><tr
id=sl_svn2867_6

><td class="source"> * You may obtain a copy of the License at<br></td></tr
><tr
id=sl_svn2867_7

><td class="source"> *<br></td></tr
><tr
id=sl_svn2867_8

><td class="source"> *      http://www.apache.org/licenses/LICENSE-2.0<br></td></tr
><tr
id=sl_svn2867_9

><td class="source"> *<br></td></tr
><tr
id=sl_svn2867_10

><td class="source"> * Unless required by applicable law or agreed to in writing, software<br></td></tr
><tr
id=sl_svn2867_11

><td class="source"> * distributed under the License is distributed on an &quot;AS IS&quot; BASIS,<br></td></tr
><tr
id=sl_svn2867_12

><td class="source"> * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.<br></td></tr
><tr
id=sl_svn2867_13

><td class="source"> * See the License for the specific language governing permissions and<br></td></tr
><tr
id=sl_svn2867_14

><td class="source"> * limitations under the License.<br></td></tr
><tr
id=sl_svn2867_15

><td class="source"> */<br></td></tr
><tr
id=sl_svn2867_16

><td class="source"><br></td></tr
><tr
id=sl_svn2867_17

><td class="source">package com.google.zxing.integration.android;<br></td></tr
><tr
id=sl_svn2867_18

><td class="source"><br></td></tr
><tr
id=sl_svn2867_19

><td class="source">import java.util.Arrays;<br></td></tr
><tr
id=sl_svn2867_20

><td class="source">import java.util.Collection;<br></td></tr
><tr
id=sl_svn2867_21

><td class="source">import java.util.Collections;<br></td></tr
><tr
id=sl_svn2867_22

><td class="source">import java.util.HashMap;<br></td></tr
><tr
id=sl_svn2867_23

><td class="source">import java.util.List;<br></td></tr
><tr
id=sl_svn2867_24

><td class="source">import java.util.Map;<br></td></tr
><tr
id=sl_svn2867_25

><td class="source"><br></td></tr
><tr
id=sl_svn2867_26

><td class="source">import android.app.Activity;<br></td></tr
><tr
id=sl_svn2867_27

><td class="source">import android.app.AlertDialog;<br></td></tr
><tr
id=sl_svn2867_28

><td class="source">import android.content.ActivityNotFoundException;<br></td></tr
><tr
id=sl_svn2867_29

><td class="source">import android.content.DialogInterface;<br></td></tr
><tr
id=sl_svn2867_30

><td class="source">import android.content.Intent;<br></td></tr
><tr
id=sl_svn2867_31

><td class="source">import android.content.pm.PackageManager;<br></td></tr
><tr
id=sl_svn2867_32

><td class="source">import android.content.pm.ResolveInfo;<br></td></tr
><tr
id=sl_svn2867_33

><td class="source">import android.net.Uri;<br></td></tr
><tr
id=sl_svn2867_34

><td class="source">import android.os.Bundle;<br></td></tr
><tr
id=sl_svn2867_35

><td class="source">import android.util.Log;<br></td></tr
><tr
id=sl_svn2867_36

><td class="source"><br></td></tr
><tr
id=sl_svn2867_37

><td class="source">/**<br></td></tr
><tr
id=sl_svn2867_38

><td class="source"> * &lt;p&gt;A utility class which helps ease integration with Barcode Scanner via {@link Intent}s. This is a simple<br></td></tr
><tr
id=sl_svn2867_39

><td class="source"> * way to invoke barcode scanning and receive the result, without any need to integrate, modify, or learn the<br></td></tr
><tr
id=sl_svn2867_40

><td class="source"> * project&#39;s source code.&lt;/p&gt;<br></td></tr
><tr
id=sl_svn2867_41

><td class="source"> *<br></td></tr
><tr
id=sl_svn2867_42

><td class="source"> * &lt;h2&gt;Initiating a barcode scan&lt;/h2&gt;<br></td></tr
><tr
id=sl_svn2867_43

><td class="source"> *<br></td></tr
><tr
id=sl_svn2867_44

><td class="source"> * &lt;p&gt;To integrate, create an instance of {@code IntentIntegrator} and call {@link #initiateScan()} and wait<br></td></tr
><tr
id=sl_svn2867_45

><td class="source"> * for the result in your app.&lt;/p&gt;<br></td></tr
><tr
id=sl_svn2867_46

><td class="source"> *<br></td></tr
><tr
id=sl_svn2867_47

><td class="source"> * &lt;p&gt;It does require that the Barcode Scanner (or work-alike) application is installed. The<br></td></tr
><tr
id=sl_svn2867_48

><td class="source"> * {@link #initiateScan()} method will prompt the user to download the application, if needed.&lt;/p&gt;<br></td></tr
><tr
id=sl_svn2867_49

><td class="source"> *<br></td></tr
><tr
id=sl_svn2867_50

><td class="source"> * &lt;p&gt;There are a few steps to using this integration. First, your {@link Activity} must implement<br></td></tr
><tr
id=sl_svn2867_51

><td class="source"> * the method {@link Activity#onActivityResult(int, int, Intent)} and include a line of code like this:&lt;/p&gt;<br></td></tr
><tr
id=sl_svn2867_52

><td class="source"> *<br></td></tr
><tr
id=sl_svn2867_53

><td class="source"> * &lt;pre&gt;{@code<br></td></tr
><tr
id=sl_svn2867_54

><td class="source"> * public void onActivityResult(int requestCode, int resultCode, Intent intent) {<br></td></tr
><tr
id=sl_svn2867_55

><td class="source"> *   IntentResult scanResult = IntentIntegrator.parseActivityResult(requestCode, resultCode, intent);<br></td></tr
><tr
id=sl_svn2867_56

><td class="source"> *   if (scanResult != null) {<br></td></tr
><tr
id=sl_svn2867_57

><td class="source"> *     // handle scan result<br></td></tr
><tr
id=sl_svn2867_58

><td class="source"> *   }<br></td></tr
><tr
id=sl_svn2867_59

><td class="source"> *   // else continue with any other code you need in the method<br></td></tr
><tr
id=sl_svn2867_60

><td class="source"> *   ...<br></td></tr
><tr
id=sl_svn2867_61

><td class="source"> * }<br></td></tr
><tr
id=sl_svn2867_62

><td class="source"> * }&lt;/pre&gt;<br></td></tr
><tr
id=sl_svn2867_63

><td class="source"> *<br></td></tr
><tr
id=sl_svn2867_64

><td class="source"> * &lt;p&gt;This is where you will handle a scan result.&lt;/p&gt;<br></td></tr
><tr
id=sl_svn2867_65

><td class="source"> *<br></td></tr
><tr
id=sl_svn2867_66

><td class="source"> * &lt;p&gt;Second, just call this in response to a user action somewhere to begin the scan process:&lt;/p&gt;<br></td></tr
><tr
id=sl_svn2867_67

><td class="source"> *<br></td></tr
><tr
id=sl_svn2867_68

><td class="source"> * &lt;pre&gt;{@code<br></td></tr
><tr
id=sl_svn2867_69

><td class="source"> * IntentIntegrator integrator = new IntentIntegrator(yourActivity);<br></td></tr
><tr
id=sl_svn2867_70

><td class="source"> * integrator.initiateScan();<br></td></tr
><tr
id=sl_svn2867_71

><td class="source"> * }&lt;/pre&gt;<br></td></tr
><tr
id=sl_svn2867_72

><td class="source"> *<br></td></tr
><tr
id=sl_svn2867_73

><td class="source"> * &lt;p&gt;Note that {@link #initiateScan()} returns an {@link AlertDialog} which is non-null if the<br></td></tr
><tr
id=sl_svn2867_74

><td class="source"> * user was prompted to download the application. This lets the calling app potentially manage the dialog.<br></td></tr
><tr
id=sl_svn2867_75

><td class="source"> * In particular, ideally, the app dismisses the dialog if it&#39;s still active in its {@link Activity#onPause()}<br></td></tr
><tr
id=sl_svn2867_76

><td class="source"> * method.&lt;/p&gt;<br></td></tr
><tr
id=sl_svn2867_77

><td class="source"> * <br></td></tr
><tr
id=sl_svn2867_78

><td class="source"> * &lt;p&gt;You can use {@link #setTitle(String)} to customize the title of this download prompt dialog (or, use<br></td></tr
><tr
id=sl_svn2867_79

><td class="source"> * {@link #setTitleByID(int)} to set the title by string resource ID.) Likewise, the prompt message, and<br></td></tr
><tr
id=sl_svn2867_80

><td class="source"> * yes/no button labels can be changed.&lt;/p&gt;<br></td></tr
><tr
id=sl_svn2867_81

><td class="source"> *<br></td></tr
><tr
id=sl_svn2867_82

><td class="source"> * &lt;p&gt;Finally, you can use {@link #addExtra(String, Object)} to add more parameters to the Intent used<br></td></tr
><tr
id=sl_svn2867_83

><td class="source"> * to invoke the scanner. This can be used to set additional options not directly exposed by this<br></td></tr
><tr
id=sl_svn2867_84

><td class="source"> * simplified API.&lt;/p&gt;<br></td></tr
><tr
id=sl_svn2867_85

><td class="source"> * <br></td></tr
><tr
id=sl_svn2867_86

><td class="source"> * &lt;p&gt;By default, this will only allow applications that are known to respond to this intent correctly<br></td></tr
><tr
id=sl_svn2867_87

><td class="source"> * do so. The apps that are allowed to response can be set with {@link #setTargetApplications(List)}.<br></td></tr
><tr
id=sl_svn2867_88

><td class="source"> * For example, set to {@link #TARGET_BARCODE_SCANNER_ONLY} to only target the Barcode Scanner app itself.&lt;/p&gt;<br></td></tr
><tr
id=sl_svn2867_89

><td class="source"> *<br></td></tr
><tr
id=sl_svn2867_90

><td class="source"> * &lt;h2&gt;Sharing text via barcode&lt;/h2&gt;<br></td></tr
><tr
id=sl_svn2867_91

><td class="source"> *<br></td></tr
><tr
id=sl_svn2867_92

><td class="source"> * &lt;p&gt;To share text, encoded as a QR Code on-screen, similarly, see {@link #shareText(CharSequence)}.&lt;/p&gt;<br></td></tr
><tr
id=sl_svn2867_93

><td class="source"> *<br></td></tr
><tr
id=sl_svn2867_94

><td class="source"> * &lt;p&gt;Some code, particularly download integration, was contributed from the Anobiit application.&lt;/p&gt;<br></td></tr
><tr
id=sl_svn2867_95

><td class="source"> *<br></td></tr
><tr
id=sl_svn2867_96

><td class="source"> * &lt;h2&gt;Enabling experimental barcode formats&lt;/h2&gt;<br></td></tr
><tr
id=sl_svn2867_97

><td class="source"> *<br></td></tr
><tr
id=sl_svn2867_98

><td class="source"> * &lt;p&gt;Some formats are not enabled by default even when scanning with {@link #ALL_CODE_TYPES}, such as<br></td></tr
><tr
id=sl_svn2867_99

><td class="source"> * PDF417. Use {@link #initiateScan(java.util.Collection)} with<br></td></tr
><tr
id=sl_svn2867_100

><td class="source"> * a collection containing the names of formats to scan for explicitly, like &quot;PDF_417&quot;, to use such<br></td></tr
><tr
id=sl_svn2867_101

><td class="source"> * formats.&lt;/p&gt;<br></td></tr
><tr
id=sl_svn2867_102

><td class="source"> *<br></td></tr
><tr
id=sl_svn2867_103

><td class="source"> * @author Sean Owen<br></td></tr
><tr
id=sl_svn2867_104

><td class="source"> * @author Fred Lin<br></td></tr
><tr
id=sl_svn2867_105

><td class="source"> * @author Isaac Potoczny-Jones<br></td></tr
><tr
id=sl_svn2867_106

><td class="source"> * @author Brad Drehmer<br></td></tr
><tr
id=sl_svn2867_107

><td class="source"> * @author gcstang<br></td></tr
><tr
id=sl_svn2867_108

><td class="source"> */<br></td></tr
><tr
id=sl_svn2867_109

><td class="source">public class IntentIntegrator {<br></td></tr
><tr
id=sl_svn2867_110

><td class="source"><br></td></tr
><tr
id=sl_svn2867_111

><td class="source">  public static final int REQUEST_CODE = 0x0000c0de; // Only use bottom 16 bits<br></td></tr
><tr
id=sl_svn2867_112

><td class="source">  private static final String TAG = IntentIntegrator.class.getSimpleName();<br></td></tr
><tr
id=sl_svn2867_113

><td class="source"><br></td></tr
><tr
id=sl_svn2867_114

><td class="source">  public static final String DEFAULT_TITLE = &quot;Install Barcode Scanner?&quot;;<br></td></tr
><tr
id=sl_svn2867_115

><td class="source">  public static final String DEFAULT_MESSAGE =<br></td></tr
><tr
id=sl_svn2867_116

><td class="source">      &quot;This application requires Barcode Scanner. Would you like to install it?&quot;;<br></td></tr
><tr
id=sl_svn2867_117

><td class="source">  public static final String DEFAULT_YES = &quot;Yes&quot;;<br></td></tr
><tr
id=sl_svn2867_118

><td class="source">  public static final String DEFAULT_NO = &quot;No&quot;;<br></td></tr
><tr
id=sl_svn2867_119

><td class="source"><br></td></tr
><tr
id=sl_svn2867_120

><td class="source">  private static final String BS_PACKAGE = &quot;com.google.zxing.client.android&quot;;<br></td></tr
><tr
id=sl_svn2867_121

><td class="source">  private static final String BSPLUS_PACKAGE = &quot;com.srowen.bs.android&quot;;<br></td></tr
><tr
id=sl_svn2867_122

><td class="source"><br></td></tr
><tr
id=sl_svn2867_123

><td class="source">  // supported barcode formats<br></td></tr
><tr
id=sl_svn2867_124

><td class="source">  public static final Collection&lt;String&gt; PRODUCT_CODE_TYPES = list(&quot;UPC_A&quot;, &quot;UPC_E&quot;, &quot;EAN_8&quot;, &quot;EAN_13&quot;, &quot;RSS_14&quot;);<br></td></tr
><tr
id=sl_svn2867_125

><td class="source">  public static final Collection&lt;String&gt; ONE_D_CODE_TYPES =<br></td></tr
><tr
id=sl_svn2867_126

><td class="source">      list(&quot;UPC_A&quot;, &quot;UPC_E&quot;, &quot;EAN_8&quot;, &quot;EAN_13&quot;, &quot;CODE_39&quot;, &quot;CODE_93&quot;, &quot;CODE_128&quot;,<br></td></tr
><tr
id=sl_svn2867_127

><td class="source">           &quot;ITF&quot;, &quot;RSS_14&quot;, &quot;RSS_EXPANDED&quot;);<br></td></tr
><tr
id=sl_svn2867_128

><td class="source">  public static final Collection&lt;String&gt; QR_CODE_TYPES = Collections.singleton(&quot;QR_CODE&quot;);<br></td></tr
><tr
id=sl_svn2867_129

><td class="source">  public static final Collection&lt;String&gt; DATA_MATRIX_TYPES = Collections.singleton(&quot;DATA_MATRIX&quot;);<br></td></tr
><tr
id=sl_svn2867_130

><td class="source"><br></td></tr
><tr
id=sl_svn2867_131

><td class="source">  public static final Collection&lt;String&gt; ALL_CODE_TYPES = null;<br></td></tr
><tr
id=sl_svn2867_132

><td class="source">  <br></td></tr
><tr
id=sl_svn2867_133

><td class="source">  public static final List&lt;String&gt; TARGET_BARCODE_SCANNER_ONLY = Collections.singletonList(BS_PACKAGE);<br></td></tr
><tr
id=sl_svn2867_134

><td class="source">  public static final List&lt;String&gt; TARGET_ALL_KNOWN = list(<br></td></tr
><tr
id=sl_svn2867_135

><td class="source">          BSPLUS_PACKAGE,             // Barcode Scanner+<br></td></tr
><tr
id=sl_svn2867_136

><td class="source">          BSPLUS_PACKAGE + &quot;.simple&quot;, // Barcode Scanner+ Simple<br></td></tr
><tr
id=sl_svn2867_137

><td class="source">          BS_PACKAGE                  // Barcode Scanner          <br></td></tr
><tr
id=sl_svn2867_138

><td class="source">          // What else supports this intent?<br></td></tr
><tr
id=sl_svn2867_139

><td class="source">      );<br></td></tr
><tr
id=sl_svn2867_140

><td class="source">  <br></td></tr
><tr
id=sl_svn2867_141

><td class="source">  private final Activity activity;<br></td></tr
><tr
id=sl_svn2867_142

><td class="source">  private String title;<br></td></tr
><tr
id=sl_svn2867_143

><td class="source">  private String message;<br></td></tr
><tr
id=sl_svn2867_144

><td class="source">  private String buttonYes;<br></td></tr
><tr
id=sl_svn2867_145

><td class="source">  private String buttonNo;<br></td></tr
><tr
id=sl_svn2867_146

><td class="source">  private List&lt;String&gt; targetApplications;<br></td></tr
><tr
id=sl_svn2867_147

><td class="source">  private final Map&lt;String,Object&gt; moreExtras;<br></td></tr
><tr
id=sl_svn2867_148

><td class="source">  <br></td></tr
><tr
id=sl_svn2867_149

><td class="source">  public IntentIntegrator(Activity activity) {<br></td></tr
><tr
id=sl_svn2867_150

><td class="source">    this.activity = activity;<br></td></tr
><tr
id=sl_svn2867_151

><td class="source">    title = DEFAULT_TITLE;<br></td></tr
><tr
id=sl_svn2867_152

><td class="source">    message = DEFAULT_MESSAGE;<br></td></tr
><tr
id=sl_svn2867_153

><td class="source">    buttonYes = DEFAULT_YES;<br></td></tr
><tr
id=sl_svn2867_154

><td class="source">    buttonNo = DEFAULT_NO;<br></td></tr
><tr
id=sl_svn2867_155

><td class="source">    targetApplications = TARGET_ALL_KNOWN;<br></td></tr
><tr
id=sl_svn2867_156

><td class="source">    moreExtras = new HashMap&lt;String,Object&gt;(3);<br></td></tr
><tr
id=sl_svn2867_157

><td class="source">  }<br></td></tr
><tr
id=sl_svn2867_158

><td class="source">  <br></td></tr
><tr
id=sl_svn2867_159

><td class="source">  public String getTitle() {<br></td></tr
><tr
id=sl_svn2867_160

><td class="source">    return title;<br></td></tr
><tr
id=sl_svn2867_161

><td class="source">  }<br></td></tr
><tr
id=sl_svn2867_162

><td class="source">  <br></td></tr
><tr
id=sl_svn2867_163

><td class="source">  public void setTitle(String title) {<br></td></tr
><tr
id=sl_svn2867_164

><td class="source">    this.title = title;<br></td></tr
><tr
id=sl_svn2867_165

><td class="source">  }<br></td></tr
><tr
id=sl_svn2867_166

><td class="source"><br></td></tr
><tr
id=sl_svn2867_167

><td class="source">  public void setTitleByID(int titleID) {<br></td></tr
><tr
id=sl_svn2867_168

><td class="source">    title = activity.getString(titleID);<br></td></tr
><tr
id=sl_svn2867_169

><td class="source">  }<br></td></tr
><tr
id=sl_svn2867_170

><td class="source"><br></td></tr
><tr
id=sl_svn2867_171

><td class="source">  public String getMessage() {<br></td></tr
><tr
id=sl_svn2867_172

><td class="source">    return message;<br></td></tr
><tr
id=sl_svn2867_173

><td class="source">  }<br></td></tr
><tr
id=sl_svn2867_174

><td class="source"><br></td></tr
><tr
id=sl_svn2867_175

><td class="source">  public void setMessage(String message) {<br></td></tr
><tr
id=sl_svn2867_176

><td class="source">    this.message = message;<br></td></tr
><tr
id=sl_svn2867_177

><td class="source">  }<br></td></tr
><tr
id=sl_svn2867_178

><td class="source"><br></td></tr
><tr
id=sl_svn2867_179

><td class="source">  public void setMessageByID(int messageID) {<br></td></tr
><tr
id=sl_svn2867_180

><td class="source">    message = activity.getString(messageID);<br></td></tr
><tr
id=sl_svn2867_181

><td class="source">  }<br></td></tr
><tr
id=sl_svn2867_182

><td class="source"><br></td></tr
><tr
id=sl_svn2867_183

><td class="source">  public String getButtonYes() {<br></td></tr
><tr
id=sl_svn2867_184

><td class="source">    return buttonYes;<br></td></tr
><tr
id=sl_svn2867_185

><td class="source">  }<br></td></tr
><tr
id=sl_svn2867_186

><td class="source"><br></td></tr
><tr
id=sl_svn2867_187

><td class="source">  public void setButtonYes(String buttonYes) {<br></td></tr
><tr
id=sl_svn2867_188

><td class="source">    this.buttonYes = buttonYes;<br></td></tr
><tr
id=sl_svn2867_189

><td class="source">  }<br></td></tr
><tr
id=sl_svn2867_190

><td class="source"><br></td></tr
><tr
id=sl_svn2867_191

><td class="source">  public void setButtonYesByID(int buttonYesID) {<br></td></tr
><tr
id=sl_svn2867_192

><td class="source">    buttonYes = activity.getString(buttonYesID);<br></td></tr
><tr
id=sl_svn2867_193

><td class="source">  }<br></td></tr
><tr
id=sl_svn2867_194

><td class="source"><br></td></tr
><tr
id=sl_svn2867_195

><td class="source">  public String getButtonNo() {<br></td></tr
><tr
id=sl_svn2867_196

><td class="source">    return buttonNo;<br></td></tr
><tr
id=sl_svn2867_197

><td class="source">  }<br></td></tr
><tr
id=sl_svn2867_198

><td class="source"><br></td></tr
><tr
id=sl_svn2867_199

><td class="source">  public void setButtonNo(String buttonNo) {<br></td></tr
><tr
id=sl_svn2867_200

><td class="source">    this.buttonNo = buttonNo;<br></td></tr
><tr
id=sl_svn2867_201

><td class="source">  }<br></td></tr
><tr
id=sl_svn2867_202

><td class="source"><br></td></tr
><tr
id=sl_svn2867_203

><td class="source">  public void setButtonNoByID(int buttonNoID) {<br></td></tr
><tr
id=sl_svn2867_204

><td class="source">    buttonNo = activity.getString(buttonNoID);<br></td></tr
><tr
id=sl_svn2867_205

><td class="source">  }<br></td></tr
><tr
id=sl_svn2867_206

><td class="source">  <br></td></tr
><tr
id=sl_svn2867_207

><td class="source">  public Collection&lt;String&gt; getTargetApplications() {<br></td></tr
><tr
id=sl_svn2867_208

><td class="source">    return targetApplications;<br></td></tr
><tr
id=sl_svn2867_209

><td class="source">  }<br></td></tr
><tr
id=sl_svn2867_210

><td class="source">  <br></td></tr
><tr
id=sl_svn2867_211

><td class="source">  public final void setTargetApplications(List&lt;String&gt; targetApplications) {<br></td></tr
><tr
id=sl_svn2867_212

><td class="source">    if (targetApplications.isEmpty()) {<br></td></tr
><tr
id=sl_svn2867_213

><td class="source">      throw new IllegalArgumentException(&quot;No target applications&quot;);<br></td></tr
><tr
id=sl_svn2867_214

><td class="source">    }<br></td></tr
><tr
id=sl_svn2867_215

><td class="source">    this.targetApplications = targetApplications;<br></td></tr
><tr
id=sl_svn2867_216

><td class="source">  }<br></td></tr
><tr
id=sl_svn2867_217

><td class="source">  <br></td></tr
><tr
id=sl_svn2867_218

><td class="source">  public void setSingleTargetApplication(String targetApplication) {<br></td></tr
><tr
id=sl_svn2867_219

><td class="source">    this.targetApplications = Collections.singletonList(targetApplication);<br></td></tr
><tr
id=sl_svn2867_220

><td class="source">  }<br></td></tr
><tr
id=sl_svn2867_221

><td class="source"><br></td></tr
><tr
id=sl_svn2867_222

><td class="source">  public Map&lt;String,?&gt; getMoreExtras() {<br></td></tr
><tr
id=sl_svn2867_223

><td class="source">    return moreExtras;<br></td></tr
><tr
id=sl_svn2867_224

><td class="source">  }<br></td></tr
><tr
id=sl_svn2867_225

><td class="source"><br></td></tr
><tr
id=sl_svn2867_226

><td class="source">  public final void addExtra(String key, Object value) {<br></td></tr
><tr
id=sl_svn2867_227

><td class="source">    moreExtras.put(key, value);<br></td></tr
><tr
id=sl_svn2867_228

><td class="source">  }<br></td></tr
><tr
id=sl_svn2867_229

><td class="source"><br></td></tr
><tr
id=sl_svn2867_230

><td class="source">  /**<br></td></tr
><tr
id=sl_svn2867_231

><td class="source">   * Initiates a scan for all known barcode types.<br></td></tr
><tr
id=sl_svn2867_232

><td class="source">   */<br></td></tr
><tr
id=sl_svn2867_233

><td class="source">  public final AlertDialog initiateScan() {<br></td></tr
><tr
id=sl_svn2867_234

><td class="source">    return initiateScan(ALL_CODE_TYPES);<br></td></tr
><tr
id=sl_svn2867_235

><td class="source">  }<br></td></tr
><tr
id=sl_svn2867_236

><td class="source"><br></td></tr
><tr
id=sl_svn2867_237

><td class="source">  /**<br></td></tr
><tr
id=sl_svn2867_238

><td class="source">   * Initiates a scan only for a certain set of barcode types, given as strings corresponding<br></td></tr
><tr
id=sl_svn2867_239

><td class="source">   * to their names in ZXing&#39;s {@code BarcodeFormat} class like &quot;UPC_A&quot;. You can supply constants<br></td></tr
><tr
id=sl_svn2867_240

><td class="source">   * like {@link #PRODUCT_CODE_TYPES} for example.<br></td></tr
><tr
id=sl_svn2867_241

><td class="source">   *<br></td></tr
><tr
id=sl_svn2867_242

><td class="source">   * @return the {@link AlertDialog} that was shown to the user prompting them to download the app<br></td></tr
><tr
id=sl_svn2867_243

><td class="source">   *   if a prompt was needed, or null otherwise<br></td></tr
><tr
id=sl_svn2867_244

><td class="source">   */<br></td></tr
><tr
id=sl_svn2867_245

><td class="source">  public final AlertDialog initiateScan(Collection&lt;String&gt; desiredBarcodeFormats) {<br></td></tr
><tr
id=sl_svn2867_246

><td class="source">    Intent intentScan = new Intent(BS_PACKAGE + &quot;.SCAN&quot;);<br></td></tr
><tr
id=sl_svn2867_247

><td class="source">    intentScan.addCategory(Intent.CATEGORY_DEFAULT);<br></td></tr
><tr
id=sl_svn2867_248

><td class="source"><br></td></tr
><tr
id=sl_svn2867_249

><td class="source">    // check which types of codes to scan for<br></td></tr
><tr
id=sl_svn2867_250

><td class="source">    if (desiredBarcodeFormats != null) {<br></td></tr
><tr
id=sl_svn2867_251

><td class="source">      // set the desired barcode types<br></td></tr
><tr
id=sl_svn2867_252

><td class="source">      StringBuilder joinedByComma = new StringBuilder();<br></td></tr
><tr
id=sl_svn2867_253

><td class="source">      for (String format : desiredBarcodeFormats) {<br></td></tr
><tr
id=sl_svn2867_254

><td class="source">        if (joinedByComma.length() &gt; 0) {<br></td></tr
><tr
id=sl_svn2867_255

><td class="source">          joinedByComma.append(&#39;,&#39;);<br></td></tr
><tr
id=sl_svn2867_256

><td class="source">        }<br></td></tr
><tr
id=sl_svn2867_257

><td class="source">        joinedByComma.append(format);<br></td></tr
><tr
id=sl_svn2867_258

><td class="source">      }<br></td></tr
><tr
id=sl_svn2867_259

><td class="source">      intentScan.putExtra(&quot;SCAN_FORMATS&quot;, joinedByComma.toString());<br></td></tr
><tr
id=sl_svn2867_260

><td class="source">    }<br></td></tr
><tr
id=sl_svn2867_261

><td class="source"><br></td></tr
><tr
id=sl_svn2867_262

><td class="source">    String targetAppPackage = findTargetAppPackage(intentScan);<br></td></tr
><tr
id=sl_svn2867_263

><td class="source">    if (targetAppPackage == null) {<br></td></tr
><tr
id=sl_svn2867_264

><td class="source">      return showDownloadDialog();<br></td></tr
><tr
id=sl_svn2867_265

><td class="source">    }<br></td></tr
><tr
id=sl_svn2867_266

><td class="source">    intentScan.setPackage(targetAppPackage);<br></td></tr
><tr
id=sl_svn2867_267

><td class="source">    intentScan.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);<br></td></tr
><tr
id=sl_svn2867_268

><td class="source">    intentScan.addFlags(Intent.FLAG_ACTIVITY_CLEAR_WHEN_TASK_RESET);<br></td></tr
><tr
id=sl_svn2867_269

><td class="source">    attachMoreExtras(intentScan);<br></td></tr
><tr
id=sl_svn2867_270

><td class="source">    startActivityForResult(intentScan, REQUEST_CODE);<br></td></tr
><tr
id=sl_svn2867_271

><td class="source">    return null;<br></td></tr
><tr
id=sl_svn2867_272

><td class="source">  }<br></td></tr
><tr
id=sl_svn2867_273

><td class="source"><br></td></tr
><tr
id=sl_svn2867_274

><td class="source">  /**<br></td></tr
><tr
id=sl_svn2867_275

><td class="source">   * Start an activity. This method is defined to allow different methods of activity starting for<br></td></tr
><tr
id=sl_svn2867_276

><td class="source">   * newer versions of Android and for compatibility library.<br></td></tr
><tr
id=sl_svn2867_277

><td class="source">   *<br></td></tr
><tr
id=sl_svn2867_278

><td class="source">   * @param intent Intent to start.<br></td></tr
><tr
id=sl_svn2867_279

><td class="source">   * @param code Request code for the activity<br></td></tr
><tr
id=sl_svn2867_280

><td class="source">   * @see android.app.Activity#startActivityForResult(Intent, int)<br></td></tr
><tr
id=sl_svn2867_281

><td class="source">   * @see android.app.Fragment#startActivityForResult(Intent, int)<br></td></tr
><tr
id=sl_svn2867_282

><td class="source">   */<br></td></tr
><tr
id=sl_svn2867_283

><td class="source">  protected void startActivityForResult(Intent intent, int code) {<br></td></tr
><tr
id=sl_svn2867_284

><td class="source">    activity.startActivityForResult(intent, code);<br></td></tr
><tr
id=sl_svn2867_285

><td class="source">  }<br></td></tr
><tr
id=sl_svn2867_286

><td class="source">  <br></td></tr
><tr
id=sl_svn2867_287

><td class="source">  private String findTargetAppPackage(Intent intent) {<br></td></tr
><tr
id=sl_svn2867_288

><td class="source">    PackageManager pm = activity.getPackageManager();<br></td></tr
><tr
id=sl_svn2867_289

><td class="source">    List&lt;ResolveInfo&gt; availableApps = pm.queryIntentActivities(intent, PackageManager.MATCH_DEFAULT_ONLY);<br></td></tr
><tr
id=sl_svn2867_290

><td class="source">    if (availableApps != null) {<br></td></tr
><tr
id=sl_svn2867_291

><td class="source">      for (String targetApp : targetApplications) {<br></td></tr
><tr
id=sl_svn2867_292

><td class="source">        if (contains(availableApps, targetApp)) {<br></td></tr
><tr
id=sl_svn2867_293

><td class="source">          return targetApp;<br></td></tr
><tr
id=sl_svn2867_294

><td class="source">        }<br></td></tr
><tr
id=sl_svn2867_295

><td class="source">      }<br></td></tr
><tr
id=sl_svn2867_296

><td class="source">    }<br></td></tr
><tr
id=sl_svn2867_297

><td class="source">    return null;<br></td></tr
><tr
id=sl_svn2867_298

><td class="source">  }<br></td></tr
><tr
id=sl_svn2867_299

><td class="source">  <br></td></tr
><tr
id=sl_svn2867_300

><td class="source">  private static boolean contains(Iterable&lt;ResolveInfo&gt; availableApps, String targetApp) {<br></td></tr
><tr
id=sl_svn2867_301

><td class="source">    for (ResolveInfo availableApp : availableApps) {<br></td></tr
><tr
id=sl_svn2867_302

><td class="source">      String packageName = availableApp.activityInfo.packageName;<br></td></tr
><tr
id=sl_svn2867_303

><td class="source">      if (targetApp.equals(packageName)) {<br></td></tr
><tr
id=sl_svn2867_304

><td class="source">        return true;<br></td></tr
><tr
id=sl_svn2867_305

><td class="source">      }<br></td></tr
><tr
id=sl_svn2867_306

><td class="source">    }<br></td></tr
><tr
id=sl_svn2867_307

><td class="source">    return false;<br></td></tr
><tr
id=sl_svn2867_308

><td class="source">  }<br></td></tr
><tr
id=sl_svn2867_309

><td class="source"><br></td></tr
><tr
id=sl_svn2867_310

><td class="source">  private AlertDialog showDownloadDialog() {<br></td></tr
><tr
id=sl_svn2867_311

><td class="source">    AlertDialog.Builder downloadDialog = new AlertDialog.Builder(activity);<br></td></tr
><tr
id=sl_svn2867_312

><td class="source">    downloadDialog.setTitle(title);<br></td></tr
><tr
id=sl_svn2867_313

><td class="source">    downloadDialog.setMessage(message);<br></td></tr
><tr
id=sl_svn2867_314

><td class="source">    downloadDialog.setPositiveButton(buttonYes, new DialogInterface.OnClickListener() {<br></td></tr
><tr
id=sl_svn2867_315

><td class="source">      @Override<br></td></tr
><tr
id=sl_svn2867_316

><td class="source">      public void onClick(DialogInterface dialogInterface, int i) {<br></td></tr
><tr
id=sl_svn2867_317

><td class="source">        String packageName = targetApplications.get(0);<br></td></tr
><tr
id=sl_svn2867_318

><td class="source">        Uri uri = Uri.parse(&quot;market://details?id=&quot; + packageName);<br></td></tr
><tr
id=sl_svn2867_319

><td class="source">        Intent intent = new Intent(Intent.ACTION_VIEW, uri);<br></td></tr
><tr
id=sl_svn2867_320

><td class="source">        try {<br></td></tr
><tr
id=sl_svn2867_321

><td class="source">          activity.startActivity(intent);<br></td></tr
><tr
id=sl_svn2867_322

><td class="source">        } catch (ActivityNotFoundException anfe) {<br></td></tr
><tr
id=sl_svn2867_323

><td class="source">          // Hmm, market is not installed<br></td></tr
><tr
id=sl_svn2867_324

><td class="source">          Log.w(TAG, &quot;Google Play is not installed; cannot install &quot; + packageName);<br></td></tr
><tr
id=sl_svn2867_325

><td class="source">        }<br></td></tr
><tr
id=sl_svn2867_326

><td class="source">      }<br></td></tr
><tr
id=sl_svn2867_327

><td class="source">    });<br></td></tr
><tr
id=sl_svn2867_328

><td class="source">    downloadDialog.setNegativeButton(buttonNo, new DialogInterface.OnClickListener() {<br></td></tr
><tr
id=sl_svn2867_329

><td class="source">      @Override<br></td></tr
><tr
id=sl_svn2867_330

><td class="source">      public void onClick(DialogInterface dialogInterface, int i) {}<br></td></tr
><tr
id=sl_svn2867_331

><td class="source">    });<br></td></tr
><tr
id=sl_svn2867_332

><td class="source">    return downloadDialog.show();<br></td></tr
><tr
id=sl_svn2867_333

><td class="source">  }<br></td></tr
><tr
id=sl_svn2867_334

><td class="source"><br></td></tr
><tr
id=sl_svn2867_335

><td class="source"><br></td></tr
><tr
id=sl_svn2867_336

><td class="source">  /**<br></td></tr
><tr
id=sl_svn2867_337

><td class="source">   * &lt;p&gt;Call this from your {@link Activity}&#39;s<br></td></tr
><tr
id=sl_svn2867_338

><td class="source">   * {@link Activity#onActivityResult(int, int, Intent)} method.&lt;/p&gt;<br></td></tr
><tr
id=sl_svn2867_339

><td class="source">   *<br></td></tr
><tr
id=sl_svn2867_340

><td class="source">   * @return null if the event handled here was not related to this class, or<br></td></tr
><tr
id=sl_svn2867_341

><td class="source">   *  else an {@link IntentResult} containing the result of the scan. If the user cancelled scanning,<br></td></tr
><tr
id=sl_svn2867_342

><td class="source">   *  the fields will be null.<br></td></tr
><tr
id=sl_svn2867_343

><td class="source">   */<br></td></tr
><tr
id=sl_svn2867_344

><td class="source">  public static IntentResult parseActivityResult(int requestCode, int resultCode, Intent intent) {<br></td></tr
><tr
id=sl_svn2867_345

><td class="source">    if (requestCode == REQUEST_CODE) {<br></td></tr
><tr
id=sl_svn2867_346

><td class="source">      if (resultCode == Activity.RESULT_OK) {<br></td></tr
><tr
id=sl_svn2867_347

><td class="source">        String contents = intent.getStringExtra(&quot;SCAN_RESULT&quot;);<br></td></tr
><tr
id=sl_svn2867_348

><td class="source">        String formatName = intent.getStringExtra(&quot;SCAN_RESULT_FORMAT&quot;);<br></td></tr
><tr
id=sl_svn2867_349

><td class="source">        byte[] rawBytes = intent.getByteArrayExtra(&quot;SCAN_RESULT_BYTES&quot;);<br></td></tr
><tr
id=sl_svn2867_350

><td class="source">        int intentOrientation = intent.getIntExtra(&quot;SCAN_RESULT_ORIENTATION&quot;, Integer.MIN_VALUE);<br></td></tr
><tr
id=sl_svn2867_351

><td class="source">        Integer orientation = intentOrientation == Integer.MIN_VALUE ? null : intentOrientation;<br></td></tr
><tr
id=sl_svn2867_352

><td class="source">        String errorCorrectionLevel = intent.getStringExtra(&quot;SCAN_RESULT_ERROR_CORRECTION_LEVEL&quot;);<br></td></tr
><tr
id=sl_svn2867_353

><td class="source">        return new IntentResult(contents,<br></td></tr
><tr
id=sl_svn2867_354

><td class="source">                                formatName,<br></td></tr
><tr
id=sl_svn2867_355

><td class="source">                                rawBytes,<br></td></tr
><tr
id=sl_svn2867_356

><td class="source">                                orientation,<br></td></tr
><tr
id=sl_svn2867_357

><td class="source">                                errorCorrectionLevel);<br></td></tr
><tr
id=sl_svn2867_358

><td class="source">      }<br></td></tr
><tr
id=sl_svn2867_359

><td class="source">      return new IntentResult();<br></td></tr
><tr
id=sl_svn2867_360

><td class="source">    }<br></td></tr
><tr
id=sl_svn2867_361

><td class="source">    return null;<br></td></tr
><tr
id=sl_svn2867_362

><td class="source">  }<br></td></tr
><tr
id=sl_svn2867_363

><td class="source"><br></td></tr
><tr
id=sl_svn2867_364

><td class="source"><br></td></tr
><tr
id=sl_svn2867_365

><td class="source">  /**<br></td></tr
><tr
id=sl_svn2867_366

><td class="source">   * Defaults to type &quot;TEXT_TYPE&quot;.<br></td></tr
><tr
id=sl_svn2867_367

><td class="source">   * @see #shareText(CharSequence, CharSequence)<br></td></tr
><tr
id=sl_svn2867_368

><td class="source">   */<br></td></tr
><tr
id=sl_svn2867_369

><td class="source">  public final AlertDialog shareText(CharSequence text) {<br></td></tr
><tr
id=sl_svn2867_370

><td class="source">    return shareText(text, &quot;TEXT_TYPE&quot;);<br></td></tr
><tr
id=sl_svn2867_371

><td class="source">  }<br></td></tr
><tr
id=sl_svn2867_372

><td class="source"><br></td></tr
><tr
id=sl_svn2867_373

><td class="source">  /**<br></td></tr
><tr
id=sl_svn2867_374

><td class="source">   * Shares the given text by encoding it as a barcode, such that another user can<br></td></tr
><tr
id=sl_svn2867_375

><td class="source">   * scan the text off the screen of the device.<br></td></tr
><tr
id=sl_svn2867_376

><td class="source">   *<br></td></tr
><tr
id=sl_svn2867_377

><td class="source">   * @param text the text string to encode as a barcode<br></td></tr
><tr
id=sl_svn2867_378

><td class="source">   * @param type type of data to encode. See {@code com.google.zxing.client.android.Contents.Type} constants.<br></td></tr
><tr
id=sl_svn2867_379

><td class="source">   * @return the {@link AlertDialog} that was shown to the user prompting them to download the app<br></td></tr
><tr
id=sl_svn2867_380

><td class="source">   *   if a prompt was needed, or null otherwise<br></td></tr
><tr
id=sl_svn2867_381

><td class="source">   */<br></td></tr
><tr
id=sl_svn2867_382

><td class="source">  public final AlertDialog shareText(CharSequence text, CharSequence type) {<br></td></tr
><tr
id=sl_svn2867_383

><td class="source">    Intent intent = new Intent();<br></td></tr
><tr
id=sl_svn2867_384

><td class="source">    intent.addCategory(Intent.CATEGORY_DEFAULT);<br></td></tr
><tr
id=sl_svn2867_385

><td class="source">    intent.setAction(BS_PACKAGE + &quot;.ENCODE&quot;);<br></td></tr
><tr
id=sl_svn2867_386

><td class="source">    intent.putExtra(&quot;ENCODE_TYPE&quot;, type);<br></td></tr
><tr
id=sl_svn2867_387

><td class="source">    intent.putExtra(&quot;ENCODE_DATA&quot;, text);<br></td></tr
><tr
id=sl_svn2867_388

><td class="source">    String targetAppPackage = findTargetAppPackage(intent);<br></td></tr
><tr
id=sl_svn2867_389

><td class="source">    if (targetAppPackage == null) {<br></td></tr
><tr
id=sl_svn2867_390

><td class="source">      return showDownloadDialog();<br></td></tr
><tr
id=sl_svn2867_391

><td class="source">    }<br></td></tr
><tr
id=sl_svn2867_392

><td class="source">    intent.setPackage(targetAppPackage);<br></td></tr
><tr
id=sl_svn2867_393

><td class="source">    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);<br></td></tr
><tr
id=sl_svn2867_394

><td class="source">    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_WHEN_TASK_RESET);<br></td></tr
><tr
id=sl_svn2867_395

><td class="source">    attachMoreExtras(intent);<br></td></tr
><tr
id=sl_svn2867_396

><td class="source">    activity.startActivity(intent);<br></td></tr
><tr
id=sl_svn2867_397

><td class="source">    return null;<br></td></tr
><tr
id=sl_svn2867_398

><td class="source">  }<br></td></tr
><tr
id=sl_svn2867_399

><td class="source">  <br></td></tr
><tr
id=sl_svn2867_400

><td class="source">  private static List&lt;String&gt; list(String... values) {<br></td></tr
><tr
id=sl_svn2867_401

><td class="source">    return Collections.unmodifiableList(Arrays.asList(values));<br></td></tr
><tr
id=sl_svn2867_402

><td class="source">  }<br></td></tr
><tr
id=sl_svn2867_403

><td class="source"><br></td></tr
><tr
id=sl_svn2867_404

><td class="source">  private void attachMoreExtras(Intent intent) {<br></td></tr
><tr
id=sl_svn2867_405

><td class="source">    for (Map.Entry&lt;String,Object&gt; entry : moreExtras.entrySet()) {<br></td></tr
><tr
id=sl_svn2867_406

><td class="source">      String key = entry.getKey();<br></td></tr
><tr
id=sl_svn2867_407

><td class="source">      Object value = entry.getValue();<br></td></tr
><tr
id=sl_svn2867_408

><td class="source">      // Kind of hacky<br></td></tr
><tr
id=sl_svn2867_409

><td class="source">      if (value instanceof Integer) {<br></td></tr
><tr
id=sl_svn2867_410

><td class="source">        intent.putExtra(key, (Integer) value);<br></td></tr
><tr
id=sl_svn2867_411

><td class="source">      } else if (value instanceof Long) {<br></td></tr
><tr
id=sl_svn2867_412

><td class="source">        intent.putExtra(key, (Long) value);<br></td></tr
><tr
id=sl_svn2867_413

><td class="source">      } else if (value instanceof Boolean) {<br></td></tr
><tr
id=sl_svn2867_414

><td class="source">        intent.putExtra(key, (Boolean) value);<br></td></tr
><tr
id=sl_svn2867_415

><td class="source">      } else if (value instanceof Double) {<br></td></tr
><tr
id=sl_svn2867_416

><td class="source">        intent.putExtra(key, (Double) value);<br></td></tr
><tr
id=sl_svn2867_417

><td class="source">      } else if (value instanceof Float) {<br></td></tr
><tr
id=sl_svn2867_418

><td class="source">        intent.putExtra(key, (Float) value);<br></td></tr
><tr
id=sl_svn2867_419

><td class="source">      } else if (value instanceof Bundle) {<br></td></tr
><tr
id=sl_svn2867_420

><td class="source">        intent.putExtra(key, (Bundle) value);<br></td></tr
><tr
id=sl_svn2867_421

><td class="source">      } else {<br></td></tr
><tr
id=sl_svn2867_422

><td class="source">        intent.putExtra(key, value.toString());<br></td></tr
><tr
id=sl_svn2867_423

><td class="source">      }<br></td></tr
><tr
id=sl_svn2867_424

><td class="source">    }<br></td></tr
><tr
id=sl_svn2867_425

><td class="source">  }<br></td></tr
><tr
id=sl_svn2867_426

><td class="source"><br></td></tr
><tr
id=sl_svn2867_427

><td class="source">}<br></td></tr
></table></pre>
<pre><table width="100%"><tr class="cursor_stop cursor_hidden"><td></td></tr></table></pre>
</td>
</tr></table>

 
<script type="text/javascript">
 var lineNumUnderMouse = -1;
 
 function gutterOver(num) {
 gutterOut();
 var newTR = document.getElementById('gr_svn2867_' + num);
 if (newTR) {
 newTR.className = 'undermouse';
 }
 lineNumUnderMouse = num;
 }
 function gutterOut() {
 if (lineNumUnderMouse != -1) {
 var oldTR = document.getElementById(
 'gr_svn2867_' + lineNumUnderMouse);
 if (oldTR) {
 oldTR.className = '';
 }
 lineNumUnderMouse = -1;
 }
 }
 var numsGenState = {table_base_id: 'nums_table_'};
 var srcGenState = {table_base_id: 'src_table_'};
 var alignerRunning = false;
 var startOver = false;
 function setLineNumberHeights() {
 if (alignerRunning) {
 startOver = true;
 return;
 }
 numsGenState.chunk_id = 0;
 numsGenState.table = document.getElementById('nums_table_0');
 numsGenState.row_num = 0;
 if (!numsGenState.table) {
 return; // Silently exit if no file is present.
 }
 srcGenState.chunk_id = 0;
 srcGenState.table = document.getElementById('src_table_0');
 srcGenState.row_num = 0;
 alignerRunning = true;
 continueToSetLineNumberHeights();
 }
 function rowGenerator(genState) {
 if (genState.row_num < genState.table.rows.length) {
 var currentRow = genState.table.rows[genState.row_num];
 genState.row_num++;
 return currentRow;
 }
 var newTable = document.getElementById(
 genState.table_base_id + (genState.chunk_id + 1));
 if (newTable) {
 genState.chunk_id++;
 genState.row_num = 0;
 genState.table = newTable;
 return genState.table.rows[0];
 }
 return null;
 }
 var MAX_ROWS_PER_PASS = 1000;
 function continueToSetLineNumberHeights() {
 var rowsInThisPass = 0;
 var numRow = 1;
 var srcRow = 1;
 while (numRow && srcRow && rowsInThisPass < MAX_ROWS_PER_PASS) {
 numRow = rowGenerator(numsGenState);
 srcRow = rowGenerator(srcGenState);
 rowsInThisPass++;
 if (numRow && srcRow) {
 if (numRow.offsetHeight != srcRow.offsetHeight) {
 numRow.firstChild.style.height = srcRow.offsetHeight + 'px';
 }
 }
 }
 if (rowsInThisPass >= MAX_ROWS_PER_PASS) {
 setTimeout(continueToSetLineNumberHeights, 10);
 } else {
 alignerRunning = false;
 if (startOver) {
 startOver = false;
 setTimeout(setLineNumberHeights, 500);
 }
 }
 }
 function initLineNumberHeights() {
 // Do 2 complete passes, because there can be races
 // between this code and prettify.
 startOver = true;
 setTimeout(setLineNumberHeights, 250);
 window.onresize = setLineNumberHeights;
 }
 initLineNumberHeights();
</script>

 
 
 <div id="log">
 <div style="text-align:right">
 <a class="ifCollapse" href="#" onclick="_toggleMeta(this); return false">Show details</a>
 <a class="ifExpand" href="#" onclick="_toggleMeta(this); return false">Hide details</a>
 </div>
 <div class="ifExpand">
 
 
 <div class="pmeta_bubble_bg" style="border:1px solid white">
 <div class="round4"></div>
 <div class="round2"></div>
 <div class="round1"></div>
 <div class="box-inner">
 <div id="changelog">
 <p>Change log</p>
 <div>
 <a href="/p/zxing/source/detail?spec=svn2867&amp;r=2825">r2825</a>
 by srowen
 on Jun 22, 2013
 &nbsp; <a href="/p/zxing/source/diff?spec=svn2867&r=2825&amp;format=side&amp;path=/trunk/android-integration/src/com/google/zxing/integration/android/IntentIntegrator.java&amp;old_path=/trunk/android-integration/src/com/google/zxing/integration/android/IntentIntegrator.java&amp;old=2661">Diff</a>
 </div>
 <pre>Respect order of target apps in deciding
which to invoke</pre>
 </div>
 
 
 
 
 
 
 <script type="text/javascript">
 var detail_url = '/p/zxing/source/detail?r=2825&spec=svn2867';
 var publish_url = '/p/zxing/source/detail?r=2825&spec=svn2867#publish';
 // describe the paths of this revision in javascript.
 var changed_paths = [];
 var changed_urls = [];
 
 changed_paths.push('/trunk/android-integration/src/com/google/zxing/integration/android/IntentIntegrator.java');
 changed_urls.push('/p/zxing/source/browse/trunk/android-integration/src/com/google/zxing/integration/android/IntentIntegrator.java?r\x3d2825\x26spec\x3dsvn2867');
 
 var selected_path = '/trunk/android-integration/src/com/google/zxing/integration/android/IntentIntegrator.java';
 
 
 function getCurrentPageIndex() {
 for (var i = 0; i < changed_paths.length; i++) {
 if (selected_path == changed_paths[i]) {
 return i;
 }
 }
 }
 function getNextPage() {
 var i = getCurrentPageIndex();
 if (i < changed_paths.length - 1) {
 return changed_urls[i + 1];
 }
 return null;
 }
 function getPreviousPage() {
 var i = getCurrentPageIndex();
 if (i > 0) {
 return changed_urls[i - 1];
 }
 return null;
 }
 function gotoNextPage() {
 var page = getNextPage();
 if (!page) {
 page = detail_url;
 }
 window.location = page;
 }
 function gotoPreviousPage() {
 var page = getPreviousPage();
 if (!page) {
 page = detail_url;
 }
 window.location = page;
 }
 function gotoDetailPage() {
 window.location = detail_url;
 }
 function gotoPublishPage() {
 window.location = publish_url;
 }
</script>

 
 <style type="text/css">
 #review_nav {
 border-top: 3px solid white;
 padding-top: 6px;
 margin-top: 1em;
 }
 #review_nav td {
 vertical-align: middle;
 }
 #review_nav select {
 margin: .5em 0;
 }
 </style>
 <div id="review_nav">
 <table><tr><td>Go to:&nbsp;</td><td>
 <select name="files_in_rev" onchange="window.location=this.value">
 
 <option value="/p/zxing/source/browse/trunk/android-integration/src/com/google/zxing/integration/android/IntentIntegrator.java?r=2825&amp;spec=svn2867"
 selected="selected"
 >...on/android/IntentIntegrator.java</option>
 
 </select>
 </td></tr></table>
 
 
 



 
 </div>
 
 
 </div>
 <div class="round1"></div>
 <div class="round2"></div>
 <div class="round4"></div>
 </div>
 <div class="pmeta_bubble_bg" style="border:1px solid white">
 <div class="round4"></div>
 <div class="round2"></div>
 <div class="round1"></div>
 <div class="box-inner">
 <div id="older_bubble">
 <p>Older revisions</p>
 
 
 <div class="closed" style="margin-bottom:3px;" >
 <a class="ifClosed" onclick="return _toggleHidden(this)"><img src="http://www.gstatic.com/codesite/ph/images/plus.gif" ></a>
 <a class="ifOpened" onclick="return _toggleHidden(this)"><img src="http://www.gstatic.com/codesite/ph/images/minus.gif" ></a>
 <a href="/p/zxing/source/detail?spec=svn2867&r=2661">r2661</a>
 by srowen
 on Apr 20, 2013
 &nbsp; <a href="/p/zxing/source/diff?spec=svn2867&r=2661&amp;format=side&amp;path=/trunk/android-integration/src/com/google/zxing/integration/android/IntentIntegrator.java&amp;old_path=/trunk/android-integration/src/com/google/zxing/integration/android/IntentIntegrator.java&amp;old=2645">Diff</a>
 <br>
 <pre class="ifOpened">Update and refactor poms under one
parent</pre>
 </div>
 
 <div class="closed" style="margin-bottom:3px;" >
 <a class="ifClosed" onclick="return _toggleHidden(this)"><img src="http://www.gstatic.com/codesite/ph/images/plus.gif" ></a>
 <a class="ifOpened" onclick="return _toggleHidden(this)"><img src="http://www.gstatic.com/codesite/ph/images/minus.gif" ></a>
 <a href="/p/zxing/source/detail?spec=svn2867&r=2645">r2645</a>
 by srowen
 on Apr 10, 2013
 &nbsp; <a href="/p/zxing/source/diff?spec=svn2867&r=2645&amp;format=side&amp;path=/trunk/android-integration/src/com/google/zxing/integration/android/IntentIntegrator.java&amp;old_path=/trunk/android-integration/src/com/google/zxing/integration/android/IntentIntegrator.java&amp;old=2581">Diff</a>
 <br>
 <pre class="ifOpened">Remove deprecated IntentIntegrator
method</pre>
 </div>
 
 <div class="closed" style="margin-bottom:3px;" >
 <a class="ifClosed" onclick="return _toggleHidden(this)"><img src="http://www.gstatic.com/codesite/ph/images/plus.gif" ></a>
 <a class="ifOpened" onclick="return _toggleHidden(this)"><img src="http://www.gstatic.com/codesite/ph/images/minus.gif" ></a>
 <a href="/p/zxing/source/detail?spec=svn2867&r=2581">r2581</a>
 by srowen
 on Mar 1, 2013
 &nbsp; <a href="/p/zxing/source/diff?spec=svn2867&r=2581&amp;format=side&amp;path=/trunk/android-integration/src/com/google/zxing/integration/android/IntentIntegrator.java&amp;old_path=/trunk/android-integration/src/com/google/zxing/integration/android/IntentIntegrator.java&amp;old=2544">Diff</a>
 <br>
 <pre class="ifOpened">Various changes from IJ12.1
inspections</pre>
 </div>
 
 
 <a href="/p/zxing/source/list?path=/trunk/android-integration/src/com/google/zxing/integration/android/IntentIntegrator.java&start=2825">All revisions of this file</a>
 </div>
 </div>
 <div class="round1"></div>
 <div class="round2"></div>
 <div class="round4"></div>
 </div>
 
 <div class="pmeta_bubble_bg" style="border:1px solid white">
 <div class="round4"></div>
 <div class="round2"></div>
 <div class="round1"></div>
 <div class="box-inner">
 <div id="fileinfo_bubble">
 <p>File info</p>
 
 <div>Size: 15772 bytes,
 427 lines</div>
 
 <div><a href="//zxing.googlecode.com/svn/trunk/android-integration/src/com/google/zxing/integration/android/IntentIntegrator.java">View raw file</a></div>
 </div>
 
 </div>
 <div class="round1"></div>
 <div class="round2"></div>
 <div class="round4"></div>
 </div>
 </div>
 </div>


</div>

</div>
</div>

<script src="http://www.gstatic.com/codesite/ph/16876283342775096309/js/prettify/prettify.js"></script>
<script type="text/javascript">prettyPrint();</script>


<script src="http://www.gstatic.com/codesite/ph/16876283342775096309/js/source_file_scripts.js"></script>

 <script type="text/javascript" src="http://www.gstatic.com/codesite/ph/16876283342775096309/js/kibbles.js"></script>
 <script type="text/javascript">
 var lastStop = null;
 var initialized = false;
 
 function updateCursor(next, prev) {
 if (prev && prev.element) {
 prev.element.className = 'cursor_stop cursor_hidden';
 }
 if (next && next.element) {
 next.element.className = 'cursor_stop cursor';
 lastStop = next.index;
 }
 }
 
 function pubRevealed(data) {
 updateCursorForCell(data.cellId, 'cursor_stop cursor_hidden');
 if (initialized) {
 reloadCursors();
 }
 }
 
 function draftRevealed(data) {
 updateCursorForCell(data.cellId, 'cursor_stop cursor_hidden');
 if (initialized) {
 reloadCursors();
 }
 }
 
 function draftDestroyed(data) {
 updateCursorForCell(data.cellId, 'nocursor');
 if (initialized) {
 reloadCursors();
 }
 }
 function reloadCursors() {
 kibbles.skipper.reset();
 loadCursors();
 if (lastStop != null) {
 kibbles.skipper.setCurrentStop(lastStop);
 }
 }
 // possibly the simplest way to insert any newly added comments
 // is to update the class of the corresponding cursor row,
 // then refresh the entire list of rows.
 function updateCursorForCell(cellId, className) {
 var cell = document.getElementById(cellId);
 // we have to go two rows back to find the cursor location
 var row = getPreviousElement(cell.parentNode);
 row.className = className;
 }
 // returns the previous element, ignores text nodes.
 function getPreviousElement(e) {
 var element = e.previousSibling;
 if (element.nodeType == 3) {
 element = element.previousSibling;
 }
 if (element && element.tagName) {
 return element;
 }
 }
 function loadCursors() {
 // register our elements with skipper
 var elements = CR_getElements('*', 'cursor_stop');
 var len = elements.length;
 for (var i = 0; i < len; i++) {
 var element = elements[i]; 
 element.className = 'cursor_stop cursor_hidden';
 kibbles.skipper.append(element);
 }
 }
 function toggleComments() {
 CR_toggleCommentDisplay();
 reloadCursors();
 }
 function keysOnLoadHandler() {
 // setup skipper
 kibbles.skipper.addStopListener(
 kibbles.skipper.LISTENER_TYPE.PRE, updateCursor);
 // Set the 'offset' option to return the middle of the client area
 // an option can be a static value, or a callback
 kibbles.skipper.setOption('padding_top', 50);
 // Set the 'offset' option to return the middle of the client area
 // an option can be a static value, or a callback
 kibbles.skipper.setOption('padding_bottom', 100);
 // Register our keys
 kibbles.skipper.addFwdKey("n");
 kibbles.skipper.addRevKey("p");
 kibbles.keys.addKeyPressListener(
 'u', function() { window.location = detail_url; });
 kibbles.keys.addKeyPressListener(
 'r', function() { window.location = detail_url + '#publish'; });
 
 kibbles.keys.addKeyPressListener('j', gotoNextPage);
 kibbles.keys.addKeyPressListener('k', gotoPreviousPage);
 
 
 }
 </script>
<script src="http://www.gstatic.com/codesite/ph/16876283342775096309/js/code_review_scripts.js"></script>
<script type="text/javascript">
 function showPublishInstructions() {
 var element = document.getElementById('review_instr');
 if (element) {
 element.className = 'opened';
 }
 }
 var codereviews;
 function revsOnLoadHandler() {
 // register our source container with the commenting code
 var paths = {'svn2867': '/trunk/android-integration/src/com/google/zxing/integration/android/IntentIntegrator.java'}
 codereviews = CR_controller.setup(
 {"assetVersionPath":"http://www.gstatic.com/codesite/ph/16876283342775096309","profileUrl":"/u/113418019975187221874/","projectHomeUrl":"/p/zxing","token":"fYejgLYFwOdcd8x9Z_WH-vpk9Fw:1376820832250","relativeBaseUrl":"","domainName":null,"assetHostPath":"http://www.gstatic.com/codesite/ph","projectName":"zxing","loggedInUserEmail":"m.mirys@gmail.com"}, '', 'svn2867', paths,
 CR_BrowseIntegrationFactory);
 
 codereviews.registerActivityListener(CR_ActivityType.REVEAL_DRAFT_PLATE, showPublishInstructions);
 
 codereviews.registerActivityListener(CR_ActivityType.REVEAL_PUB_PLATE, pubRevealed);
 codereviews.registerActivityListener(CR_ActivityType.REVEAL_DRAFT_PLATE, draftRevealed);
 codereviews.registerActivityListener(CR_ActivityType.DISCARD_DRAFT_COMMENT, draftDestroyed);
 
 
 
 
 
 
 
 var initialized = true;
 reloadCursors();
 }
 window.onload = function() {keysOnLoadHandler(); revsOnLoadHandler();};

</script>
<script type="text/javascript" src="http://www.gstatic.com/codesite/ph/16876283342775096309/js/dit_scripts.js"></script>

 
 
 
 <script type="text/javascript" src="http://www.gstatic.com/codesite/ph/16876283342775096309/js/ph_core.js"></script>
 
 
 
 
</div> 

<div id="footer" dir="ltr">
 <div class="text">
 <a href="/projecthosting/terms.html">Terms</a> -
 <a href="http://www.google.com/privacy.html">Privacy</a> -
 <a href="/p/support/">Project Hosting Help</a>
 </div>
</div>
 <div class="hostedBy" style="margin-top: -20px;">
 <span style="vertical-align: top;">Powered by <a href="http://code.google.com/projecthosting/">Google Project Hosting</a></span>
 </div>

 
 


 
 </body>
</html>

