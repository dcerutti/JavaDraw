
    

  

<!DOCTYPE html>
<html>
  <head>
    <meta charset='utf-8'>
    <meta http-equiv="X-UA-Compatible" content="chrome=1">
        <title>src/DrawTree.java at master from dcerutti/JavaDraw - GitHub</title>
    <link rel="search" type="application/opensearchdescription+xml" href="/opensearch.xml" title="GitHub" />
    <link rel="fluid-icon" href="https://github.com/fluidicon.png" title="GitHub" />

    <link href="https://assets0.github.com/stylesheets/bundle_common.css?b16a6af5ca98de88176f6046833c0f51d3ebc022" media="screen" rel="stylesheet" type="text/css" />
<link href="https://assets3.github.com/stylesheets/bundle_github.css?b16a6af5ca98de88176f6046833c0f51d3ebc022" media="screen" rel="stylesheet" type="text/css" />

    <script type="text/javascript">
      if (typeof console == "undefined" || typeof console.log == "undefined")
        console = { log: function() {} }
    </script>
    <script type="text/javascript" charset="utf-8">
      var GitHub = {}
      var github_user = 'HiVoltRock'
      
    </script>
    <script src="https://assets2.github.com/javascripts/jquery/jquery-1.4.2.min.js?b16a6af5ca98de88176f6046833c0f51d3ebc022" type="text/javascript"></script>
    <script src="https://assets2.github.com/javascripts/bundle_common.js?b16a6af5ca98de88176f6046833c0f51d3ebc022" type="text/javascript"></script>
