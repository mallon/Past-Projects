<map version="freeplane 1.2.0">
<!--To view this file, download free mind mapping software Freeplane from http://freeplane.sourceforge.net -->
<node TEXT="Website" LOCALIZED_STYLE_REF="AutomaticLayout.level.root" ID="ID_1723255651" CREATED="1283093380553" MODIFIED="1395223107179"><hook NAME="MapStyle">
    <properties show_icon_for_attributes="true" show_note_icons="true"/>

<map_styles>
<stylenode LOCALIZED_TEXT="styles.root_node">
<stylenode LOCALIZED_TEXT="styles.predefined" POSITION="right">
<stylenode LOCALIZED_TEXT="default" MAX_WIDTH="600" COLOR="#000000" STYLE="as_parent">
<font NAME="SansSerif" SIZE="10" BOLD="false" ITALIC="false"/>
</stylenode>
<stylenode LOCALIZED_TEXT="defaultstyle.details"/>
<stylenode LOCALIZED_TEXT="defaultstyle.note"/>
<stylenode LOCALIZED_TEXT="defaultstyle.floating">
<edge STYLE="hide_edge"/>
<cloud COLOR="#f0f0f0" SHAPE="ROUND_RECT"/>
</stylenode>
</stylenode>
<stylenode LOCALIZED_TEXT="styles.user-defined" POSITION="right">
<stylenode LOCALIZED_TEXT="styles.topic" COLOR="#18898b" STYLE="fork">
<font NAME="Liberation Sans" SIZE="10" BOLD="true"/>
</stylenode>
<stylenode LOCALIZED_TEXT="styles.subtopic" COLOR="#cc3300" STYLE="fork">
<font NAME="Liberation Sans" SIZE="10" BOLD="true"/>
</stylenode>
<stylenode LOCALIZED_TEXT="styles.subsubtopic" COLOR="#669900">
<font NAME="Liberation Sans" SIZE="10" BOLD="true"/>
</stylenode>
<stylenode LOCALIZED_TEXT="styles.important">
<icon BUILTIN="yes"/>
</stylenode>
</stylenode>
<stylenode LOCALIZED_TEXT="styles.AutomaticLayout" POSITION="right">
<stylenode LOCALIZED_TEXT="AutomaticLayout.level.root" COLOR="#000000">
<font SIZE="18"/>
</stylenode>
<stylenode LOCALIZED_TEXT="AutomaticLayout.level,1" COLOR="#0033ff">
<font SIZE="16"/>
</stylenode>
<stylenode LOCALIZED_TEXT="AutomaticLayout.level,2" COLOR="#00b439">
<font SIZE="14"/>
</stylenode>
<stylenode LOCALIZED_TEXT="AutomaticLayout.level,3" COLOR="#990000">
<font SIZE="12"/>
</stylenode>
<stylenode LOCALIZED_TEXT="AutomaticLayout.level,4" COLOR="#111111">
<font SIZE="10"/>
</stylenode>
</stylenode>
</stylenode>
</map_styles>
</hook>
<attribute_layout NAME_WIDTH="86" VALUE_WIDTH="86"/>
<attribute NAME="title" VALUE=""/>
<attribute NAME="tagLine" VALUE=""/>
<attribute NAME="address" VALUE=""/>
<attribute NAME="adminPassword" VALUE=""/>
<attribute NAME="adminLogin" VALUE=""/>
<node TEXT="User" POSITION="right" ID="ID_638219365" CREATED="1382981424559" MODIFIED="1395223078247">
<edge COLOR="#7c0000"/>
<attribute_layout NAME_WIDTH="65" VALUE_WIDTH="65"/>
<attribute NAME="userName" VALUE=""/>
<attribute NAME="firstName" VALUE=""/>
<attribute NAME="lastName" VALUE=""/>
<attribute NAME="nickName" VALUE=""/>
<attribute NAME="publicName" VALUE=""/>
<attribute NAME="email" VALUE=""/>
<attribute NAME="website" VALUE=""/>
<attribute NAME="biography" VALUE=""/>
<attribute NAME="password" VALUE=""/>
<node TEXT="Role" ID="ID_1537427466" CREATED="1383057386512" MODIFIED="1395137074285">
<icon BUILTIN="yes"/>
<icon BUILTIN="multiplication"/>
<attribute_layout NAME_WIDTH="73" VALUE_WIDTH="73"/>
<node TEXT="Editor" ID="ID_1972832259" CREATED="1383065476976" MODIFIED="1386162191218"><richcontent TYPE="NOTE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      Restriction :
    </p>
    <p>
      - Users with a 'editor' role can only read and write all pages, media, comments, posts, categories and tags.
    </p>
  </body>