<script src="https://assets3.github.com/javascripts/bundle_github.js?b16a6af5ca98de88176f6046833c0f51d3ebc022" type="text/javascript"></script>


        <script type="text/javascript" charset="utf-8">
      GitHub.spy({
        repo: "dcerutti/JavaDraw"
      })
    </script>

    
  <link href="https://github.com/dcerutti/JavaDraw/commits/master.atom" rel="alternate" title="Recent Commits to JavaDraw:master" type="application/atom+xml" />

        <meta name="description" content="Java Memory Draw" />
    <script type="text/javascript">
      GitHub.nameWithOwner = GitHub.nameWithOwner || "dcerutti/JavaDraw";
      GitHub.currentRef = 'master';
      GitHub.commitSHA = "2816b8174bdc7372bd532798dff747e6662a976b";
      GitHub.currentPath = 'src/DrawTree.java';
      GitHub.masterBranch = "master";

      
    </script>
  

        <script type="text/javascript">
      var _gaq = _gaq || [];
      _gaq.push(['_setAccount', 'UA-3769691-2']);
      _gaq.push(['_setDomainName', 'none']);
      _gaq.push(['_trackPageview']);
      (function() {
        var ga = document.createElement('script');
        ga.src = ('https:' == document.location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js';
        ga.setAttribute('async', 'true');
        document.documentElement.firstChild.appendChild(ga);
      })();
    </script>

    
  </head>

  

  <body class="logged_in page-blob">
    

    

    

    

    

    <div class="subnavd" id="main">
      <div id="header" class="true">
        
          <a class="logo boring" href="https://github.com/">
            <img src="/images/modules/header/logov3.png?changed" class="default" alt="github" />
            <!--[if (gt IE 8)|!(IE)]><!-->
            <img src="/images/modules/header/logov3-hover.png" class="hover" alt="github" />
            <!--<![endif]-->
          </a>
        
        
          





  
    <div class="userbox">
      <div class="avatarname">
        <a href="https://github.com/HiVoltRock"><img src="https://secure.gravatar.com/avatar/deb227848f7b14d1fc7304d80ffa9c4a?s=140&d=https://github.com%2Fimages%2Fgravatars%2Fgravatar-140.png" alt="" width="20" height="20"  /></a>
        <a href="https://github.com/HiVoltRock" class="name">HiVoltRock</a>

        
        
          <a href="https://github.com/inbox/notifications" class="unread_count notifications_count new tooltipped downwards js-notification-count" title="Unread Notifications">1</a>
        
      </div>
      <ul class="usernav">
        <li><a href="https://github.com/">Dashboard</a></li>
        <li>
          
          <a href="https://github.com/inbox">Inbox</a>
          <a href="https://github.com/inbox" class="unread_count ">0</a>
        </li>
        <li><a href="https://github.com/account">Account Settings</a></li>
                        <li><a href="/logout">Log Out</a></li>
      </ul>
    </div><!-- /.userbox -->
  


        
        <div class="topsearch">
  
    <form action="/search" id="top_search_form" method="get">
      <a href="/search" class="advanced-search tooltipped downwards" title="Advanced Search">Advanced Search</a>
      <input type="search" class="search my_repos_autocompleter" name="q" results="5" placeholder="Search&hellip;" /> <input type="submit" value="Search" class="button" />
      <input type="hidden" name="type" value="Everything" />
      <input type="hidden" name="repo" value="" />
      <input type="hidden" name="langOverride" value="" />
      <input type="hidden" name="start_value" value="1" />
    </form>
    <ul class="nav">
      <li><a href="/explore">Explore GitHub</a></li>
      <li><a href="https://gist.github.com">Gist</a></li>
      <li><a href="/blog">Blog</a></li>
      <li><a href="http://help.github.com">Help</a></li>
    </ul>
  
</div>

      </div>

      
      
        
    <div class="site">
      <div class="pagehead repohead vis-public   ">

      

      <div class="title-actions-bar">
        <h1>
          <a href="/dcerutti">dcerutti</a> / <strong><a href="https://github.com/dcerutti/JavaDraw">JavaDraw</a></strong>
          
          
        </h1>

        
    <ul class="actions">
      

      
        <li class="for-owner" style="display:none"><a href="https://github.com/dcerutti/JavaDraw/admin" class="minibutton btn-admin "><span><span class="icon"></span>Admin</span></a></li>
        <li>
          <a href="/dcerutti/JavaDraw/toggle_watch" class="minibutton btn-watch " id="watch_button" onclick="var f = document.createElement('form'); f.style.display = 'none'; this.parentNode.appendChild(f); f.method = 'POST'; f.action = this.href;var s = document.createElement('input'); s.setAttribute('type', 'hidden'); s.setAttribute('name', 'authenticity_token'); s.setAttribute('value', '3c8357c6c9b87feb231c40e03535c7b6c87afe0b'); f.appendChild(s);f.submit();return false;" style="display:none"><span><span class="icon"></span>Watch</span></a>
          <a href="/dcerutti/JavaDraw/toggle_watch" class="minibutton btn-watch " id="unwatch_button" onclick="var f = document.createElement('form'); f.style.display = 'none'; this.parentNode.appendChild(f); f.method = 'POST'; f.action = this.href;var s = document.createElement('input'); s.setAttribute('type', 'hidden'); s.setAttribute('name', 'authenticity_token'); s.setAttribute('value', '3c8357c6c9b87feb231c40e03535c7b6c87afe0b'); f.appendChild(s);f.submit();return false;" style="display:none"><span><span class="icon"></span>Unwatch</span></a>
        </li>
        
          
            <li class="for-notforked" style="display:none"><a href="/dcerutti/JavaDraw/fork" class="minibutton btn-fork " id="fork_button" onclick="var f = document.createElement('form'); f.style.display = 'none'; this.parentNode.appendChild(f); f.method = 'POST'; f.action = this.href;var s = document.createElement('input'); s.setAttribute('type', 'hidden'); s.setAttribute('name', 'authenticity_token'); s.setAttribute('value', '3c8357c6c9b87feb231c40e03535c7b6c87afe0b'); f.appendChild(s);f.submit();return false;"><span><span class="icon"></span>Fork</span></a></li>
            <li class="for-hasfork" style="display:none"><a href="#" class="minibutton btn-fork " id="your_fork_button"><span><span class="icon"></span>Your Fork</span></a></li>
          

          <li id='pull_request_item' class='nspr' style='display:none'><a href="/dcerutti/JavaDraw/pull/new/master" class="minibutton btn-pull-request "><span><span class="icon"></span>Pull Request</span></a></li>
        
      
      
      <li class="repostats">
        <ul class="repo-stats">
          <li class="watchers"><a href="/dcerutti/JavaDraw/watchers" title="Watchers" class="tooltipped downwards">7</a></li>
          <li class="forks"><a href="/dcerutti/JavaDraw/network" title="Forks" class="tooltipped downwards">1</a></li>
        </ul>
      </li>
    </ul>

      </div>

        
  <ul class="tabs">
    <li><a href="https://github.com/dcerutti/JavaDraw" class="selected" highlight="repo_source">Source</a></li>
    <li><a href="https://github.com/dcerutti/JavaDraw/commits/master" highlight="repo_commits">Commits</a></li>
    <li><a href="/dcerutti/JavaDraw/network" highlight="repo_network">Network</a></li>
    <li><a href="/dcerutti/JavaDraw/pulls" highlight="repo_pulls">Pull Requests (0)</a></li>

    
      <li><a href="/dcerutti/JavaDraw/forkqueue" highlight="repo_fork_queue">Fork Queue</a></li>
    

    
      
      <li><a href="/dcerutti/JavaDraw/issues" highlight="issues">Issues (0)</a></li>
    

                <li><a href="/dcerutti/JavaDraw/wiki" highlight="repo_wiki">Wiki (1)</a></li>
        
    <li><a href="/dcerutti/JavaDraw/graphs" highlight="repo_graphs">Graphs</a></li>

    <li class="contextswitch nochoices">
      <span class="toggle leftwards" >
        <em>Branch:</em>
        <code>master</code>
      </span>
    </li>
  </ul>

  <div style="display:none" id="pl-description"><p><em class="placeholder">click here to add a description</em></p></div>
  <div style="display:none" id="pl-homepage"><p><em class="placeholder">click here to add a homepage</em></p></div>

  <div class="subnav-bar">
  
  <ul>
    <li>
      <a href="#" class="dropdown">Switch Branches (1)</a>
      <ul>
        
          
            <li><strong>master &#x2713;</strong></li>
            
      </ul>
    </li>
    <li>
      <a href="#" class="dropdown defunct">Switch Tags (0)</a>
      
    </li>
    <li>
    
    <a href="/dcerutti/JavaDraw/branches" class="manage">Branch List</a>
    
    </li>
  </ul>
</div>

  
  
  
  
  
  



        
    <div class="frame frame-center tree-finder" style="display: none">
      <div class="breadcrumb">
        <b><a href="/dcerutti/JavaDraw">JavaDraw</a></b> /
        <input class="tree-finder-input" type="text" name="query" autocomplete="off" spellcheck="false">
      </div>

      
        <div class="octotip">
          <p>
            <a href="/dcerutti/JavaDraw/dismiss-tree-finder-help" class="dismiss js-dismiss-tree-list-help" title="Hide this notice forever">Dismiss</a>
            <strong>Octotip:</strong> You've activated the <em>file finder</em> by pressing <span class="kbd">t</span>
            Start typing to filter the file list. Use <span class="kbd badmono">↑</span> and <span class="kbd badmono">↓</span> to navigate,
            <span class="kbd">enter</span> to view files.
          </p>
        </div>
      

      <table class="tree-browser" cellpadding="0" cellspacing="0">
        <tr class="js-header"><th>&nbsp;</th><th>name</th></tr>
        <tr class="js-no-results no-results" style="display: none">
          <th colspan="2">No matching files</th>
        </tr>
        <tbody class="js-results-list">
        </tbody>
      </table>
    </div>

    <div id="jump-to-line" style="display:none">
      <h2>Jump to Line</h2>
      <form>
        <input class="textfield" type="text">
        <div class="full-button">
          <button type="submit" class="classy">
            <span>Go</span>
          </button>
        </div>
      </form>
    </div>

    <div id="repo_details" class="metabox clearfix">
      <div id="repo_details_loader" class="metabox-loader" style="display:none">Sending Request&hellip;</div>

        <a href="/dcerutti/JavaDraw/downloads" class="download-source" id="download_button" title="Download source, tagged packages and binaries."><span class="icon"></span>Downloads</a>

      <div id="repository_desc_wrapper">
      <div id="repository_description" rel="repository_description_edit">
        
          <p>Java Memory Draw
            <span id="read_more" style="display:none">&mdash; <a href="#readme">Read more</a></span>
          </p>
        
      </div>

      <div id="repository_description_edit" style="display:none;" class="inline-edit">
        <form action="/dcerutti/JavaDraw/admin/update" method="post"><div style="margin:0;padding:0"><input name="authenticity_token" type="hidden" value="3c8357c6c9b87feb231c40e03535c7b6c87afe0b" /></div>
          <input type="hidden" name="field" value="repository_description">
          <input type="text" class="textfield" name="value" value="Java Memory Draw">
          <div class="form-actions">
            <button class="minibutton"><span>Save</span></button> &nbsp; <a href="#" class="cancel">Cancel</a>
          </div>
        </form>
      </div>

      
      <div class="repository-homepage" id="repository_homepage" rel="repository_homepage_edit">
        <p><a href="http://" rel="nofollow"></a></p>
      </div>

      <div id="repository_homepage_edit" style="display:none;" class="inline-edit">
        <form action="/dcerutti/JavaDraw/admin/update" method="post"><div style="margin:0;padding:0"><input name="authenticity_token" type="hidden" value="3c8357c6c9b87feb231c40e03535c7b6c87afe0b" /></div>
          <input type="hidden" name="field" value="repository_homepage">
          <input type="text" class="textfield" name="value" value="">
          <div class="form-actions">
            <button class="minibutton"><span>Save</span></button> &nbsp; <a href="#" class="cancel">Cancel</a>
          </div>
        </form>
      </div>
      </div>
      <div class="rule "></div>
            <div id="url_box" class="url-box">
        <ul class="clone-urls">
          
            
              <li id="private_clone_url"><a href="git@github.com:dcerutti/JavaDraw.git" data-permissions="Read+Write">SSH</a></li>
            
            <li id="http_clone_url"><a href="https://HiVoltRock@github.com/dcerutti/JavaDraw.git" data-permissions="Read+Write">HTTP</a></li>
            <li id="public_clone_url"><a href="git://github.com/dcerutti/JavaDraw.git" data-permissions="Read-Only">Git Read-Only</a></li>
          
          
        </ul>
        <input type="text" spellcheck="false" id="url_field" class="url-field" />
              <span style="display:none" id="url_box_clippy"></span>
      <span id="clippy_tooltip_url_box_clippy" class="clippy-tooltip tooltipped" title="copy to clipboard">
      <object classid="clsid:d27cdb6e-ae6d-11cf-96b8-444553540000"
              width="14"
              height="14"
              class="clippy"
              id="clippy" >
      <param name="movie" value="https://assets1.github.com/flash/clippy.swf?v5"/>
      <param name="allowScriptAccess" value="always" />
      <param name="quality" value="high" />
      <param name="scale" value="noscale" />
      <param NAME="FlashVars" value="id=url_box_clippy&amp;copied=&amp;copyto=">
      <param name="bgcolor" value="#FFFFFF">
      <param name="wmode" value="opaque">
      <embed src="https://assets1.github.com/flash/clippy.swf?v5"
             width="14"
             height="14"
             name="clippy"
             quality="high"
             allowScriptAccess="always"
             type="application/x-shockwave-flash"
             pluginspage="http://www.macromedia.com/go/getflashplayer"
             FlashVars="id=url_box_clippy&amp;copied=&amp;copyto="
             bgcolor="#FFFFFF"
             wmode="opaque"
      />
      </object>
      </span>

        <p id="url_description">This URL has <strong>Read+Write</strong> access</p>
      </div>
    </div>


        

      </div><!-- /.pagehead -->

      

  





<script type="text/javascript">
  GitHub.downloadRepo = '/dcerutti/JavaDraw/archives/master'
  GitHub.revType = "master"

  GitHub.controllerName = "blob"
  GitHub.actionName     = "show"
  GitHub.currentAction  = "blob#show"

  
    GitHub.hasWriteAccess = true
    GitHub.hasAdminAccess = false
    GitHub.watchingRepo = true
    GitHub.ignoredRepo = false
    GitHub.hasForkOfRepo = ""
    GitHub.hasForked = false
  

  
</script>






<div class="flash-messages"></div>


  <div id="commit">
    <div class="group">
        
  <div class="envelope commit">
    <div class="human">
      
        <div class="message"><pre><a href="/dcerutti/JavaDraw/commit/2816b8174bdc7372bd532798dff747e6662a976b">(Mike,Elvin,Dan Joint Commit) We fixed some graphics code around and added stackFrame nodes in the debugger...more to come</a> </pre></div>
      

      <div class="actor">
        <div class="gravatar">
          
          <img src="https://secure.gravatar.com/avatar/fe55030b565909cb0cc26cf7e4f71d65?s=140&d=https://github.com%2Fimages%2Fgravatars%2Fgravatar-140.png" alt="" width="30" height="30"  />
        </div>
        <div class="name"><a href="/dcerutti">dcerutti</a> <span>(author)</span></div>
        <div class="date">
          <abbr class="relatize" title="2011-03-09 18:00:44">Wed Mar 09 18:00:44 -0800 2011</abbr>
        </div>
      </div>

      

    </div>
    <div class="machine">
      <span>c</span>ommit&nbsp;&nbsp;<a href="/dcerutti/JavaDraw/commit/2816b8174bdc7372bd532798dff747e6662a976b" hotkey="c">2816b8174bdc7372bd53</a><br />
      <span>t</span>ree&nbsp;&nbsp;&nbsp;&nbsp;<a href="/dcerutti/JavaDraw/tree/2816b8174bdc7372bd532798dff747e6662a976b" hotkey="t">dae1118d74952386aac8</a><br />
      
        <span>p</span>arent&nbsp;
        
        <a href="/dcerutti/JavaDraw/tree/f9200afea4743f49c8e0c12250846e4781ae90c8" hotkey="p">f9200afea4743f49c8e0</a>
      

    </div>
  </div>

    </div>
  </div>



  <div id="slider">

  

    <div class="breadcrumb" data-path="src/DrawTree.java/">
      <b><a href="/dcerutti/JavaDraw/tree/2816b8174bdc7372bd532798dff747e6662a976b">JavaDraw</a></b> / <a href="/dcerutti/JavaDraw/tree/2816b8174bdc7372bd532798dff747e6662a976b/src">src</a> / DrawTree.java       <span style="display:none" id="clippy_3116">src/DrawTree.java</span>
      
      <object classid="clsid:d27cdb6e-ae6d-11cf-96b8-444553540000"
              width="110"
              height="14"
              class="clippy"
              id="clippy" >
      <param name="movie" value="https://assets1.github.com/flash/clippy.swf?v5"/>
      <param name="allowScriptAccess" value="always" />
      <param name="quality" value="high" />
      <param name="scale" value="noscale" />
      <param NAME="FlashVars" value="id=clippy_3116&amp;copied=copied!&amp;copyto=copy to clipboard">
      <param name="bgcolor" value="#FFFFFF">
      <param name="wmode" value="opaque">
      <embed src="https://assets1.github.com/flash/clippy.swf?v5"
             width="110"
             height="14"
             name="clippy"
             quality="high"
             allowScriptAccess="always"
             type="application/x-shockwave-flash"
             pluginspage="http://www.macromedia.com/go/getflashplayer"
             FlashVars="id=clippy_3116&amp;copied=copied!&amp;copyto=copy to clipboard"
             bgcolor="#FFFFFF"
             wmode="opaque"
      />
      </object>
      

    </div>

    <div class="frames">
      <div class="frame frame-center" data-path="src/DrawTree.java/">
        
          <ul class="big-actions">
            
            <li><a class="file-edit-link minibutton" href="/dcerutti/JavaDraw/file-edit/__current_ref__/src/DrawTree.java"><span>Edit this file</span></a></li>
          </ul>
        

        <div id="files">
          <div class="file">
            <div class="meta">
              <div class="info">
                <span class="icon"><img alt="Txt" height="16" src="https://assets3.github.com/images/icons/txt.png?b16a6af5ca98de88176f6046833c0f51d3ebc022" width="16" /></span>
                <span class="mode" title="File Mode">100644</span>
                
                  <span>332 lines (242 sloc)</span>
                
                <span>6.534 kb</span>
              </div>
              <ul class="actions">
                <li><a href="/dcerutti/JavaDraw/raw/master/src/DrawTree.java" id="raw-url">raw</a></li>
                
                  <li><a href="/dcerutti/JavaDraw/blame/master/src/DrawTree.java">blame</a></li>
                
                <li><a href="/dcerutti/JavaDraw/commits/master/src/DrawTree.java">history</a></li>
              </ul>
            </div>
            
  <div class="data type-java">
    
      <table cellpadding="0" cellspacing="0">
        <tr>
          <td>
            <pre class="line_numbers"><span id="L1" rel="#L1">1</span>
<span id="L2" rel="#L2">2</span>
<span id="L3" rel="#L3">3</span>
<span id="L4" rel="#L4">4</span>
<span id="L5" rel="#L5">5</span>
<span id="L6" rel="#L6">6</span>
<span id="L7" rel="#L7">7</span>
<span id="L8" rel="#L8">8</span>
<span id="L9" rel="#L9">9</span>
<span id="L10" rel="#L10">10</span>
<span id="L11" rel="#L11">11</span>
<span id="L12" rel="#L12">12</span>
<span id="L13" rel="#L13">13</span>
<span id="L14" rel="#L14">14</span>
<span id="L15" rel="#L15">15</span>
<span id="L16" rel="#L16">16</span>
<span id="L17" rel="#L17">17</span>
<span id="L18" rel="#L18">18</span>
<span id="L19" rel="#L19">19</span>
<span id="L20" rel="#L20">20</span>
<span id="L21" rel="#L21">21</span>
<span id="L22" rel="#L22">22</span>
<span id="L23" rel="#L23">23</span>
<span id="L24" rel="#L24">24</span>
<span id="L25" rel="#L25">25</span>
<span id="L26" rel="#L26">26</span>
<span id="L27" rel="#L27">27</span>
<span id="L28" rel="#L28">28</span>
<span id="L29" rel="#L29">29</span>
<span id="L30" rel="#L30">30</span>
<span id="L31" rel="#L31">31</span>
<span id="L32" rel="#L32">32</span>
<span id="L33" rel="#L33">33</span>
<span id="L34" rel="#L34">34</span>
<span id="L35" rel="#L35">35</span>
<span id="L36" rel="#L36">36</span>
<span id="L37" rel="#L37">37</span>
<span id="L38" rel="#L38">38</span>
<span id="L39" rel="#L39">39</span>
<span id="L40" rel="#L40">40</span>
<span id="L41" rel="#L41">41</span>
<span id="L42" rel="#L42">42</span>
<span id="L43" rel="#L43">43</span>
<span id="L44" rel="#L44">44</span>
<span id="L45" rel="#L45">45</span>
<span id="L46" rel="#L46">46</span>
<span id="L47" rel="#L47">47</span>
<span id="L48" rel="#L48">48</span>
<span id="L49" rel="#L49">49</span>
<span id="L50" rel="#L50">50</span>
<span id="L51" rel="#L51">51</span>
<span id="L52" rel="#L52">52</span>
<span id="L53" rel="#L53">53</span>
<span id="L54" rel="#L54">54</span>
<span id="L55" rel="#L55">55</span>
<span id="L56" rel="#L56">56</span>
<span id="L57" rel="#L57">57</span>
<span id="L58" rel="#L58">58</span>
<span id="L59" rel="#L59">59</span>
<span id="L60" rel="#L60">60</span>
<span id="L61" rel="#L61">61</span>
<span id="L62" rel="#L62">62</span>
<span id="L63" rel="#L63">63</span>
<span id="L64" rel="#L64">64</span>
<span id="L65" rel="#L65">65</span>
<span id="L66" rel="#L66">66</span>
<span id="L67" rel="#L67">67</span>
<span id="L68" rel="#L68">68</span>
<span id="L69" rel="#L69">69</span>
<span id="L70" rel="#L70">70</span>
<span id="L71" rel="#L71">71</span>
<span id="L72" rel="#L72">72</span>
<span id="L73" rel="#L73">73</span>
<span id="L74" rel="#L74">74</span>
<span id="L75" rel="#L75">75</span>
<span id="L76" rel="#L76">76</span>
<span id="L77" rel="#L77">77</span>
<span id="L78" rel="#L78">78</span>
<span id="L79" rel="#L79">79</span>
<span id="L80" rel="#L80">80</span>
<span id="L81" rel="#L81">81</span>
<span id="L82" rel="#L82">82</span>
<span id="L83" rel="#L83">83</span>
<span id="L84" rel="#L84">84</span>
<span id="L85" rel="#L85">85</span>
<span id="L86" rel="#L86">86</span>
<span id="L87" rel="#L87">87</span>
<span id="L88" rel="#L88">88</span>
<span id="L89" rel="#L89">89</span>
<span id="L90" rel="#L90">90</span>
<span id="L91" rel="#L91">91</span>
<span id="L92" rel="#L92">92</span>
<span id="L93" rel="#L93">93</span>
<span id="L94" rel="#L94">94</span>
<span id="L95" rel="#L95">95</span>
<span id="L96" rel="#L96">96</span>
<span id="L97" rel="#L97">97</span>
<span id="L98" rel="#L98">98</span>
<span id="L99" rel="#L99">99</span>
<span id="L100" rel="#L100">100</span>
<span id="L101" rel="#L101">101</span>
<span id="L102" rel="#L102">102</span>
<span id="L103" rel="#L103">103</span>
<span id="L104" rel="#L104">104</span>
<span id="L105" rel="#L105">105</span>
<span id="L106" rel="#L106">106</span>
<span id="L107" rel="#L107">107</span>
<span id="L108" rel="#L108">108</span>
<span id="L109" rel="#L109">109</span>
<span id="L110" rel="#L110">110</span>
<span id="L111" rel="#L111">111</span>
<span id="L112" rel="#L112">112</span>
<span id="L113" rel="#L113">113</span>
<span id="L114" rel="#L114">114</span>
<span id="L115" rel="#L115">115</span>
<span id="L116" rel="#L116">116</span>
<span id="L117" rel="#L117">117</span>
<span id="L118" rel="#L118">118</span>
<span id="L119" rel="#L119">119</span>
<span id="L120" rel="#L120">120</span>
<span id="L121" rel="#L121">121</span>
<span id="L122" rel="#L122">122</span>
<span id="L123" rel="#L123">123</span>
<span id="L124" rel="#L124">124</span>
<span id="L125" rel="#L125">125</span>
<span id="L126" rel="#L126">126</span>
<span id="L127" rel="#L127">127</span>
<span id="L128" rel="#L128">128</span>
<span id="L129" rel="#L129">129</span>
<span id="L130" rel="#L130">130</span>
<span id="L131" rel="#L131">131</span>
<span id="L132" rel="#L132">132</span>
<span id="L133" rel="#L133">133</span>
<span id="L134" rel="#L134">134</span>
<span id="L135" rel="#L135">135</span>
<span id="L136" rel="#L136">136</span>
<span id="L137" rel="#L137">137</span>
<span id="L138" rel="#L138">138</span>
<span id="L139" rel="#L139">139</span>
<span id="L140" rel="#L140">140</span>
<span id="L141" rel="#L141">141</span>
<span id="L142" rel="#L142">142</span>
<span id="L143" rel="#L143">143</span>
<span id="L144" rel="#L144">144</span>
<span id="L145" rel="#L145">145</span>
<span id="L146" rel="#L146">146</span>
<span id="L147" rel="#L147">147</span>
<span id="L148" rel="#L148">148</span>
<span id="L149" rel="#L149">149</span>
<span id="L150" rel="#L150">150</span>
<span id="L151" rel="#L151">151</span>
<span id="L152" rel="#L152">152</span>
<span id="L153" rel="#L153">153</span>
<span id="L154" rel="#L154">154</span>
<span id="L155" rel="#L155">155</span>
<span id="L156" rel="#L156">156</span>
<span id="L157" rel="#L157">157</span>
<span id="L158" rel="#L158">158</span>
<span id="L159" rel="#L159">159</span>
<span id="L160" rel="#L160">160</span>
<span id="L161" rel="#L161">161</span>
<span id="L162" rel="#L162">162</span>
<span id="L163" rel="#L163">163</span>
<span id="L164" rel="#L164">164</span>
<span id="L165" rel="#L165">165</span>
<span id="L166" rel="#L166">166</span>
<span id="L167" rel="#L167">167</span>
<span id="L168" rel="#L168">168</span>
<span id="L169" rel="#L169">169</span>
<span id="L170" rel="#L170">170</span>
<span id="L171" rel="#L171">171</span>
<span id="L172" rel="#L172">172</span>
<span id="L173" rel="#L173">173</span>
<span id="L174" rel="#L174">174</span>
<span id="L175" rel="#L175">175</span>
<span id="L176" rel="#L176">176</span>
<span id="L177" rel="#L177">177</span>
<span id="L178" rel="#L178">178</span>
<span id="L179" rel="#L179">179</span>
<span id="L180" rel="#L180">180</span>
<span id="L181" rel="#L181">181</span>
<span id="L182" rel="#L182">182</span>
<span id="L183" rel="#L183">183</span>
<span id="L184" rel="#L184">184</span>
<span id="L185" rel="#L185">185</span>
<span id="L186" rel="#L186">186</span>
<span id="L187" rel="#L187">187</span>
<span id="L188" rel="#L188">188</span>
<span id="L189" rel="#L189">189</span>
<span id="L190" rel="#L190">190</span>
<span id="L191" rel="#L191">191</span>
<span id="L192" rel="#L192">192</span>
<span id="L193" rel="#L193">193</span>
<span id="L194" rel="#L194">194</span>
<span id="L195" rel="#L195">195</span>
<span id="L196" rel="#L196">196</span>
<span id="L197" rel="#L197">197</span>
<span id="L198" rel="#L198">198</span>
<span id="L199" rel="#L199">199</span>
<span id="L200" rel="#L200">200</span>
<span id="L201" rel="#L201">201</span>
<span id="L202" rel="#L202">202</span>
<span id="L203" rel="#L203">203</span>
<span id="L204" rel="#L204">204</span>
<span id="L205" rel="#L205">205</span>
<span id="L206" rel="#L206">206</span>
<span id="L207" rel="#L207">207</span>
<span id="L208" rel="#L208">208</span>
<span id="L209" rel="#L209">209</span>
<span id="L210" rel="#L210">210</span>
<span id="L211" rel="#L211">211</span>
<span id="L212" rel="#L212">212</span>
<span id="L213" rel="#L213">213</span>
<span id="L214" rel="#L214">214</span>
<span id="L215" rel="#L215">215</span>
<span id="L216" rel="#L216">216</span>
<span id="L217" rel="#L217">217</span>
<span id="L218" rel="#L218">218</span>
<span id="L219" rel="#L219">219</span>
<span id="L220" rel="#L220">220</span>
<span id="L221" rel="#L221">221</span>
<span id="L222" rel="#L222">222</span>
<span id="L223" rel="#L223">223</span>
<span id="L224" rel="#L224">224</span>
<span id="L225" rel="#L225">225</span>
<span id="L226" rel="#L226">226</span>
<span id="L227" rel="#L227">227</span>
<span id="L228" rel="#L228">228</span>
<span id="L229" rel="#L229">229</span>
<span id="L230" rel="#L230">230</span>
<span id="L231" rel="#L231">231</span>
<span id="L232" rel="#L232">232</span>
<span id="L233" rel="#L233">233</span>
<span id="L234" rel="#L234">234</span>
<span id="L235" rel="#L235">235</span>
<span id="L236" rel="#L236">236</span>
<span id="L237" rel="#L237">237</span>
<span id="L238" rel="#L238">238</span>
<span id="L239" rel="#L239">239</span>
<span id="L240" rel="#L240">240</span>
<span id="L241" rel="#L241">241</span>
<span id="L242" rel="#L242">242</span>
<span id="L243" rel="#L243">243</span>
<span id="L244" rel="#L244">244</span>
<span id="L245" rel="#L245">245</span>
<span id="L246" rel="#L246">246</span>
<span id="L247" rel="#L247">247</span>
<span id="L248" rel="#L248">248</span>
<span id="L249" rel="#L249">249</span>
<span id="L250" rel="#L250">250</span>
<span id="L251" rel="#L251">251</span>
<span id="L252" rel="#L252">252</span>
<span id="L253" rel="#L253">253</span>
<span id="L254" rel="#L254">254</span>
<span id="L255" rel="#L255">255</span>
<span id="L256" rel="#L256">256</span>
<span id="L257" rel="#L257">257</span>
<span id="L258" rel="#L258">258</span>
<span id="L259" rel="#L259">259</span>
<span id="L260" rel="#L260">260</span>
<span id="L261" rel="#L261">261</span>
<span id="L262" rel="#L262">262</span>
<span id="L263" rel="#L263">263</span>
<span id="L264" rel="#L264">264</span>
<span id="L265" rel="#L265">265</span>
<span id="L266" rel="#L266">266</span>
<span id="L267" rel="#L267">267</span>
<span id="L268" rel="#L268">268</span>
<span id="L269" rel="#L269">269</span>
<span id="L270" rel="#L270">270</span>
<span id="L271" rel="#L271">271</span>
<span id="L272" rel="#L272">272</span>
<span id="L273" rel="#L273">273</span>
<span id="L274" rel="#L274">274</span>
<span id="L275" rel="#L275">275</span>
<span id="L276" rel="#L276">276</span>
<span id="L277" rel="#L277">277</span>
<span id="L278" rel="#L278">278</span>
<span id="L279" rel="#L279">279</span>
<span id="L280" rel="#L280">280</span>
<span id="L281" rel="#L281">281</span>
<span id="L282" rel="#L282">282</span>
<span id="L283" rel="#L283">283</span>
<span id="L284" rel="#L284">284</span>
<span id="L285" rel="#L285">285</span>
<span id="L286" rel="#L286">286</span>
<span id="L287" rel="#L287">287</span>
<span id="L288" rel="#L288">288</span>
<span id="L289" rel="#L289">289</span>
<span id="L290" rel="#L290">290</span>
<span id="L291" rel="#L291">291</span>
<span id="L292" rel="#L292">292</span>
<span id="L293" rel="#L293">293</span>
<span id="L294" rel="#L294">294</span>
<span id="L295" rel="#L295">295</span>
<span id="L296" rel="#L296">296</span>
<span id="L297" rel="#L297">297</span>
<span id="L298" rel="#L298">298</span>
<span id="L299" rel="#L299">299</span>
<span id="L300" rel="#L300">300</span>
<span id="L301" rel="#L301">301</span>
<span id="L302" rel="#L302">302</span>
<span id="L303" rel="#L303">303</span>
<span id="L304" rel="#L304">304</span>
<span id="L305" rel="#L305">305</span>
<span id="L306" rel="#L306">306</span>
<span id="L307" rel="#L307">307</span>
<span id="L308" rel="#L308">308</span>
<span id="L309" rel="#L309">309</span>
<span id="L310" rel="#L310">310</span>
<span id="L311" rel="#L311">311</span>
<span id="L312" rel="#L312">312</span>
<span id="L313" rel="#L313">313</span>
<span id="L314" rel="#L314">314</span>
<span id="L315" rel="#L315">315</span>
<span id="L316" rel="#L316">316</span>
<span id="L317" rel="#L317">317</span>
<span id="L318" rel="#L318">318</span>
<span id="L319" rel="#L319">319</span>
<span id="L320" rel="#L320">320</span>
<span id="L321" rel="#L321">321</span>
<span id="L322" rel="#L322">322</span>
<span id="L323" rel="#L323">323</span>
<span id="L324" rel="#L324">324</span>
<span id="L325" rel="#L325">325</span>
<span id="L326" rel="#L326">326</span>
<span id="L327" rel="#L327">327</span>
<span id="L328" rel="#L328">328</span>
<span id="L329" rel="#L329">329</span>
<span id="L330" rel="#L330">330</span>
<span id="L331" rel="#L331">331</span>
<span id="L332" rel="#L332">332</span>
</pre>
          </td>
          <td width="100%">
            
              
                <div class="highlight"><pre><div class='line' id='LC1'><span class="kn">import</span> <span class="nn">java.applet.Applet</span><span class="o">;</span></div><div class='line' id='LC2'><span class="kn">import</span> <span class="nn">java.awt.BorderLayout</span><span class="o">;</span></div><div class='line' id='LC3'><span class="kn">import</span> <span class="nn">java.awt.Canvas</span><span class="o">;</span></div><div class='line' id='LC4'><span class="kn">import</span> <span class="nn">java.awt.Color</span><span class="o">;</span></div><div class='line' id='LC5'><span class="kn">import</span> <span class="nn">java.awt.Frame</span><span class="o">;</span></div><div class='line' id='LC6'><span class="kn">import</span> <span class="nn">java.awt.Graphics</span><span class="o">;</span></div><div class='line' id='LC7'><span class="kn">import</span> <span class="nn">java.awt.Image</span><span class="o">;</span></div><div class='line' id='LC8'><span class="kn">import</span> <span class="nn">java.awt.ScrollPane</span><span class="o">;</span></div><div class='line' id='LC9'><span class="kn">import</span> <span class="nn">java.awt.event.AdjustmentEvent</span><span class="o">;</span></div><div class='line' id='LC10'><span class="kn">import</span> <span class="nn">java.awt.event.AdjustmentListener</span><span class="o">;</span></div><div class='line' id='LC11'><span class="kn">import</span> <span class="nn">java.util.Vector</span><span class="o">;</span></div><div class='line' id='LC12'><br/></div><div class='line' id='LC13'><span class="cm">/*..</span></div><div class='line' id='LC14'><span class="cm"> * This class extends ScrollPane. We then create an instance of an internal</span></div><div class='line' id='LC15'><span class="cm"> * class called OurCanvas. We then add the Canvas to the Scrollpane.</span></div><div class='line' id='LC16'><span class="cm"> * This gives us the scroll functionality.</span></div><div class='line' id='LC17'><span class="cm"> */</span></div><div class='line' id='LC18'><br/></div><div class='line' id='LC19'><span class="kd">public</span> <span class="kd">class</span> <span class="nc">DrawTree</span> <span class="kd">extends</span> <span class="n">ScrollPane</span> <span class="o">{</span></div><div class='line' id='LC20'>	<span class="n">Canvas</span> <span class="n">c</span><span class="o">;</span></div><div class='line' id='LC21'><br/></div><div class='line' id='LC22'>	<span class="cm">/*..</span></div><div class='line' id='LC23'><span class="cm">	 * New constructor for drawtree makes a canvas and scrollpane</span></div><div class='line' id='LC24'><span class="cm">	 */</span></div><div class='line' id='LC25'>	<span class="kd">public</span> <span class="nf">DrawTree</span><span class="o">()</span> <span class="o">{</span></div><div class='line' id='LC26'><br/></div><div class='line' id='LC27'>		<span class="n">setSize</span><span class="o">(</span><span class="mi">801</span><span class="o">,</span><span class="mi">601</span><span class="o">);</span></div><div class='line' id='LC28'>		<span class="n">c</span> <span class="o">=</span> <span class="k">new</span> <span class="n">OurCanvas</span><span class="o">();</span></div><div class='line' id='LC29'>		<span class="n">c</span><span class="o">.</span><span class="na">setSize</span><span class="o">(</span><span class="mi">8</span><span class="o">,</span> <span class="mi">6</span><span class="o">);</span></div><div class='line' id='LC30'>		<span class="n">add</span><span class="o">(</span><span class="n">c</span><span class="o">);</span></div><div class='line' id='LC31'>		<span class="n">AdjustmentListener</span> <span class="n">AL</span> <span class="o">=</span> <span class="k">new</span> <span class="n">MyAdjustmentListener</span><span class="o">();</span></div><div class='line' id='LC32'>		<span class="cm">/*..</span></div><div class='line' id='LC33'><span class="cm">		 * The Adjustment listeners referenced here are used</span></div><div class='line' id='LC34'><span class="cm">		 * so that everytime the scrollbar moves the canvas</span></div><div class='line' id='LC35'><span class="cm">		 * is repainted.</span></div><div class='line' id='LC36'><span class="cm">		 */</span></div><div class='line' id='LC37'>		<span class="n">getVAdjustable</span><span class="o">().</span><span class="na">addAdjustmentListener</span><span class="o">(</span><span class="n">AL</span><span class="o">);</span></div><div class='line' id='LC38'>		<span class="n">getHAdjustable</span><span class="o">().</span><span class="na">addAdjustmentListener</span><span class="o">(</span><span class="n">AL</span><span class="o">);</span></div><div class='line' id='LC39'><br/></div><div class='line' id='LC40'>	<span class="o">}</span></div><div class='line' id='LC41'><br/></div><div class='line' id='LC42'><br/></div><div class='line' id='LC43'>	<span class="c1">// Sample Tree</span></div><div class='line' id='LC44'>	<span class="n">Node</span> <span class="n">test</span> <span class="o">=</span> <span class="n">JavaDrawMain</span><span class="o">.</span><span class="na">BuildSampleTree</span><span class="o">();</span></div><div class='line' id='LC45'>	<span class="n">Vector</span><span class="o">&lt;</span><span class="n">GraphicNode</span><span class="o">&gt;</span> <span class="n">gnList</span> <span class="o">=</span> <span class="k">new</span> <span class="n">Vector</span><span class="o">&lt;</span><span class="n">GraphicNode</span><span class="o">&gt;();</span></div><div class='line' id='LC46'>	<span class="n">Vector</span><span class="o">&lt;</span><span class="n">GraphicLoop</span><span class="o">&gt;</span> <span class="n">loopList</span> <span class="o">=</span> <span class="k">new</span> <span class="n">Vector</span><span class="o">&lt;</span><span class="n">GraphicLoop</span><span class="o">&gt;();</span></div><div class='line' id='LC47'><br/></div><div class='line' id='LC48'>	<span class="kt">int</span> <span class="n">globalLevel</span> <span class="o">=</span> <span class="mi">1</span><span class="o">;</span></div><div class='line' id='LC49'>	<span class="kt">int</span> <span class="n">furthestNodeX</span><span class="o">;</span></div><div class='line' id='LC50'>	<span class="kt">int</span> <span class="n">furthestLoopX</span> <span class="o">=</span> <span class="o">-</span><span class="mi">1</span><span class="o">;</span></div><div class='line' id='LC51'>	<span class="kt">int</span> <span class="n">furthestNodeY</span> <span class="o">=</span> <span class="o">-</span><span class="mi">1</span><span class="o">;</span></div><div class='line' id='LC52'><br/></div><div class='line' id='LC53'>	<span class="cm">/*..</span></div><div class='line' id='LC54'><span class="cm">	 * This function resets everything used</span></div><div class='line' id='LC55'><span class="cm">	 * on re-initializations </span></div><div class='line' id='LC56'><span class="cm">	 */</span></div><div class='line' id='LC57'>	<span class="kd">public</span> <span class="kt">void</span> <span class="nf">reset</span><span class="o">(){</span></div><div class='line' id='LC58'>		<span class="n">globalLevel</span> <span class="o">=</span> <span class="mi">1</span><span class="o">;</span></div><div class='line' id='LC59'>		<span class="n">furthestLoopX</span> <span class="o">=</span> <span class="o">-</span><span class="mi">1</span><span class="o">;</span></div><div class='line' id='LC60'>		<span class="n">furthestNodeX</span> <span class="o">=</span> <span class="o">-</span><span class="mi">1</span><span class="o">;</span></div><div class='line' id='LC61'>		<span class="n">furthestNodeY</span> <span class="o">=</span> <span class="o">-</span><span class="mi">1</span><span class="o">;</span></div><div class='line' id='LC62'><br/></div><div class='line' id='LC63'>		<span class="n">gnList</span><span class="o">.</span><span class="na">clear</span><span class="o">();</span></div><div class='line' id='LC64'>		<span class="n">loopList</span><span class="o">.</span><span class="na">clear</span><span class="o">();</span></div><div class='line' id='LC65'><br/></div><div class='line' id='LC66'>	<span class="o">}</span></div><div class='line' id='LC67'><br/></div><div class='line' id='LC68'>	<span class="cm">/*..</span></div><div class='line' id='LC69'><span class="cm">	 * This function is important because as the tree grows</span></div><div class='line' id='LC70'><span class="cm">	 * larger in its x and y directions we update the size</span></div><div class='line' id='LC71'><span class="cm">	 * of the canvas to fit everything</span></div><div class='line' id='LC72'><span class="cm">	 */</span></div><div class='line' id='LC73'>	<span class="kd">public</span> <span class="kt">void</span> <span class="nf">updateCanvasSize</span><span class="o">(){</span></div><div class='line' id='LC74'><br/></div><div class='line' id='LC75'>		<span class="kt">int</span> <span class="n">x</span> <span class="o">=</span> <span class="mi">800</span><span class="o">;</span></div><div class='line' id='LC76'>		<span class="kt">int</span> <span class="n">y</span> <span class="o">=</span> <span class="mi">600</span><span class="o">;</span></div><div class='line' id='LC77'><br/></div><div class='line' id='LC78'>		<span class="kt">int</span> <span class="n">testX</span><span class="o">;</span></div><div class='line' id='LC79'>		<span class="k">if</span><span class="o">(</span><span class="n">furthestLoopX</span> <span class="o">&gt;=</span> <span class="n">furthestNodeX</span><span class="o">){</span></div><div class='line' id='LC80'>			<span class="n">testX</span> <span class="o">=</span> <span class="n">furthestLoopX</span><span class="o">;</span></div><div class='line' id='LC81'>		<span class="o">}</span><span class="k">else</span><span class="o">{</span></div><div class='line' id='LC82'>			<span class="n">testX</span> <span class="o">=</span> <span class="n">furthestNodeX</span><span class="o">;</span></div><div class='line' id='LC83'>		<span class="o">}</span></div><div class='line' id='LC84'><br/></div><div class='line' id='LC85'>		<span class="k">if</span><span class="o">(</span><span class="n">testX</span> <span class="o">+</span> <span class="mi">50</span> <span class="o">&gt;</span> <span class="n">x</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC86'>			<span class="n">x</span> <span class="o">=</span> <span class="n">testX</span> <span class="o">+</span> <span class="mi">50</span><span class="o">;</span></div><div class='line' id='LC87'>		<span class="o">}</span></div><div class='line' id='LC88'><br/></div><div class='line' id='LC89'>		<span class="k">if</span><span class="o">(</span><span class="n">furthestNodeY</span> <span class="o">+</span> <span class="mi">50</span> <span class="o">&gt;</span> <span class="n">y</span><span class="o">){</span></div><div class='line' id='LC90'>			<span class="n">y</span> <span class="o">=</span> <span class="n">furthestNodeY</span> <span class="o">+</span> <span class="mi">50</span><span class="o">;</span></div><div class='line' id='LC91'>		<span class="o">}</span></div><div class='line' id='LC92'><br/></div><div class='line' id='LC93'><br/></div><div class='line' id='LC94'>		<span class="n">c</span><span class="o">.</span><span class="na">setSize</span><span class="o">(</span> <span class="n">x</span> <span class="o">,</span> <span class="n">y</span><span class="o">);</span></div><div class='line' id='LC95'>		<span class="n">c</span><span class="o">.</span><span class="na">repaint</span><span class="o">();</span></div><div class='line' id='LC96'>		<span class="n">repaint</span><span class="o">();</span></div><div class='line' id='LC97'>	<span class="o">}</span></div><div class='line' id='LC98'><br/></div><div class='line' id='LC99'><br/></div><div class='line' id='LC100'>	<span class="cm">/*</span></div><div class='line' id='LC101'><span class="cm">	 * Builds sample list</span></div><div class='line' id='LC102'><span class="cm">	 */</span></div><div class='line' id='LC103'>	<span class="kd">public</span> <span class="kt">void</span> <span class="nf">BuildGnList</span><span class="o">(</span><span class="kt">int</span> <span class="n">nodeWidth</span><span class="o">,</span> <span class="kt">int</span> <span class="n">nodeHeight</span><span class="o">,</span> <span class="n">Node</span> <span class="n">head</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC104'><br/></div><div class='line' id='LC105'>		<span class="n">traverse</span><span class="o">(</span><span class="n">head</span><span class="o">,</span> <span class="mi">80</span><span class="o">,</span> <span class="mi">60</span><span class="o">,</span> <span class="mi">80</span><span class="o">,</span> <span class="mi">60</span><span class="o">);</span></div><div class='line' id='LC106'>	<span class="o">}</span></div><div class='line' id='LC107'><br/></div><div class='line' id='LC108'>	<span class="kd">public</span> <span class="kt">void</span> <span class="nf">init</span><span class="o">(){</span></div><div class='line' id='LC109'>		<span class="n">c</span><span class="o">.</span><span class="na">setSize</span><span class="o">(</span><span class="mi">800</span><span class="o">,</span> <span class="mi">600</span><span class="o">);</span></div><div class='line' id='LC110'>		<span class="n">GraphicString</span> <span class="n">gS</span> <span class="o">=</span> <span class="k">new</span> <span class="n">GraphicString</span><span class="o">();</span></div><div class='line' id='LC111'>		<span class="n">gS</span><span class="o">.</span><span class="na">string</span> <span class="o">=</span> <span class="s">&quot;Please Select: File -&gt; DebugProcess&quot;</span><span class="o">;</span></div><div class='line' id='LC112'>		<span class="n">gS</span><span class="o">.</span><span class="na">x</span> <span class="o">=</span> <span class="mi">325</span><span class="o">;</span></div><div class='line' id='LC113'>		<span class="n">gS</span><span class="o">.</span><span class="na">y</span> <span class="o">=</span> <span class="mi">295</span><span class="o">;</span></div><div class='line' id='LC114'>		<span class="n">gnList</span><span class="o">.</span><span class="na">add</span><span class="o">(</span><span class="n">gS</span><span class="o">);</span></div><div class='line' id='LC115'>	<span class="o">}</span></div><div class='line' id='LC116'><br/></div><div class='line' id='LC117'>	<span class="cm">/*</span></div><div class='line' id='LC118'><span class="cm">	 * Creates Graphics Nodes from node tree and sets proper x,y cords.</span></div><div class='line' id='LC119'><span class="cm">	 */</span></div><div class='line' id='LC120'>	<span class="kd">public</span> <span class="kt">void</span> <span class="nf">traverse</span><span class="o">(</span><span class="n">Node</span> <span class="n">node</span><span class="o">,</span> <span class="kt">int</span> <span class="n">x</span><span class="o">,</span> <span class="kt">int</span> <span class="n">y</span><span class="o">,</span> <span class="kt">int</span> <span class="n">nodeWidth</span><span class="o">,</span> <span class="kt">int</span> <span class="n">nodeHeight</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC121'><br/></div><div class='line' id='LC122'>		<span class="k">if</span> <span class="o">(</span><span class="n">node</span><span class="o">.</span><span class="na">nodeType</span> <span class="o">==</span> <span class="n">NODETYPE</span><span class="o">.</span><span class="na">FUNCTION</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC123'><br/></div><div class='line' id='LC124'>			<span class="n">GraphicFunction</span> <span class="n">gF</span> <span class="o">=</span> <span class="k">new</span> <span class="n">GraphicFunction</span><span class="o">();</span></div><div class='line' id='LC125'>			<span class="n">gF</span><span class="o">.</span><span class="na">x</span> <span class="o">=</span> <span class="n">x</span><span class="o">;</span></div><div class='line' id='LC126'>			<span class="n">gF</span><span class="o">.</span><span class="na">y</span> <span class="o">=</span> <span class="n">y</span><span class="o">;</span></div><div class='line' id='LC127'><br/></div><div class='line' id='LC128'>			<span class="k">if</span> <span class="o">(</span><span class="n">x</span> <span class="o">&gt;=</span> <span class="n">furthestNodeX</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC129'>				<span class="n">furthestNodeX</span> <span class="o">=</span> <span class="n">x</span><span class="o">;</span></div><div class='line' id='LC130'><br/></div><div class='line' id='LC131'>				<span class="kt">int</span> <span class="n">newX</span> <span class="o">=</span> <span class="n">furthestNodeX</span> <span class="o">+</span> <span class="o">(</span><span class="n">nodeWidth</span> <span class="o">/</span> <span class="mi">2</span><span class="o">)</span> <span class="o">+</span> <span class="mi">150</span><span class="o">;</span></div><div class='line' id='LC132'>				<span class="k">for</span> <span class="o">(</span><span class="n">GraphicLoop</span> <span class="n">loop</span> <span class="o">:</span> <span class="n">loopList</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC133'>					<span class="n">loop</span><span class="o">.</span><span class="na">update</span><span class="o">(</span><span class="n">newX</span><span class="o">);</span></div><div class='line' id='LC134'>					<span class="n">furthestLoopX</span> <span class="o">=</span> <span class="n">newX</span><span class="o">;</span></div><div class='line' id='LC135'>					<span class="n">newX</span> <span class="o">+=</span> <span class="mi">10</span><span class="o">;</span></div><div class='line' id='LC136'>				<span class="o">}</span></div><div class='line' id='LC137'><br/></div><div class='line' id='LC138'>			<span class="o">}</span></div><div class='line' id='LC139'><br/></div><div class='line' id='LC140'><br/></div><div class='line' id='LC141'>			<span class="k">if</span><span class="o">(</span><span class="n">node</span><span class="o">.</span><span class="na">setPurple</span><span class="o">){</span></div><div class='line' id='LC142'>				<span class="n">gF</span><span class="o">.</span><span class="na">c</span> <span class="o">=</span> <span class="n">Color</span><span class="o">.</span><span class="na">magenta</span><span class="o">;</span></div><div class='line' id='LC143'>			<span class="o">}</span></div><div class='line' id='LC144'><br/></div><div class='line' id='LC145'>			<span class="n">gF</span><span class="o">.</span><span class="na">name</span> <span class="o">=</span> <span class="n">node</span><span class="o">.</span><span class="na">type</span> <span class="o">+</span> <span class="s">&quot;  &quot;</span> <span class="o">+</span>  <span class="n">node</span><span class="o">.</span><span class="na">value</span><span class="o">;</span></div><div class='line' id='LC146'><br/></div><div class='line' id='LC147'><br/></div><div class='line' id='LC148'>			<span class="n">gnList</span><span class="o">.</span><span class="na">add</span><span class="o">(</span><span class="n">gF</span><span class="o">);</span></div><div class='line' id='LC149'><br/></div><div class='line' id='LC150'>			<span class="n">GraphicString</span> <span class="n">gS</span> <span class="o">=</span> <span class="k">new</span> <span class="n">GraphicString</span><span class="o">();</span></div><div class='line' id='LC151'>			<span class="n">gS</span><span class="o">.</span><span class="na">string</span> <span class="o">=</span> <span class="n">node</span><span class="o">.</span><span class="na">name</span><span class="o">;</span></div><div class='line' id='LC152'>			<span class="n">gS</span><span class="o">.</span><span class="na">x</span> <span class="o">=</span> <span class="n">gF</span><span class="o">.</span><span class="na">x</span> <span class="o">-</span> <span class="n">nodeWidth</span> <span class="o">-</span> <span class="mi">30</span><span class="o">;</span></div><div class='line' id='LC153'>			<span class="n">gS</span><span class="o">.</span><span class="na">y</span> <span class="o">=</span> <span class="n">gF</span><span class="o">.</span><span class="na">y</span> <span class="o">-</span> <span class="mi">5</span><span class="o">;</span></div><div class='line' id='LC154'>			<span class="n">gnList</span><span class="o">.</span><span class="na">add</span><span class="o">(</span><span class="n">gS</span><span class="o">);</span></div><div class='line' id='LC155'><br/></div><div class='line' id='LC156'><br/></div><div class='line' id='LC157'>		<span class="o">}</span> <span class="k">else</span> <span class="o">{</span></div><div class='line' id='LC158'><br/></div><div class='line' id='LC159'>			<span class="k">if</span> <span class="o">(</span><span class="n">x</span> <span class="o">&gt;=</span> <span class="n">furthestNodeX</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC160'>				<span class="n">furthestNodeX</span> <span class="o">=</span> <span class="n">x</span><span class="o">;</span></div><div class='line' id='LC161'><br/></div><div class='line' id='LC162'>				<span class="kt">int</span> <span class="n">newX</span> <span class="o">=</span> <span class="n">furthestNodeX</span> <span class="o">+</span> <span class="o">(</span><span class="n">nodeWidth</span> <span class="o">/</span> <span class="mi">2</span><span class="o">)</span> <span class="o">+</span> <span class="mi">150</span><span class="o">;</span></div><div class='line' id='LC163'>				<span class="k">for</span> <span class="o">(</span><span class="n">GraphicLoop</span> <span class="n">loop</span> <span class="o">:</span> <span class="n">loopList</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC164'>					<span class="n">loop</span><span class="o">.</span><span class="na">update</span><span class="o">(</span><span class="n">newX</span><span class="o">);</span></div><div class='line' id='LC165'>					<span class="n">furthestLoopX</span> <span class="o">=</span> <span class="n">newX</span><span class="o">;</span></div><div class='line' id='LC166'>					<span class="n">newX</span> <span class="o">+=</span> <span class="mi">10</span><span class="o">;</span></div><div class='line' id='LC167'>				<span class="o">}</span></div><div class='line' id='LC168'><br/></div><div class='line' id='LC169'>			<span class="o">}</span></div><div class='line' id='LC170'><br/></div><div class='line' id='LC171'><br/></div><div class='line' id='LC172'>			<span class="n">GraphicObject</span> <span class="n">gO</span> <span class="o">=</span> <span class="k">new</span> <span class="n">GraphicObject</span><span class="o">();</span></div><div class='line' id='LC173'>			<span class="n">gO</span><span class="o">.</span><span class="na">x</span> <span class="o">=</span> <span class="n">x</span><span class="o">;</span></div><div class='line' id='LC174'>			<span class="n">gO</span><span class="o">.</span><span class="na">y</span> <span class="o">=</span> <span class="n">y</span><span class="o">;</span></div><div class='line' id='LC175'>			<span class="n">gO</span><span class="o">.</span><span class="na">name</span> <span class="o">=</span> <span class="n">node</span><span class="o">.</span><span class="na">type</span> <span class="o">+</span> <span class="s">&quot;  &quot;</span> <span class="o">+</span> <span class="n">node</span><span class="o">.</span><span class="na">value</span><span class="o">;</span></div><div class='line' id='LC176'><br/></div><div class='line' id='LC177'>			<span class="n">gnList</span><span class="o">.</span><span class="na">add</span><span class="o">(</span><span class="n">gO</span><span class="o">);</span></div><div class='line' id='LC178'><br/></div><div class='line' id='LC179'>			<span class="n">GraphicString</span> <span class="n">gS</span> <span class="o">=</span> <span class="k">new</span> <span class="n">GraphicString</span><span class="o">();</span></div><div class='line' id='LC180'>			<span class="n">gS</span><span class="o">.</span><span class="na">string</span> <span class="o">=</span> <span class="n">node</span><span class="o">.</span><span class="na">name</span><span class="o">;</span></div><div class='line' id='LC181'>			<span class="n">gS</span><span class="o">.</span><span class="na">x</span> <span class="o">=</span> <span class="n">gO</span><span class="o">.</span><span class="na">x</span> <span class="o">-</span> <span class="n">nodeWidth</span> <span class="o">-</span> <span class="mi">30</span><span class="o">;</span></div><div class='line' id='LC182'>			<span class="n">gS</span><span class="o">.</span><span class="na">y</span> <span class="o">=</span> <span class="n">gO</span><span class="o">.</span><span class="na">y</span> <span class="o">-</span> <span class="mi">5</span><span class="o">;</span></div><div class='line' id='LC183'>			<span class="n">gnList</span><span class="o">.</span><span class="na">add</span><span class="o">(</span><span class="n">gS</span><span class="o">);</span></div><div class='line' id='LC184'><br/></div><div class='line' id='LC185'>		<span class="o">}</span></div><div class='line' id='LC186'><br/></div><div class='line' id='LC187'>		<span class="n">node</span><span class="o">.</span><span class="na">graphicX</span> <span class="o">=</span> <span class="n">x</span><span class="o">;</span></div><div class='line' id='LC188'>		<span class="n">node</span><span class="o">.</span><span class="na">graphicY</span> <span class="o">=</span> <span class="n">y</span><span class="o">;</span></div><div class='line' id='LC189'>		<span class="n">node</span><span class="o">.</span><span class="na">visited</span> <span class="o">=</span> <span class="kc">true</span><span class="o">;</span></div><div class='line' id='LC190'><br/></div><div class='line' id='LC191'>		<span class="kt">int</span> <span class="n">newy</span> <span class="o">=</span> <span class="mi">0</span><span class="o">;</span></div><div class='line' id='LC192'>		<span class="kt">int</span> <span class="n">newx</span> <span class="o">=</span> <span class="mi">0</span><span class="o">;</span></div><div class='line' id='LC193'><br/></div><div class='line' id='LC194'>		<span class="c1">// Line Down from Object</span></div><div class='line' id='LC195'>		<span class="n">GraphicLine</span> <span class="n">lineDown</span> <span class="o">=</span> <span class="k">new</span> <span class="n">GraphicLine</span><span class="o">();</span></div><div class='line' id='LC196'>		<span class="n">lineDown</span><span class="o">.</span><span class="na">x1</span> <span class="o">=</span> <span class="n">x</span><span class="o">;</span></div><div class='line' id='LC197'>		<span class="n">lineDown</span><span class="o">.</span><span class="na">y1</span> <span class="o">=</span> <span class="n">y</span> <span class="o">+</span> <span class="o">(</span><span class="n">nodeHeight</span> <span class="o">/</span> <span class="mi">2</span><span class="o">);</span></div><div class='line' id='LC198'>		<span class="n">lineDown</span><span class="o">.</span><span class="na">x2</span> <span class="o">=</span> <span class="n">x</span><span class="o">;</span></div><div class='line' id='LC199'>		<span class="n">lineDown</span><span class="o">.</span><span class="na">y2</span> <span class="o">=</span> <span class="n">lineDown</span><span class="o">.</span><span class="na">y1</span><span class="o">;</span></div><div class='line' id='LC200'><br/></div><div class='line' id='LC201'>		<span class="k">for</span> <span class="o">(</span><span class="n">Node</span> <span class="n">child</span> <span class="o">:</span> <span class="n">node</span><span class="o">.</span><span class="na">children</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC202'><br/></div><div class='line' id='LC203'>			<span class="k">if</span> <span class="o">(</span><span class="n">child</span><span class="o">.</span><span class="na">visited</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC204'><br/></div><div class='line' id='LC205'>				<span class="n">GraphicLoop</span> <span class="n">gLoop</span> <span class="o">=</span> <span class="k">new</span> <span class="n">GraphicLoop</span><span class="o">();</span></div><div class='line' id='LC206'>				<span class="n">gLoop</span><span class="o">.</span><span class="na">x1</span> <span class="o">=</span> <span class="n">x</span><span class="o">;</span></div><div class='line' id='LC207'>				<span class="n">gLoop</span><span class="o">.</span><span class="na">y1</span> <span class="o">=</span> <span class="n">y</span> <span class="o">+</span> <span class="o">(</span><span class="n">nodeHeight</span> <span class="o">/</span> <span class="mi">2</span><span class="o">);</span></div><div class='line' id='LC208'><br/></div><div class='line' id='LC209'>				<span class="k">if</span> <span class="o">(</span><span class="n">furthestLoopX</span> <span class="o">==</span> <span class="o">-</span><span class="mi">1</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC210'>					<span class="n">gLoop</span><span class="o">.</span><span class="na">x2</span> <span class="o">=</span> <span class="n">furthestNodeX</span> <span class="o">+</span> <span class="o">(</span><span class="n">nodeWidth</span> <span class="o">/</span> <span class="mi">2</span><span class="o">)</span> <span class="o">+</span> <span class="mi">150</span><span class="o">;</span></div><div class='line' id='LC211'>					<span class="n">furthestLoopX</span> <span class="o">=</span> <span class="n">gLoop</span><span class="o">.</span><span class="na">x2</span><span class="o">;</span></div><div class='line' id='LC212'>				<span class="o">}</span> <span class="k">else</span> <span class="o">{</span></div><div class='line' id='LC213'>					<span class="n">gLoop</span><span class="o">.</span><span class="na">x2</span> <span class="o">=</span> <span class="n">furthestLoopX</span> <span class="o">+</span> <span class="mi">10</span><span class="o">;</span></div><div class='line' id='LC214'>					<span class="n">furthestLoopX</span> <span class="o">=</span> <span class="n">gLoop</span><span class="o">.</span><span class="na">x2</span><span class="o">;</span></div><div class='line' id='LC215'>				<span class="o">}</span></div><div class='line' id='LC216'><br/></div><div class='line' id='LC217'>				<span class="n">gLoop</span><span class="o">.</span><span class="na">y2</span> <span class="o">=</span> <span class="n">gLoop</span><span class="o">.</span><span class="na">y1</span><span class="o">;</span></div><div class='line' id='LC218'><br/></div><div class='line' id='LC219'>				<span class="n">gLoop</span><span class="o">.</span><span class="na">x3</span> <span class="o">=</span> <span class="n">gLoop</span><span class="o">.</span><span class="na">x2</span><span class="o">;</span></div><div class='line' id='LC220'>				<span class="n">gLoop</span><span class="o">.</span><span class="na">y3</span> <span class="o">=</span> <span class="n">child</span><span class="o">.</span><span class="na">graphicY</span><span class="o">;</span></div><div class='line' id='LC221'><br/></div><div class='line' id='LC222'>				<span class="n">gLoop</span><span class="o">.</span><span class="na">x4</span> <span class="o">=</span> <span class="n">child</span><span class="o">.</span><span class="na">graphicX</span> <span class="o">+</span> <span class="o">(</span><span class="n">nodeWidth</span> <span class="o">/</span> <span class="mi">2</span><span class="o">);</span></div><div class='line' id='LC223'>				<span class="n">gLoop</span><span class="o">.</span><span class="na">y4</span> <span class="o">=</span> <span class="n">child</span><span class="o">.</span><span class="na">graphicY</span><span class="o">;</span></div><div class='line' id='LC224'><br/></div><div class='line' id='LC225'>				<span class="n">gnList</span><span class="o">.</span><span class="na">add</span><span class="o">(</span><span class="n">gLoop</span><span class="o">);</span></div><div class='line' id='LC226'>				<span class="n">loopList</span><span class="o">.</span><span class="na">add</span><span class="o">(</span><span class="n">gLoop</span><span class="o">);</span></div><div class='line' id='LC227'><br/></div><div class='line' id='LC228'>				<span class="n">GraphicString</span> <span class="n">gS</span> <span class="o">=</span> <span class="k">new</span> <span class="n">GraphicString</span><span class="o">();</span></div><div class='line' id='LC229'>				<span class="n">gS</span><span class="o">.</span><span class="na">x</span> <span class="o">=</span> <span class="n">gLoop</span><span class="o">.</span><span class="na">x1</span> <span class="o">+</span> <span class="mi">50</span><span class="o">;</span></div><div class='line' id='LC230'>				<span class="n">gS</span><span class="o">.</span><span class="na">y</span> <span class="o">=</span> <span class="n">gLoop</span><span class="o">.</span><span class="na">y1</span> <span class="o">-</span> <span class="mi">5</span><span class="o">;</span></div><div class='line' id='LC231'><br/></div><div class='line' id='LC232'>				<span class="n">gS</span><span class="o">.</span><span class="na">string</span> <span class="o">=</span> <span class="n">node</span><span class="o">.</span><span class="na">nameTwo</span><span class="o">;</span></div><div class='line' id='LC233'><br/></div><div class='line' id='LC234'>				<span class="n">gnList</span><span class="o">.</span><span class="na">add</span><span class="o">(</span><span class="n">gS</span><span class="o">);</span></div><div class='line' id='LC235'><br/></div><div class='line' id='LC236'>			<span class="o">}</span> <span class="k">else</span> <span class="o">{</span></div><div class='line' id='LC237'><br/></div><div class='line' id='LC238'>				<span class="n">globalLevel</span><span class="o">++;</span></div><div class='line' id='LC239'><br/></div><div class='line' id='LC240'>				<span class="n">newx</span> <span class="o">=</span> <span class="n">x</span> <span class="o">+</span> <span class="n">nodeWidth</span> <span class="o">+</span> <span class="mi">50</span><span class="o">;</span></div><div class='line' id='LC241'>				<span class="n">newy</span> <span class="o">=</span> <span class="o">(</span><span class="n">globalLevel</span> <span class="o">*</span> <span class="n">nodeHeight</span><span class="o">)</span> <span class="o">+</span> <span class="o">(</span><span class="n">globalLevel</span> <span class="o">*</span> <span class="mi">5</span><span class="o">);</span></div><div class='line' id='LC242'>				<span class="n">lineDown</span><span class="o">.</span><span class="na">y2</span> <span class="o">=</span> <span class="n">newy</span><span class="o">;</span></div><div class='line' id='LC243'><br/></div><div class='line' id='LC244'>				<span class="c1">// Line from main branch to new node</span></div><div class='line' id='LC245'>				<span class="n">GraphicLine</span> <span class="n">lineAcross</span> <span class="o">=</span> <span class="k">new</span> <span class="n">GraphicLine</span><span class="o">();</span></div><div class='line' id='LC246'>				<span class="n">lineAcross</span><span class="o">.</span><span class="na">x1</span> <span class="o">=</span> <span class="n">x</span><span class="o">;</span></div><div class='line' id='LC247'>				<span class="n">lineAcross</span><span class="o">.</span><span class="na">y1</span> <span class="o">=</span> <span class="n">newy</span><span class="o">;</span></div><div class='line' id='LC248'>				<span class="n">lineAcross</span><span class="o">.</span><span class="na">x2</span> <span class="o">=</span> <span class="n">newx</span> <span class="o">-</span> <span class="o">(</span><span class="n">nodeWidth</span> <span class="o">/</span> <span class="mi">2</span><span class="o">);</span></div><div class='line' id='LC249'>				<span class="n">lineAcross</span><span class="o">.</span><span class="na">y2</span> <span class="o">=</span> <span class="n">newy</span><span class="o">;</span></div><div class='line' id='LC250'>				<span class="n">gnList</span><span class="o">.</span><span class="na">add</span><span class="o">(</span><span class="n">lineAcross</span><span class="o">);</span></div><div class='line' id='LC251'><br/></div><div class='line' id='LC252'>				<span class="n">GraphicLine</span> <span class="n">ar1</span> <span class="o">=</span> <span class="k">new</span> <span class="n">GraphicLine</span><span class="o">();</span></div><div class='line' id='LC253'>				<span class="n">ar1</span><span class="o">.</span><span class="na">x1</span> <span class="o">=</span> <span class="n">lineAcross</span><span class="o">.</span><span class="na">x2</span><span class="o">;</span></div><div class='line' id='LC254'>				<span class="n">ar1</span><span class="o">.</span><span class="na">y1</span> <span class="o">=</span> <span class="n">lineAcross</span><span class="o">.</span><span class="na">y2</span><span class="o">;</span></div><div class='line' id='LC255'>				<span class="n">ar1</span><span class="o">.</span><span class="na">x2</span> <span class="o">=</span> <span class="n">ar1</span><span class="o">.</span><span class="na">x1</span> <span class="o">-</span> <span class="mi">8</span><span class="o">;</span></div><div class='line' id='LC256'>				<span class="n">ar1</span><span class="o">.</span><span class="na">y2</span> <span class="o">=</span> <span class="n">ar1</span><span class="o">.</span><span class="na">y1</span> <span class="o">-</span> <span class="mi">8</span><span class="o">;</span></div><div class='line' id='LC257'><br/></div><div class='line' id='LC258'>				<span class="n">GraphicLine</span> <span class="n">ar2</span> <span class="o">=</span> <span class="k">new</span> <span class="n">GraphicLine</span><span class="o">();</span></div><div class='line' id='LC259'>				<span class="n">ar2</span><span class="o">.</span><span class="na">x1</span> <span class="o">=</span> <span class="n">lineAcross</span><span class="o">.</span><span class="na">x2</span><span class="o">;</span></div><div class='line' id='LC260'>				<span class="n">ar2</span><span class="o">.</span><span class="na">y1</span> <span class="o">=</span> <span class="n">lineAcross</span><span class="o">.</span><span class="na">y2</span><span class="o">;</span></div><div class='line' id='LC261'>				<span class="n">ar2</span><span class="o">.</span><span class="na">x2</span> <span class="o">=</span> <span class="n">ar2</span><span class="o">.</span><span class="na">x1</span> <span class="o">-</span> <span class="mi">8</span><span class="o">;</span></div><div class='line' id='LC262'>				<span class="n">ar2</span><span class="o">.</span><span class="na">y2</span> <span class="o">=</span> <span class="n">ar2</span><span class="o">.</span><span class="na">y1</span> <span class="o">+</span> <span class="mi">8</span><span class="o">;</span></div><div class='line' id='LC263'><br/></div><div class='line' id='LC264'>				<span class="n">gnList</span><span class="o">.</span><span class="na">add</span><span class="o">(</span><span class="n">ar1</span><span class="o">);</span></div><div class='line' id='LC265'>				<span class="n">gnList</span><span class="o">.</span><span class="na">add</span><span class="o">(</span><span class="n">ar2</span><span class="o">);</span></div><div class='line' id='LC266'><br/></div><div class='line' id='LC267'>				<span class="k">if</span><span class="o">(</span> <span class="n">newy</span> <span class="o">&gt;=</span> <span class="n">furthestNodeY</span><span class="o">)</span> <span class="o">{</span> <span class="n">furthestNodeY</span> <span class="o">=</span> <span class="n">newy</span><span class="o">;</span> <span class="o">}</span></div><div class='line' id='LC268'>				<span class="n">traverse</span><span class="o">(</span><span class="n">child</span><span class="o">,</span> <span class="n">newx</span><span class="o">,</span> <span class="n">newy</span><span class="o">,</span> <span class="n">nodeWidth</span><span class="o">,</span> <span class="n">nodeHeight</span><span class="o">);</span></div><div class='line' id='LC269'><br/></div><div class='line' id='LC270'>			<span class="o">}</span></div><div class='line' id='LC271'><br/></div><div class='line' id='LC272'>		<span class="o">}</span></div><div class='line' id='LC273'><br/></div><div class='line' id='LC274'>		<span class="n">gnList</span><span class="o">.</span><span class="na">add</span><span class="o">(</span><span class="n">lineDown</span><span class="o">);</span></div><div class='line' id='LC275'>		<span class="n">updateCanvasSize</span><span class="o">();</span></div><div class='line' id='LC276'><br/></div><div class='line' id='LC277'>	<span class="o">}</span></div><div class='line' id='LC278'><br/></div><div class='line' id='LC279'>	<span class="kd">public</span> <span class="kt">void</span> <span class="nf">loopFill</span><span class="o">(){</span></div><div class='line' id='LC280'>		<span class="n">System</span><span class="o">.</span><span class="na">out</span><span class="o">.</span><span class="na">println</span><span class="o">(</span><span class="s">&quot;FURTHEEST NODE IS... &quot;</span> <span class="o">+</span> <span class="n">furthestNodeX</span><span class="o">);</span></div><div class='line' id='LC281'>	<span class="o">}</span></div><div class='line' id='LC282'><br/></div><div class='line' id='LC283'>	<span class="cm">/*..</span></div><div class='line' id='LC284'><span class="cm">	 * This class extends canvas and is where the drawing all takes place.</span></div><div class='line' id='LC285'><span class="cm">	 * The code in main changed to drawArea.c.repaint();</span></div><div class='line' id='LC286'><span class="cm">	 */</span></div><div class='line' id='LC287'>	<span class="kd">class</span> <span class="nc">OurCanvas</span> <span class="kd">extends</span> <span class="n">Canvas</span> <span class="o">{</span></div><div class='line' id='LC288'><br/></div><div class='line' id='LC289'>	<span class="n">OurCanvas</span><span class="o">(){</span> <span class="kd">super</span><span class="o">();</span> <span class="o">}</span></div><div class='line' id='LC290'><br/></div><div class='line' id='LC291'>	<span class="c1">// Prevents flicker</span></div><div class='line' id='LC292'>	<span class="nd">@Override</span></div><div class='line' id='LC293'>	<span class="kd">public</span> <span class="kt">void</span> <span class="nf">update</span><span class="o">(</span><span class="n">Graphics</span> <span class="n">g</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC294'><br/></div><div class='line' id='LC295'><br/></div><div class='line' id='LC296'>		<span class="n">Image</span> <span class="n">on</span> <span class="o">=</span> <span class="n">createImage</span><span class="o">(</span><span class="n">getWidth</span><span class="o">(),</span> <span class="n">getHeight</span><span class="o">());</span></div><div class='line' id='LC297'>		<span class="n">print</span><span class="o">(</span><span class="n">on</span><span class="o">.</span><span class="na">getGraphics</span><span class="o">());</span></div><div class='line' id='LC298'>		<span class="n">g</span><span class="o">.</span><span class="na">drawImage</span><span class="o">(</span><span class="n">on</span><span class="o">,</span> <span class="mi">0</span><span class="o">,</span> <span class="mi">0</span><span class="o">,</span> <span class="k">this</span><span class="o">);</span></div><div class='line' id='LC299'><br/></div><div class='line' id='LC300'>	<span class="o">}</span></div><div class='line' id='LC301'><br/></div><div class='line' id='LC302'>	<span class="c1">// paints all of our data</span></div><div class='line' id='LC303'>	<span class="nd">@Override</span></div><div class='line' id='LC304'>	<span class="kd">public</span> <span class="kt">void</span> <span class="nf">paint</span><span class="o">(</span><span class="n">Graphics</span> <span class="n">g</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC305'><br/></div><div class='line' id='LC306'>		<span class="k">for</span> <span class="o">(</span><span class="n">GraphicNode</span> <span class="n">gN</span> <span class="o">:</span> <span class="n">gnList</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC307'>			<span class="n">gN</span><span class="o">.</span><span class="na">draw</span><span class="o">(</span><span class="n">g</span><span class="o">);</span></div><div class='line' id='LC308'>		<span class="o">}</span></div><div class='line' id='LC309'><br/></div><div class='line' id='LC310'>	<span class="o">}</span></div><div class='line' id='LC311'><br/></div><div class='line' id='LC312'><span class="o">}</span></div><div class='line' id='LC313'><br/></div><div class='line' id='LC314'><span class="kd">class</span> <span class="nc">MyAdjustmentListener</span> <span class="kd">implements</span> <span class="n">AdjustmentListener</span><span class="o">{</span></div><div class='line' id='LC315'><br/></div><div class='line' id='LC316'>		<span class="c1">//Everytime a scrollbar is moved repaint the canvas.</span></div><div class='line' id='LC317'><br/></div><div class='line' id='LC318'>		<span class="kd">public</span> <span class="kt">void</span> <span class="nf">adjustmentValueChanged</span><span class="o">(</span><span class="n">AdjustmentEvent</span> <span class="n">move</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC319'><br/></div><div class='line' id='LC320'>			<span class="k">if</span><span class="o">(</span><span class="n">move</span><span class="o">.</span><span class="na">getValueIsAdjusting</span><span class="o">()){</span></div><div class='line' id='LC321'>				<span class="n">c</span><span class="o">.</span><span class="na">repaint</span><span class="o">();</span></div><div class='line' id='LC322'>				<span class="n">repaint</span><span class="o">();</span></div><div class='line' id='LC323'>				<span class="n">updateCanvasSize</span><span class="o">();</span></div><div class='line' id='LC324'>			<span class="o">}</span></div><div class='line' id='LC325'><br/></div><div class='line' id='LC326'>		<span class="o">}</span></div><div class='line' id='LC327'><br/></div><div class='line' id='LC328'><br/></div><div class='line' id='LC329'><span class="o">}</span></div><div class='line' id='LC330'><br/></div><div class='line' id='LC331'><span class="o">}</span></div><div class='line' id='LC332'><br/></div></pre></div>
              
            
          </td>
        </tr>
      </table>
    
  </div>


          </div>
        </div>
      </div>
    </div>
  

  </div>


<div class="frame frame-loading" style="display:none;">
  <img src="/images/modules/ajax/big_spinner_336699.gif">
</div>

    </div>
  
      
    </div>

    <div id="footer" class="clearfix">
      <div class="site">
        <div class="sponsor">
          <a href="http://www.rackspace.com" class="logo">
            <img alt="Dedicated Server" src="https://assets3.github.com/images/modules/footer/rackspace_logo.png?v2?b16a6af5ca98de88176f6046833c0f51d3ebc022" />
          </a>
          Powered by the <a href="http://www.rackspace.com ">Dedicated
          Servers</a> and<br/> <a href="http://www.rackspacecloud.com">Cloud
          Computing</a> of Rackspace Hosting<span>&reg;</span>
        </div>

        <ul class="links">
          <li class="blog"><a href="https://github.com/blog">Blog</a></li>
          <li><a href="/login/multipass?to=http%3A%2F%2Fsupport.github.com">Support</a></li>
          <li><a href="https://github.com/training">Training</a></li>
          <li><a href="http://jobs.github.com">Job Board</a></li>
          <li><a href="http://shop.github.com">Shop</a></li>
          <li><a href="https://github.com/contact">Contact</a></li>
          <li><a href="http://develop.github.com">API</a></li>
          <li><a href="http://status.github.com">Status</a></li>
        </ul>
        <ul class="sosueme">
          <li class="main">&copy; 2011 <span id="_rrt" title="0.10188s from fe3.rs.github.com">GitHub</span> Inc. All rights reserved.</li>
          <li><a href="/site/terms">Terms of Service</a></li>
          <li><a href="/site/privacy">Privacy</a></li>
          <li><a href="https://github.com/security">Security</a></li>
        </ul>
      </div>
    </div><!-- /#footer -->

    
      
      
        <!-- current locale:  -->
        <div class="locales">
          <div class="site">

            <ul class="choices clearfix limited-locales">
              <li><span class="current">English</span></li>
              
                  <li><a rel="nofollow" href="?locale=de">Deutsch</a></li>
              
                  <li><a rel="nofollow" href="?locale=fr">Français</a></li>
              
                  <li><a rel="nofollow" href="?locale=ja">日本語</a></li>
              
                  <li><a rel="nofollow" href="?locale=pt-BR">Português (BR)</a></li>
              
                  <li><a rel="nofollow" href="?locale=ru">Русский</a></li>
              
                  <li><a rel="nofollow" href="?locale=zh">中文</a></li>
              
              <li class="all"><a href="#" class="minibutton btn-forward js-all-locales"><span><span class="icon"></span>See all available languages</span></a></li>
            </ul>

            <div class="all-locales clearfix">
              <h3>Your current locale selection: <strong>English</strong>. Choose another?</h3>
              
              
                <ul class="choices">
                  
                      <li><a rel="nofollow" href="?locale=en">English</a></li>
                  
                      <li><a rel="nofollow" href="?locale=af">Afrikaans</a></li>
                  
                      <li><a rel="nofollow" href="?locale=ca">Català</a></li>
                  
                      <li><a rel="nofollow" href="?locale=cs">Čeština</a></li>
                  
                      <li><a rel="nofollow" href="?locale=de">Deutsch</a></li>
                  
                </ul>
              
                <ul class="choices">
                  
                      <li><a rel="nofollow" href="?locale=es">Español</a></li>
                  
                      <li><a rel="nofollow" href="?locale=fr">Français</a></li>
                  
                      <li><a rel="nofollow" href="?locale=hr">Hrvatski</a></li>
                  
                      <li><a rel="nofollow" href="?locale=hu">Magyar</a></li>
                  
                      <li><a rel="nofollow" href="?locale=id">Indonesia</a></li>
                  
                </ul>
              
                <ul class="choices">
                  
                      <li><a rel="nofollow" href="?locale=it">Italiano</a></li>
                  
                      <li><a rel="nofollow" href="?locale=ja">日本語</a></li>
                  
                      <li><a rel="nofollow" href="?locale=nl">Nederlands</a></li>
                  
                      <li><a rel="nofollow" href="?locale=no">Norsk</a></li>
                  
                      <li><a rel="nofollow" href="?locale=pl">Polski</a></li>
                  
                </ul>
              
                <ul class="choices">
                  
                      <li><a rel="nofollow" href="?locale=pt-BR">Português (BR)</a></li>
                  
                      <li><a rel="nofollow" href="?locale=ru">Русский</a></li>
                  
                      <li><a rel="nofollow" href="?locale=sr">Српски</a></li>
                  
                      <li><a rel="nofollow" href="?locale=sv">Svenska</a></li>
                  
                      <li><a rel="nofollow" href="?locale=zh">中文</a></li>
                  
                </ul>
              
            </div>

          </div>
          <div class="fade"></div>
        </div>
      
    

    <script>window._auth_token = "3c8357c6c9b87feb231c40e03535c7b6c87afe0b"</script>
    

<div id="keyboard_shortcuts_pane" style="display:none">
  <h2>Keyboard Shortcuts <small><a href="#" class="js-see-all-keyboard-shortcuts">(see all)</a></small></h2>

  <div class="columns threecols">
    <div class="column first">
      <h3>Site wide shortcuts</h3>
      <dl class="keyboard-mappings">
        <dt>s</dt>
        <dd>Focus site search</dd>
      </dl>
      <dl class="keyboard-mappings">
        <dt>?</dt>
        <dd>Bring up this help dialog</dd>
      </dl>
    </div><!-- /.column.first -->

    <div class="column middle" style='display:none'>
      <h3>Commit list</h3>
      <dl class="keyboard-mappings">
        <dt>j</dt>
        <dd>Move selected down</dd>
      </dl>
      <dl class="keyboard-mappings">
        <dt>k</dt>
        <dd>Move selected up</dd>
      </dl>
      <dl class="keyboard-mappings">
        <dt>t</dt>
        <dd>Open tree</dd>
      </dl>
      <dl class="keyboard-mappings">
        <dt>p</dt>
        <dd>Open parent</dd>
      </dl>
      <dl class="keyboard-mappings">
        <dt>c <em>or</em> o <em>or</em> enter</dt>
        <dd>Open commit</dd>
      </dl>
    </div><!-- /.column.first -->

    <div class="column last" style='display:none'>
      <h3>Pull request list</h3>
      <dl class="keyboard-mappings">
        <dt>j</dt>
        <dd>Move selected down</dd>
      </dl>
      <dl class="keyboard-mappings">
        <dt>k</dt>
        <dd>Move selected up</dd>
      </dl>
      <dl class="keyboard-mappings">
        <dt>o <em>or</em> enter</dt>
        <dd>Open issue</dd>
      </dl>
    </div><!-- /.columns.last -->

  </div><!-- /.columns.equacols -->

  <div style='display:none'>
    <div class="rule"></div>

    <h3>Issues</h3>

    <div class="columns threecols">
      <div class="column first">
        <dl class="keyboard-mappings">
          <dt>j</dt>
          <dd>Move selected down</dd>
        </dl>
        <dl class="keyboard-mappings">
          <dt>k</dt>
          <dd>Move selected up</dd>
        </dl>
        <dl class="keyboard-mappings">
          <dt>x</dt>
          <dd>Toggle select target</dd>
        </dl>
        <dl class="keyboard-mappings">
          <dt>o <em>or</em> enter</dt>
          <dd>Open issue</dd>
        </dl>
      </div><!-- /.column.first -->
      <div class="column middle">
        <dl class="keyboard-mappings">
          <dt>I</dt>
          <dd>Mark selected as read</dd>
        </dl>
        <dl class="keyboard-mappings">
          <dt>U</dt>
          <dd>Mark selected as unread</dd>
        </dl>
        <dl class="keyboard-mappings">
          <dt>e</dt>
          <dd>Close selected</dd>
        </dl>
        <dl class="keyboard-mappings">
          <dt>y</dt>
          <dd>Remove selected from view</dd>
        </dl>
      </div><!-- /.column.middle -->
      <div class="column last">
        <dl class="keyboard-mappings">
          <dt>c</dt>
          <dd>Create issue</dd>
        </dl>
        <dl class="keyboard-mappings">
          <dt>l</dt>
          <dd>Create label</dd>
        </dl>
        <dl class="keyboard-mappings">
          <dt>i</dt>
          <dd>Back to inbox</dd>
        </dl>
        <dl class="keyboard-mappings">
          <dt>u</dt>
          <dd>Back to issues</dd>
        </dl>
        <dl class="keyboard-mappings">
          <dt>/</dt>
          <dd>Focus issues search</dd>
        </dl>
      </div>
    </div>
  </div>

  <div style='display:none'>
    <div class="rule"></div>

    <h3>Network Graph</h3>
    <div class="columns equacols">
      <div class="column first">
        <dl class="keyboard-mappings">
          <dt><span class="badmono">←</span> <em>or</em> h</dt>
          <dd>Scroll left</dd>
        </dl>
        <dl class="keyboard-mappings">
          <dt><span class="badmono">→</span> <em>or</em> l</dt>
          <dd>Scroll right</dd>
        </dl>
        <dl class="keyboard-mappings">
          <dt><span class="badmono">↑</span> <em>or</em> k</dt>
          <dd>Scroll up</dd>
        </dl>
        <dl class="keyboard-mappings">
          <dt><span class="badmono">↓</span> <em>or</em> j</dt>
          <dd>Scroll down</dd>
        </dl>
        <dl class="keyboard-mappings">
          <dt>t</dt>
          <dd>Toggle visibility of head labels</dd>
        </dl>
      </div><!-- /.column.first -->
      <div class="column last">
        <dl class="keyboard-mappings">
          <dt>shift <span class="badmono">←</span> <em>or</em> shift h</dt>
          <dd>Scroll all the way left</dd>
        </dl>
        <dl class="keyboard-mappings">
          <dt>shift <span class="badmono">→</span> <em>or</em> shift l</dt>
          <dd>Scroll all the way right</dd>
        </dl>
        <dl class="keyboard-mappings">
          <dt>shift <span class="badmono">↑</span> <em>or</em> shift k</dt>
          <dd>Scroll all the way up</dd>
        </dl>
        <dl class="keyboard-mappings">
          <dt>shift <span class="badmono">↓</span> <em>or</em> shift j</dt>
          <dd>Scroll all the way down</dd>
        </dl>
      </div><!-- /.column.last -->
    </div>
  </div>

  <div >
    <div class="rule"></div>

    <h3>Source Code Browsing</h3>
    <div class="columns threecols">
      <div class="column first">
        <dl class="keyboard-mappings">
          <dt>t</dt>
          <dd>Activates the file finder</dd>
        </dl>
        <dl class="keyboard-mappings">
          <dt>l</dt>
          <dd>Jump to line</dd>
        </dl>
      </div>
    </div>
  </div>

</div>
    

    <!--[if IE 8]>
    <script type="text/javascript" charset="utf-8">
      $(document.body).addClass("ie8")
    </script>
    <![endif]-->

    <!--[if IE 7]>
    <script type="text/javascript" charset="utf-8">
      $(document.body).addClass("ie7")
    </script>
    <![endif]-->

    
    <script type='text/javascript'></script>
    
  </body>
</html>