</html>
</richcontent>
</node>
<node TEXT="Author" ID="ID_1318867602" CREATED="1383065485412" MODIFIED="1386162191215"><richcontent TYPE="NOTE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      Restriction :
    </p>
    <p>
      - Users with a 'author' role can read and write their own posts, medias and comments, but only read the other posts, medias and comments.
    </p>
  </body>
</html>
</richcontent>
</node>
<node TEXT="Contributor" ID="ID_1939870758" CREATED="1383065491465" MODIFIED="1388504697823"><richcontent TYPE="NOTE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      Restriction :
    </p>
    <p>
      - Users with a 'contributor' role can read and write their own posts and comments, but only read the other posts and comments.
    </p>
  </body>
</html>
</richcontent>
</node>
<node TEXT="Administrator" ID="ID_1977355329" CREATED="1383065499227" MODIFIED="1386162191217"><richcontent TYPE="NOTE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      Restriction :
    </p>
    <p>
      - Users with a 'administrator' role can read and write all things.
    </p>
  </body>
</html>
</richcontent>
</node>
</node>
</node>
<node TEXT="Page" POSITION="right" ID="ID_1822327479" CREATED="1382979972148" MODIFIED="1395223167760">
<edge COLOR="#ff00ff"/>
<attribute_layout NAME_WIDTH="87" VALUE_WIDTH="87"/>
<node TEXT="PageParent" ID="ID_1740726273" CREATED="1382979972148" MODIFIED="1395222066600">
<icon BUILTIN="forward"/>
<edge COLOR="#ff00ff"/>
<attribute_layout NAME_WIDTH="87" VALUE_WIDTH="87"/>
</node>
<node TEXT="Visibility" ID="ID_1382334938" CREATED="1383038321220" MODIFIED="1395222171236">
<icon BUILTIN="multiplication"/>
<node TEXT="publish" ID="ID_1489844347" CREATED="1383066274819" MODIFIED="1395222476264"/>
<node TEXT="private" ID="ID_160657732" CREATED="1383066289051" MODIFIED="1395222478997"/>
</node>
</node>
<node TEXT="Appearance" POSITION="left" ID="ID_1190070596" CREATED="1382979894113" MODIFIED="1386162152169">
<edge COLOR="#7c7c00"/>
<node TEXT="Menus" ID="ID_1953581499" CREATED="1383038305854" MODIFIED="1390470392660">
<attribute_layout NAME_WIDTH="33" VALUE_WIDTH="33"/>
<node TEXT="Categories" ID="ID_1094786130" CREATED="1383042837652" MODIFIED="1395220923454">
<icon BUILTIN="forward"/>
<attribute_layout NAME_WIDTH="62" VALUE_WIDTH="62"/>
</node>
<node TEXT="Links" ID="ID_655579692" CREATED="1383045263414" MODIFIED="1390470348757">
<attribute_layout NAME_WIDTH="33" VALUE_WIDTH="33"/>
</node>
<node TEXT="AccessedPages" ID="ID_1599903205" CREATED="1383045263414" MODIFIED="1395220931258">
<icon BUILTIN="forward"/>
<attribute_layout NAME_WIDTH="33" VALUE_WIDTH="33"/>
</node>
</node>
<node TEXT="Header" ID="ID_1036811186" CREATED="1383038312945" MODIFIED="1390469897475">
<attribute_layout NAME_WIDTH="53" VALUE_WIDTH="53"/>
</node>
<node TEXT="Theme" ID="ID_1280257357" CREATED="1383038321220" MODIFIED="1395137084607">
<icon BUILTIN="multiplication"/>
<node TEXT="responsive" ID="ID_181577211" CREATED="1383038312945" MODIFIED="1395222643558">
<attribute_layout NAME_WIDTH="53" VALUE_WIDTH="53"/>
</node>
<node TEXT="magazine" ID="ID_558587944" CREATED="1383038312945" MODIFIED="1395222650063">
<attribute_layout NAME_WIDTH="53" VALUE_WIDTH="53"/>
</node>
<node TEXT="business" ID="ID_1544796548" CREATED="1383038312945" MODIFIED="1395222659700">
<attribute_layout NAME_WIDTH="53" VALUE_WIDTH="53"/>
</node>
<node TEXT="galleries" ID="ID_598154152" CREATED="1383038312945" MODIFIED="1395222665606">
<attribute_layout NAME_WIDTH="53" VALUE_WIDTH="53"/>
</node>
<node TEXT="artisitic" ID="ID_525336471" CREATED="1383038312945" MODIFIED="1395222671683">
<attribute_layout NAME_WIDTH="53" VALUE_WIDTH="53"/>
</node>
<node TEXT="seo" ID="ID_1235520533" CREATED="1383038312945" MODIFIED="1395222676143">
<attribute_layout NAME_WIDTH="53" VALUE_WIDTH="53"/>
</node>
</node>
<node TEXT="Widget" ID="ID_1268934995" CREATED="1383572253880" MODIFIED="1386161803395">
<attribute_layout NAME_WIDTH="69" VALUE_WIDTH="69"/>
<node TEXT="Archives" ID="ID_491648381" CREATED="1383572294076" MODIFIED="1386161163806">
<attribute_layout NAME_WIDTH="133" VALUE_WIDTH="133"/>
<attribute NAME="title" VALUE=""/>
<node TEXT="isDisplayingAsDropDown" ID="ID_1333060473" CREATED="1383572295996" MODIFIED="1386161058284">
<node TEXT="Value" ID="ID_1593768799" CREATED="1383057386512" MODIFIED="1386161111422">
<icon BUILTIN="multiplication"/>
<attribute_layout NAME_WIDTH="73" VALUE_WIDTH="73"/>
<node TEXT="yes" ID="ID_452860959" CREATED="1383057386512" MODIFIED="1386161149721">
<attribute_layout NAME_WIDTH="73" VALUE_WIDTH="73"/>
</node>
<node TEXT="no" ID="ID_121334422" CREATED="1383057386512" MODIFIED="1386161149718">
<attribute_layout NAME_WIDTH="73" VALUE_WIDTH="73"/>
</node>
</node>
</node>
<node TEXT="isShowingPostsCount" ID="ID_1043735637" CREATED="1383572295996" MODIFIED="1386161059972">
<node TEXT="Value" ID="ID_586631429" CREATED="1383057386512" MODIFIED="1386161111422">
<icon BUILTIN="multiplication"/>
<attribute_layout NAME_WIDTH="73" VALUE_WIDTH="73"/>
<node TEXT="yes" ID="ID_1003956331" CREATED="1383057386512" MODIFIED="1386161149721">
<attribute_layout NAME_WIDTH="73" VALUE_WIDTH="73"/>
</node>
<node TEXT="no" ID="ID_1684424849" CREATED="1383057386512" MODIFIED="1386161149718">
<attribute_layout NAME_WIDTH="73" VALUE_WIDTH="73"/>
</node>
</node>
</node>
</node>
<node TEXT="Calendars" ID="ID_1092008377" CREATED="1383572295996" MODIFIED="1383572692565">
<attribute NAME="title" VALUE=""/>
</node>
<node TEXT="WidgetCategory" ID="ID_790451251" CREATED="1383572298221" MODIFIED="1386950955642">
<attribute_layout NAME_WIDTH="137" VALUE_WIDTH="137"/>
<attribute NAME="title" VALUE=""/>
<attribute NAME="numberOfDisplayedPosts" VALUE=""/>
<node TEXT="isDisplayingSubCat" ID="ID_643525442" CREATED="1383573046279" MODIFIED="1386951002951">
<node TEXT="Value" ID="ID_1139317208" CREATED="1383057386512" MODIFIED="1386161111422">
<icon BUILTIN="multiplication"/>
<attribute_layout NAME_WIDTH="73" VALUE_WIDTH="73"/>
<node TEXT="yes" ID="ID_1288261837" CREATED="1383057386512" MODIFIED="1386161149721">
<attribute_layout NAME_WIDTH="73" VALUE_WIDTH="73"/>
</node>
<node TEXT="no" ID="ID_315071743" CREATED="1383057386512" MODIFIED="1386161149718">
<attribute_layout NAME_WIDTH="73" VALUE_WIDTH="73"/>
</node>
</node>
</node>
<node TEXT="isDropDownList" ID="ID_1225950428" CREATED="1383573046279" MODIFIED="1386951017939">
<node TEXT="Value" ID="ID_1492417597" CREATED="1383057386512" MODIFIED="1386161111422">
<icon BUILTIN="multiplication"/>
<attribute_layout NAME_WIDTH="73" VALUE_WIDTH="73"/>
<node TEXT="yes" ID="ID_563583777" CREATED="1383057386512" MODIFIED="1386161149721">
<attribute_layout NAME_WIDTH="73" VALUE_WIDTH="73"/>
</node>
<node TEXT="no" ID="ID_1465372399" CREATED="1383057386512" MODIFIED="1386161149718">
<attribute_layout NAME_WIDTH="73" VALUE_WIDTH="73"/>
</node>
</node>
</node>
</node>
<node TEXT="WidgetMenu" ID="ID_1866993432" CREATED="1383572300476" MODIFIED="1383572711918">
<attribute NAME="title" VALUE=""/>
<node TEXT="Menu" ID="ID_1560612645" CREATED="1383572713513" MODIFIED="1386156818731">
<icon BUILTIN="forward"/>
<attribute NAME="name" VALUE=""/>
</node>
</node>
<node TEXT="Meta" ID="ID_597849898" CREATED="1383572302063" MODIFIED="1383572820764">
<attribute NAME="title" VALUE=""/>
</node>
<node TEXT="WidgetPage" ID="ID_554428373" CREATED="1383572303756" MODIFIED="1383572860524">
<attribute NAME="title" VALUE=""/>
<node TEXT="PageExcluded" ID="ID_1444013954" CREATED="1383572983176" MODIFIED="1386156859162">
<icon BUILTIN="forward"/>
<attribute NAME="title" VALUE=""/>
</node>
<node TEXT="PageSorter" ID="ID_720842222" CREATED="1383573046279" MODIFIED="1383573061354">
<icon BUILTIN="multiplication"/>
<node TEXT="page_title" ID="ID_306069504" CREATED="1383573074791" MODIFIED="1386161516458"/>
<node TEXT="page_order" ID="ID_116900112" CREATED="1383573075863" MODIFIED="1386161520627"/>
<node TEXT="page_id" ID="ID_1834205106" CREATED="1383573077094" MODIFIED="1386161525267"/>
</node>
</node>
<node TEXT="WidgetComment" ID="ID_1276529952" CREATED="1383572304896" MODIFIED="1386162045431">
<attribute_layout NAME_WIDTH="166" VALUE_WIDTH="166"/>
<attribute NAME="title" VALUE=""/>
<attribute NAME="numberOfDisplayedComments" VALUE=""/>
</node>
<node TEXT="WidgetPost" ID="ID_1352992565" CREATED="1383572306044" MODIFIED="1386161191076">
<attribute_layout NAME_WIDTH="137" VALUE_WIDTH="137"/>
<attribute NAME="title" VALUE=""/>
<attribute NAME="numberOfDisplayedPosts" VALUE=""/>
<node TEXT="isDisplayingPostDate" ID="ID_1559140992" CREATED="1383572295996" MODIFIED="1386161188693">
<node TEXT="Value" ID="ID_823130404" CREATED="1383057386512" MODIFIED="1386161111422">
<icon BUILTIN="multiplication"/>
<attribute_layout NAME_WIDTH="73" VALUE_WIDTH="73"/>
<node TEXT="yes" ID="ID_193922764" CREATED="1383057386512" MODIFIED="1386161149721">
<attribute_layout NAME_WIDTH="73" VALUE_WIDTH="73"/>
</node>
<node TEXT="no" ID="ID_33604365" CREATED="1383057386512" MODIFIED="1386161149718">
<attribute_layout NAME_WIDTH="73" VALUE_WIDTH="73"/>
</node>
</node>
</node>
</node>
<node TEXT="WidgetFeed" ID="ID_109883073" CREATED="1383572307009" MODIFIED="1386945402287">
<attribute_layout NAME_WIDTH="133" VALUE_WIDTH="133"/>
<attribute NAME="url" VALUE=""/>
<node TEXT="isDisplayingItemContent" ID="ID_16007821" CREATED="1383572295996" MODIFIED="1386161212301">
<node TEXT="Value" ID="ID_1297847194" CREATED="1383057386512" MODIFIED="1386161111422">
<icon BUILTIN="multiplication"/>
<attribute_layout NAME_WIDTH="73" VALUE_WIDTH="73"/>
<node TEXT="yes" ID="ID_966549553" CREATED="1383057386512" MODIFIED="1386161149721">
<attribute_layout NAME_WIDTH="73" VALUE_WIDTH="73"/>
</node>
<node TEXT="no" ID="ID_282304754" CREATED="1383057386512" MODIFIED="1386161149718">
<attribute_layout NAME_WIDTH="73" VALUE_WIDTH="73"/>
</node>
</node>
</node>
<node TEXT="isDisplayingItemAuthor" ID="ID_930296005" CREATED="1383572295996" MODIFIED="1386161226557">
<node TEXT="Value" ID="ID_649507775" CREATED="1383057386512" MODIFIED="1386161111422">
<icon BUILTIN="multiplication"/>
<attribute_layout NAME_WIDTH="73" VALUE_WIDTH="73"/>
<node TEXT="yes" ID="ID_1359211317" CREATED="1383057386512" MODIFIED="1386161149721">
<attribute_layout NAME_WIDTH="73" VALUE_WIDTH="73"/>
</node>
<node TEXT="no" ID="ID_1429519887" CREATED="1383057386512" MODIFIED="1386161149718">
<attribute_layout NAME_WIDTH="73" VALUE_WIDTH="73"/>
</node>
</node>
</node>
<node TEXT="isDisplayingItemDate" ID="ID_691933804" CREATED="1383572295996" MODIFIED="1386161241709">
<node TEXT="Value" ID="ID_1928940697" CREATED="1383057386512" MODIFIED="1386161111422">
<icon BUILTIN="multiplication"/>
<attribute_layout NAME_WIDTH="73" VALUE_WIDTH="73"/>
<node TEXT="yes" ID="ID_376257835" CREATED="1383057386512" MODIFIED="1386161149721">
<attribute_layout NAME_WIDTH="73" VALUE_WIDTH="73"/>
</node>
<node TEXT="no" ID="ID_1997858361" CREATED="1383057386512" MODIFIED="1386161149718">
<attribute_layout NAME_WIDTH="73" VALUE_WIDTH="73"/>
</node>
</node>
</node>
</node>
<node TEXT="Search" ID="ID_1336188762" CREATED="1383572308268" MODIFIED="1383573247653">
<attribute NAME="title" VALUE=""/>
</node>
<node TEXT="TagCloud" ID="ID_948574355" CREATED="1383572309250" MODIFIED="1383573261356">
<attribute NAME="title" VALUE=""/>
<node TEXT="Elements" ID="ID_769252473" CREATED="1383038508684" MODIFIED="1386164338151">
<icon BUILTIN="multiplication"/>
<attribute_layout NAME_WIDTH="62" VALUE_WIDTH="62"/>
<node TEXT="Tag" ID="ID_439702774" CREATED="1383038508684" MODIFIED="1386164350906">
<attribute_layout NAME_WIDTH="62" VALUE_WIDTH="62"/>
</node>
<node TEXT="Category" ID="ID_371561125" CREATED="1383038508684" MODIFIED="1386164350904">
<attribute_layout NAME_WIDTH="62" VALUE_WIDTH="62"/>
</node>
</node>
</node>
<node TEXT="Text" ID="ID_1206879954" CREATED="1383572310732" MODIFIED="1386161269842">
<attribute_layout NAME_WIDTH="96" VALUE_WIDTH="96"/>
<attribute NAME="title" VALUE=""/>
<attribute NAME="content" VALUE=""/>
<node TEXT="isAutoParagraphs" ID="ID_1053736102" CREATED="1383572295996" MODIFIED="1386161267724">
<node TEXT="Value" ID="ID_76361399" CREATED="1383057386512" MODIFIED="1386161111422">
<icon BUILTIN="multiplication"/>
<attribute_layout NAME_WIDTH="73" VALUE_WIDTH="73"/>
<node TEXT="yes" ID="ID_928531955" CREATED="1383057386512" MODIFIED="1386161149721">
<attribute_layout NAME_WIDTH="73" VALUE_WIDTH="73"/>
</node>
<node TEXT="no" ID="ID_1471454740" CREATED="1383057386512" MODIFIED="1386161149718">
<attribute_layout NAME_WIDTH="73" VALUE_WIDTH="73"/>
</node>
</node>
</node>
</node>
<node TEXT="WidgetPlacement" ID="ID_793412500" CREATED="1383572294076" MODIFIED="1386160768494">
<attribute_layout NAME_WIDTH="133" VALUE_WIDTH="133"/>
<node TEXT="MainArea" ID="ID_1387936408" CREATED="1383572294076" MODIFIED="1386160802352">
<attribute_layout NAME_WIDTH="133" VALUE_WIDTH="133"/>
</node>
<node TEXT="SecondaryArea" ID="ID_514887204" CREATED="1383572294076" MODIFIED="1386160811064">
<attribute_layout NAME_WIDTH="133" VALUE_WIDTH="133"/>
</node>
</node>
</node>
</node>
<node TEXT="Mandatory features" LOCALIZED_STYLE_REF="defaultstyle.floating" POSITION="left" ID="ID_140049565" CREATED="1390471373496" MODIFIED="1395223132582" HGAP="85" VSHIFT="471">
<icon BUILTIN="yes"/>
<hook NAME="FreeNode"/>
</node>
<node TEXT="Functionnality" POSITION="right" ID="ID_268537327" CREATED="1382979943411" MODIFIED="1395222205061">
<icon BUILTIN="multiplication"/>
<edge COLOR="#0000ff"/>
<node TEXT="socialNetwork" ID="ID_697299302" CREATED="1383066500503" MODIFIED="1386761619610">
<icon BUILTIN="multiplication"/>
<node TEXT="facebook" ID="ID_1448286789" CREATED="1383066497293" MODIFIED="1386760985167"/>
<node TEXT="twitter" ID="ID_1508622030" CREATED="1383066497293" MODIFIED="1386760987666"/>
</node>
<node TEXT="multiLanguage" ID="ID_598047808" CREATED="1383066491920" MODIFIED="1386761625090"/>
<node TEXT="pictures" ID="ID_1713170040" CREATED="1383066497293" MODIFIED="1386760952360"/>
<node TEXT="seo" ID="ID_319397414" CREATED="1383066498694" MODIFIED="1386760958144"/>
<node TEXT="hamSpam" ID="ID_518525984" CREATED="1383066502495" MODIFIED="1386761615338"/>
<node TEXT="forms" ID="ID_1695170218" CREATED="1383066503821" MODIFIED="1386760970734"/>
<node TEXT="indexing" ID="ID_1070844551" CREATED="1383066505197" MODIFIED="1386760974684"/>
<node TEXT="eCommerce" ID="ID_1084311438" CREATED="1383066506375" MODIFIED="1386761628201"/>
</node>
<node TEXT="Feature to delete" LOCALIZED_STYLE_REF="defaultstyle.floating" POSITION="right" ID="ID_1664818189" CREATED="1395224632012" MODIFIED="1395224665296" HGAP="-36" VSHIFT="405">
<icon BUILTIN="button_cancel"/>
<hook NAME="FreeNode"/>
</node>
<node TEXT="Choice between values" LOCALIZED_STYLE_REF="defaultstyle.floating" POSITION="right" ID="ID_1241508300" CREATED="1395137226397" MODIFIED="1395222785846" HGAP="-54" VSHIFT="536">
<icon BUILTIN="multiplication"/>
<hook NAME="FreeNode"/>
</node>
<node TEXT="Reference to a created element" LOCALIZED_STYLE_REF="defaultstyle.floating" POSITION="right" ID="ID_1478585376" CREATED="1395221135948" MODIFIED="1395222783146" HGAP="-72" VSHIFT="614">
<icon BUILTIN="forward"/>
<hook NAME="FreeNode"/>
</node>
<node TEXT="Post" POSITION="right" ID="ID_784583661" CREATED="1382979981267" MODIFIED="1395223123327">
<edge COLOR="#00ffff"/>
<attribute_layout NAME_WIDTH="87" VALUE_WIDTH="87"/>
<node TEXT="Categorie" ID="ID_851574217" CREATED="1383038508684" MODIFIED="1395222868660">
<icon BUILTIN="forward"/>
<attribute_layout NAME_WIDTH="62" VALUE_WIDTH="62"/>
</node>
<node TEXT="Tag" ID="ID_724157468" CREATED="1383038508684" MODIFIED="1395222862929">
<icon BUILTIN="forward"/>
<attribute_layout NAME_WIDTH="62" VALUE_WIDTH="62"/>
</node>
</node>
<node TEXT="Media" POSITION="right" ID="ID_785324106" CREATED="1382979972148" MODIFIED="1395220997810">
<edge COLOR="#ff00ff"/>
<attribute_layout NAME_WIDTH="87" VALUE_WIDTH="87"/>
<node TEXT="Post" ID="ID_1956630697" CREATED="1382979981267" MODIFIED="1395222856867">
<icon BUILTIN="forward"/>
<edge COLOR="#00ffff"/>
<attribute_layout NAME_WIDTH="87" VALUE_WIDTH="87"/>
</node>
<node TEXT="Page" ID="ID_970148043" CREATED="1382979972148" MODIFIED="1395222860233">
<icon BUILTIN="forward"/>
<edge COLOR="#ff00ff"/>
<attribute_layout NAME_WIDTH="87" VALUE_WIDTH="87"/>
</node>
</node>
<node TEXT="Tag" POSITION="right" ID="ID_676758222" CREATED="1382979943411" MODIFIED="1397732952109">
<edge COLOR="#0000ff"/>
</node>
<node TEXT="Category" POSITION="right" ID="ID_272269280" CREATED="1395220786255" MODIFIED="1397732947786"/>
</node>
</map>
