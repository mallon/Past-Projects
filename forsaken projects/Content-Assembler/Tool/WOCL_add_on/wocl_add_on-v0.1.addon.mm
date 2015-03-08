<map version="freeplane 1.2.0">
<!--To view this file, download free mind mapping software Freeplane from http://freeplane.sourceforge.net -->
<node TEXT="wocl_add_on" ID="ID_1723255651" CREATED="1283093380553" MODIFIED="1396948920915" BACKGROUND_COLOR="#97c7dc" LINK="https://github.com/">
<font SIZE="16" BOLD="true" ITALIC="true"/>
<hook NAME="MapStyle">
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
<hook NAME="AutomaticEdgeColor" COUNTER="10"/>
<attribute_layout NAME_WIDTH="121" VALUE_WIDTH="209"/>
<attribute NAME="name" VALUE="woclAddOn"/>
<attribute NAME="version" VALUE="v0.1"/>
<attribute NAME="author" VALUE="mallon"/>
<attribute NAME="freeplaneVersionFrom" VALUE="1.2.23"/>
<attribute NAME="freeplaneVersionTo" VALUE=""/>
<attribute NAME="updateUrl" VALUE="${homepage}/version.properties"/>
<richcontent TYPE="NOTE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      The homepage of this add-on should be set as the link of the root node.
    </p>
    <p>
      The basic properties of this add-on. They can be used in script names and other attributes, e.g. &quot;${name}.groovy&quot;.
    </p>
    <ul>
      <li>
        name: The name of the add-on, normally a technically one (no spaces, no special characters except _.-).
      </li>
      <li>
        author: Author's name(s) and (optionally) email adresses.
      </li>
      <li>
        version: Since it's difficult to protect numbers like 1.0 from Freeplane's number parser it's advised to prepend a 'v' to the number, e.g. 'v1.0'.
      </li>
      <li>
        freeplane-version-from: The oldest compatible Freeplane version. The add-on will not be installed if the Freeplane version is too old.
      </li>
      <li>
        freeplane-version-to: Normally empty: The newest compatible Freeplane version. The add-on will not be installed if the Freeplane version is too new.
      </li>
      <li>
        updateUrl: URL of the file containing information (version, download url) on the latest version of this add-on. By default: &quot;${homepage}/version.properties&quot;
      </li>
    </ul>
  </body>
</html>
</richcontent>
<node TEXT="description" POSITION="left" ID="ID_1786080328" CREATED="1396436302262" MODIFIED="1396948920940" HGAP="-70" VSHIFT="-70">
<edge COLOR="#ff0000"/>
<richcontent TYPE="NOTE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      Description would be awkward to edit as an attribute.
    </p>
    <p>
      So you have to put the add-on description as a child of the <i>'description'</i>&#160;node.
    </p>
    <p>
      To translate the description you have to define a translation for the key 'addons.${name}.description'.
    </p>
  </body>
</html>
</richcontent>
<node TEXT="This add-on enables to create a mind-map accordingly to the DSL &apos;WOCL&apos;(WordPress Configuration Language) concepts" ID="ID_1610710447" CREATED="1396436353616" MODIFIED="1396436422942"/>
</node>
<node TEXT="changes" POSITION="left" ID="ID_415813166" CREATED="1396436302279" MODIFIED="1396948920943" HGAP="0" VSHIFT="-90">
<edge COLOR="#0000ff"/>
<richcontent TYPE="NOTE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      Change log of this add-on: append one node for each noteworthy version and put the details for each version into a child node.
    </p>
  </body>
</html>
</richcontent>
</node>
<node TEXT="license" POSITION="left" ID="ID_1931130029" CREATED="1396436302291" MODIFIED="1396948920946" HGAP="30" VSHIFT="-90">
<edge COLOR="#00ff00"/>
<richcontent TYPE="NOTE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      The add-ons's license that the user has to accept before she can install it.
    </p>
    <p>
      
    </p>
    <p>
      The License text has to be entered as a child of the <i>'license'</i>&#160;node, either as plain text or as HTML.
    </p>
  </body>
</html>
</richcontent>
<node TEXT="&#xa;This add-on is free software: you can redistribute it and/or modify&#xa;it under the terms of the GNU General Public License as published by&#xa;the Free Software Foundation, either version 2 of the License, or&#xa;(at your option) any later version.&#xa;&#xa;This program is distributed in the hope that it will be useful,&#xa;but WITHOUT ANY WARRANTY; without even the implied warranty of&#xa;MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.&#xa0;&#xa0;See the&#xa;GNU General Public License for more details.&#xa;" ID="ID_149198739" CREATED="1396436302302" MODIFIED="1396436302303"/>
</node>
<node TEXT="preferences.xml" POSITION="left" ID="ID_520988523" CREATED="1396436302334" MODIFIED="1396948920950" HGAP="160" VSHIFT="-160">
<edge COLOR="#ff00ff"/>
<richcontent TYPE="NOTE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <font color="#000000" face="SansSerif, sans-serif">The child node contains the add-on configuration as an extension to mindmapmodemenu.xml (in Tools-&gt;Preferences-&gt;Add-ons). </font>
    </p>
    <p>
      <font color="#000000" face="SansSerif, sans-serif">Every property in the configuration should receive a default value in <i>default.properties</i>&#160;node.</font>
    </p>
  </body>
</html>
</richcontent>
</node>
<node TEXT="default.properties" POSITION="left" ID="ID_1857471161" CREATED="1396436302367" MODIFIED="1396948920953" HGAP="190" VSHIFT="-130">
<edge COLOR="#00ffff"/>
<richcontent TYPE="NOTE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      These properties play together with the preferences: Each property defined in the preferences should have a default value in the attributes of this node.
    </p>
  </body>
</html>
</richcontent>
</node>
<node TEXT="translations" POSITION="left" ID="ID_1204216599" CREATED="1396436302377" MODIFIED="1396948920956" HGAP="150" VSHIFT="-100">
<edge COLOR="#ffff00"/>
<richcontent TYPE="NOTE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      The translation keys that this script uses. Define one child node per supported locale. The attributes contain the translations. Define at least
    </p>
    <ul>
      <li>
        'addons.${name}' for the add-on's name
      </li>
      <li>
        'addons.${name}.description' for the description, e.g. in the add-on overview dialog (not necessary for English)
      </li>
    </ul>
  </body>
</html>
</richcontent>
<node TEXT="en" ID="ID_11133982" CREATED="1396436302386" MODIFIED="1396436338816">
<attribute_layout NAME_WIDTH="95" VALUE_WIDTH="95"/>
<attribute NAME="addons.${name}" VALUE="wocl_add_on"/>
</node>
</node>
<node TEXT="deinstall" POSITION="left" ID="ID_380113316" CREATED="1396436302399" MODIFIED="1396948920959" HGAP="130" VSHIFT="-40">
<edge COLOR="#7c0000"/>
<richcontent TYPE="NOTE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      List of files and/or directories to remove on deinstall
    </p>
  </body>
</html>
</richcontent>
<attribute_layout NAME_WIDTH="38" VALUE_WIDTH="256"/>
<attribute NAME="delete" VALUE="${installationbase}/addons/${name}.script.xml"/>
<attribute NAME="delete" VALUE="${installationbase}/scripts/createWebsiteNode.groovy"/>
<attribute NAME="delete" VALUE="${installationbase}/scripts/createWebsiteRootNode.groovy"/>
<attribute NAME="delete" VALUE="${installationbase}/scripts/newPage.groovy"/>
<attribute NAME="delete" VALUE="${installationbase}/scripts/newPost.groovy"/>
<attribute NAME="delete" VALUE="${installationbase}/scripts/newTag.groovy"/>
<attribute NAME="delete" VALUE="${installationbase}/scripts/newCategory.groovy"/>
<attribute NAME="delete" VALUE="${installationbase}/scripts/newUser.groovy"/>
<attribute NAME="delete" VALUE="${installationbase}/scripts/newMedia.groovy"/>
<attribute NAME="delete" VALUE="${installationbase}/scripts/newFunctionality.groovy"/>
<attribute NAME="delete" VALUE="${installationbase}/scripts/newAppArchives.groovy"/>
<attribute NAME="delete" VALUE="${installationbase}/scripts/newAppCalendars.groovy"/>
<attribute NAME="delete" VALUE="${installationbase}/scripts/newAppHeader.groovy"/>
<attribute NAME="delete" VALUE="${installationbase}/scripts/newAppMenu.groovy"/>
<attribute NAME="delete" VALUE="${installationbase}/scripts/newAppTheme.groovy"/>
<attribute NAME="delete" VALUE="${installationbase}/scripts/newAppWidgetCategory.groovy"/>
<attribute NAME="delete" VALUE="${installationbase}/scripts/newAppWidgetComment.groovy"/>
<attribute NAME="delete" VALUE="${installationbase}/scripts/newAppWidgetFeed.groovy"/>
<attribute NAME="delete" VALUE="${installationbase}/scripts/newAppWidgetMenu.groovy"/>
<attribute NAME="delete" VALUE="${installationbase}/scripts/newAppWidgetMeta.groovy"/>
<attribute NAME="delete" VALUE="${installationbase}/scripts/newAppWidgetPage.groovy"/>
<attribute NAME="delete" VALUE="${installationbase}/scripts/newAppWidgetPlacement.groovy"/>
<attribute NAME="delete" VALUE="${installationbase}/scripts/newAppWidgetPost.groovy"/>
<attribute NAME="delete" VALUE="${installationbase}/scripts/newAppWidgetSearch.groovy"/>
<attribute NAME="delete" VALUE="${installationbase}/scripts/newAppWidgetTagCloud.groovy"/>
<attribute NAME="delete" VALUE="${installationbase}/scripts/newAppWidgetText.groovy"/>
<attribute NAME="delete" VALUE="${installationbase}/scripts/newUserAdmin.groovy"/>
<attribute NAME="delete" VALUE="${installationbase}/scripts/launchTransformation.groovy"/>
</node>
<node TEXT="scripts" POSITION="right" ID="ID_502214503" CREATED="1396436302417" MODIFIED="1396948920968" HGAP="100" VSHIFT="190">
<edge COLOR="#00007c"/>
<richcontent TYPE="NOTE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      An add-on may contain multiple scripts. The node text defines the script name (e.g. inserInlineImage.groovy). The name must have a suffix of a supported script language like .groovy or .js and may only consist of letters and digits. The script properties have to be configured via attributes:
    </p>
    <p>
      
    </p>
    <p>
      * menuLocation: &lt;locationkey&gt;
    </p>
    <p>
      &#160;&#160;&#160;- Defines where the menu location.
    </p>
    <p>
      &#160;&#160;&#160;-&#160;See mindmapmodemenu.xml for how the menu locations look like.
    </p>
    <p>
      &#160;&#160;&#160;- http://freeplane.bzr.sf.net/bzr/freeplane/freeplane_program/trunk/annotate/head%3A/freeplane/resources/xml/mindmapmodemenu.xml
    </p>
    <p>
      &#160;&#160;&#160;- This attribute is mandatory
    </p>
    <p>
      
    </p>
    <p>
      * menuTitleKey: &lt;key&gt;
    </p>
    <p>
      &#160;&#160;&#160;- The menu item title will be looked up under the translation key &lt;key&gt; - don't forget to define its translation.
    </p>
    <p>
      &#160;&#160;&#160;- This attribute is mandatory
    </p>
    <p>
      
    </p>
    <p>
      * executionMode: &lt;mode&gt;
    </p>
    <p>
      &#160;&#160;&#160;- The execution mode as described in the Freeplane wiki (http://freeplane.sourceforge.net/wiki/index.php/Scripting)
    </p>
    <p>
      &#160;&#160;&#160;- ON_SINGLE_NODE: Execute the script once. The <i>node</i>&#160;variable is set to the selected node.
    </p>
    <p>
      &#160;&#160;&#160;- ON_SELECTED_NODE: Execute the script n times for n selected nodes, once for each node.
    </p>
    <p>
      &#160;&#160;&#160;- ON_SELECTED_NODE_RECURSIVELY: Execute the script on every selected node and recursively on all of its children.
    </p>
    <p>
      &#160;&#160;&#160;- In doubt use ON_SINGLE_NODE.
    </p>
    <p>
      &#160;&#160;&#160;- This attribute is mandatory
    </p>
    <p>
      
    </p>
    <p>
      * keyboardShortcut: &lt;shortcut&gt;
    </p>
    <p>
      &#160;&#160;&#160;- Optional: keyboard combination / accelerator for this script, e.g. control alt I
    </p>
    <p>
      &#160;&#160;&#160;- Use lowercase letters for modifiers and uppercase for letters. Use no + signs.
    </p>
    <p>
      &#160;&#160;&#160;- The available key names are listed at http://download.oracle.com/javase/1.4.2/docs/api/java/awt/event/KeyEvent.html#VK_0
    </p>
    <p>
      &#160;&#160;&#160;&#160;&#160;In the list only entries with a 'VK_' prefix count. Omit the prefix in the shortcut definition.
    </p>
    <p>
      
    </p>
    <p>
      * Permissions&#160;that the script(s) require, each either false or true:
    </p>
    <p>
      &#160;&#160;&#160;- execute_scripts_without_asking
    </p>
    <p>
      &#160;&#160;&#160;- execute_scripts_without_file_restriction: permission to read files
    </p>
    <p>
      &#160;&#160;&#160;- execute_scripts_without_write_restriction: permission to create/change/delete files
    </p>
    <p>
      &#160;&#160;&#160;- execute_scripts_without_exec_restriction: permission to execute other programs
    </p>
    <p>
      &#160;&#160;&#160;- execute_scripts_without_network_restriction: permission to access the network
    </p>
    <p>
      &#160;&#160;Notes:
    </p>
    <p>
      &#160;&#160;- The set of permissions is fixed.
    </p>
    <p>
      &#160;&#160;- Don't change the attribute names, don't omit one.
    </p>
    <p>
      &#160;&#160;- Set the values either to true or to false
    </p>
    <p>
      &#160;&#160;- In any case set execute_scripts_without_asking to true unless you want to annoy users.
    </p>
  </body>
</html>
</richcontent>
<node TEXT="createWebsiteRootNode.groovy" ID="ID_1760778513" CREATED="1396436451091" MODIFIED="1396609269211">
<attribute_layout NAME_WIDTH="253" VALUE_WIDTH="253"/>
<attribute NAME="menuTitleKey" VALUE="New Website Root Node"/>
<attribute NAME="menuLocation" VALUE="/menu_bar/WebsiteConfiguration"/>
<attribute NAME="executionMode" VALUE="on_single_node"/>
<attribute NAME="keyboardShortcut" VALUE=""/>
<attribute NAME="execute_scripts_without_asking" VALUE="true"/>
<attribute NAME="execute_scripts_without_file_restriction" VALUE="true"/>
<attribute NAME="execute_scripts_without_write_restriction" VALUE="false"/>
<attribute NAME="execute_scripts_without_exec_restriction" VALUE="false"/>
<attribute NAME="execute_scripts_without_network_restriction" VALUE="false"/>
<node TEXT="// @ExecutionModes({ON_SINGLE_NODE})&#xd;&#xa;&#xd;&#xa;node.text = &quot;Website&quot;&#xd;&#xa;node[&quot;title&quot;] = &quot;&quot;&#xd;&#xa;node[&quot;tagLine&quot;]=&quot;&quot;&#xd;&#xa;node[&quot;address&quot;]=&quot;&quot;&#xd;&#xa;node[&quot;adminPassword&quot;]=&quot;&quot;&#xd;&#xa;node[&quot;adminLogin&quot;]=&quot;&quot;" ID="ID_737585966" CREATED="1396961418934" MODIFIED="1396961418943"/>
</node>
<node TEXT="newPage.groovy" ID="ID_102596804" CREATED="1396436451091" MODIFIED="1396609264822">
<attribute_layout NAME_WIDTH="253" VALUE_WIDTH="253"/>
<attribute NAME="menuTitleKey" VALUE="New Page Node"/>
<attribute NAME="menuLocation" VALUE="/menu_bar/WebsiteConfiguration"/>
<attribute NAME="executionMode" VALUE="on_single_node"/>
<attribute NAME="keyboardShortcut" VALUE=""/>
<attribute NAME="execute_scripts_without_asking" VALUE="true"/>
<attribute NAME="execute_scripts_without_file_restriction" VALUE="true"/>
<attribute NAME="execute_scripts_without_write_restriction" VALUE="false"/>
<attribute NAME="execute_scripts_without_exec_restriction" VALUE="false"/>
<attribute NAME="execute_scripts_without_network_restriction" VALUE="false"/>
<node TEXT="" ID="ID_1754694033" CREATED="1396961418950" MODIFIED="1396961418950"/>
</node>
<node TEXT="newPost.groovy" ID="ID_356443586" CREATED="1396436451091" MODIFIED="1396609258297">
<attribute_layout NAME_WIDTH="253" VALUE_WIDTH="253"/>
<attribute NAME="menuTitleKey" VALUE="New Post Node"/>
<attribute NAME="menuLocation" VALUE="/menu_bar/WebsiteConfiguration"/>
<attribute NAME="executionMode" VALUE="on_single_node"/>
<attribute NAME="keyboardShortcut" VALUE=""/>
<attribute NAME="execute_scripts_without_asking" VALUE="true"/>
<attribute NAME="execute_scripts_without_file_restriction" VALUE="true"/>
<attribute NAME="execute_scripts_without_write_restriction" VALUE="false"/>
<attribute NAME="execute_scripts_without_exec_restriction" VALUE="false"/>
<attribute NAME="execute_scripts_without_network_restriction" VALUE="false"/>
<node TEXT="" ID="ID_31830020" CREATED="1396961418951" MODIFIED="1396961418951"/>
</node>
<node TEXT="newTag.groovy" ID="ID_1944515781" CREATED="1396436451091" MODIFIED="1396609251894">
<attribute_layout NAME_WIDTH="253" VALUE_WIDTH="253"/>
<attribute NAME="menuTitleKey" VALUE="New Tag Node"/>
<attribute NAME="menuLocation" VALUE="/menu_bar/WebsiteConfiguration"/>
<attribute NAME="executionMode" VALUE="on_single_node"/>
<attribute NAME="keyboardShortcut" VALUE=""/>
<attribute NAME="execute_scripts_without_asking" VALUE="true"/>
<attribute NAME="execute_scripts_without_file_restriction" VALUE="true"/>
<attribute NAME="execute_scripts_without_write_restriction" VALUE="false"/>
<attribute NAME="execute_scripts_without_exec_restriction" VALUE="false"/>
<attribute NAME="execute_scripts_without_network_restriction" VALUE="false"/>
<node TEXT="" ID="ID_1050401151" CREATED="1396961418952" MODIFIED="1396961418952"/>
</node>
<node TEXT="newCategory.groovy" ID="ID_836310138" CREATED="1396436451091" MODIFIED="1396609246697">
<attribute_layout NAME_WIDTH="253" VALUE_WIDTH="253"/>
<attribute NAME="menuTitleKey" VALUE="New Category Node"/>
<attribute NAME="menuLocation" VALUE="/menu_bar/WebsiteConfiguration"/>
<attribute NAME="executionMode" VALUE="on_single_node"/>
<attribute NAME="keyboardShortcut" VALUE=""/>
<attribute NAME="execute_scripts_without_asking" VALUE="true"/>
<attribute NAME="execute_scripts_without_file_restriction" VALUE="true"/>
<attribute NAME="execute_scripts_without_write_restriction" VALUE="false"/>
<attribute NAME="execute_scripts_without_exec_restriction" VALUE="false"/>
<attribute NAME="execute_scripts_without_network_restriction" VALUE="false"/>
<node TEXT="" ID="ID_1334521927" CREATED="1396961418953" MODIFIED="1396961418953"/>
</node>
<node TEXT="newUserAdmin.groovy" ID="ID_996988430" CREATED="1396436451091" MODIFIED="1396609232188">
<attribute_layout NAME_WIDTH="253" VALUE_WIDTH="268"/>
<attribute NAME="menuTitleKey" VALUE="administrator"/>
<attribute NAME="menuLocation" VALUE="/menu_bar/WebsiteConfiguration/NewUserNode"/>
<attribute NAME="executionMode" VALUE="on_single_node"/>
<attribute NAME="keyboardShortcut" VALUE=""/>
<attribute NAME="execute_scripts_without_asking" VALUE="true"/>
<attribute NAME="execute_scripts_without_file_restriction" VALUE="true"/>
<attribute NAME="execute_scripts_without_write_restriction" VALUE="false"/>
<attribute NAME="execute_scripts_without_exec_restriction" VALUE="false"/>
<attribute NAME="execute_scripts_without_network_restriction" VALUE="false"/>
<node TEXT="// @ExecutionModes({ON_SINGLE_NODE})&#xd;&#xa;&#xd;&#xa;if (node.text == &quot;Website&quot;){&#xd;&#xa;&#x9;def user = node.createChild()&#xd;&#xa;&#x9;user.text = &quot;User&quot;&#xd;&#xa;&#x9;user[&quot;userName&quot;] = &quot;&quot;&#xd;&#xa;&#x9;user[&quot;firstName&quot;]=&quot;&quot;&#xd;&#xa;&#x9;user[&quot;lastName&quot;]=&quot;&quot;&#xd;&#xa;&#x9;user[&quot;nickName&quot;]=&quot;&quot;&#xd;&#xa;&#x9;user[&quot;publicName&quot;]=&quot;&quot;&#xd;&#xa;&#x9;user[&quot;email&quot;]=&quot;&quot;&#xd;&#xa;&#x9;user[&quot;website&quot;]=&quot;&quot;&#xd;&#xa;&#x9;user[&quot;biography&quot;]=&quot;&quot;&#xd;&#xa;&#x9;user[&quot;password&quot;]=&quot;&quot;&#xd;&#xa;&#x9;&#xd;&#xa;&#x9;def role = user.createChild()&#xd;&#xa;&#x9;role.text = &quot;Role&quot;&#xd;&#xa;&#xd;&#xa;&#x9;def admin = role.createChild()&#xd;&#xa;&#x9;admin.text = &quot;administrator&quot;&#xd;&#xa;}&#xd;&#xa;&#xd;&#xa;&#xd;&#xa;&#xd;&#xa;&#xd;&#xa;" ID="ID_441211296" CREATED="1396961418954" MODIFIED="1396961418955"/>
</node>
<node TEXT="newMedia.groovy" ID="ID_726513553" CREATED="1396436451091" MODIFIED="1396609219724">
<attribute_layout NAME_WIDTH="253" VALUE_WIDTH="170"/>
<attribute NAME="menuTitleKey" VALUE="New Media Node"/>
<attribute NAME="menuLocation" VALUE="/menu_bar/WebsiteConfiguration"/>
<attribute NAME="executionMode" VALUE="on_single_node"/>
<attribute NAME="keyboardShortcut" VALUE=""/>
<attribute NAME="execute_scripts_without_asking" VALUE="true"/>
<attribute NAME="execute_scripts_without_file_restriction" VALUE="true"/>
<attribute NAME="execute_scripts_without_write_restriction" VALUE="false"/>
<attribute NAME="execute_scripts_without_exec_restriction" VALUE="false"/>
<attribute NAME="execute_scripts_without_network_restriction" VALUE="false"/>
<node TEXT="" ID="ID_1125770248" CREATED="1396961418956" MODIFIED="1396961418956"/>
</node>
<node TEXT="newFunctionality.groovy" ID="ID_334881186" CREATED="1396436451091" MODIFIED="1396609214625">
<attribute_layout NAME_WIDTH="253" VALUE_WIDTH="170"/>
<attribute NAME="menuTitleKey" VALUE="New Functionality Node"/>
<attribute NAME="menuLocation" VALUE="/menu_bar/WebsiteConfiguration"/>
<attribute NAME="executionMode" VALUE="on_single_node"/>
<attribute NAME="keyboardShortcut" VALUE=""/>
<attribute NAME="execute_scripts_without_asking" VALUE="true"/>
<attribute NAME="execute_scripts_without_file_restriction" VALUE="true"/>
<attribute NAME="execute_scripts_without_write_restriction" VALUE="false"/>
<attribute NAME="execute_scripts_without_exec_restriction" VALUE="false"/>
<attribute NAME="execute_scripts_without_network_restriction" VALUE="false"/>
<node TEXT="" ID="ID_403939441" CREATED="1396961418957" MODIFIED="1396961418957"/>
</node>
<node TEXT="newAppArchives.groovy" ID="ID_983732941" CREATED="1396436451091" MODIFIED="1396609210756">
<attribute_layout NAME_WIDTH="253" VALUE_WIDTH="253"/>
<attribute NAME="menuTitleKey" VALUE="New Appearance Archives Node"/>
<attribute NAME="menuLocation" VALUE="/menu_bar/WebsiteConfiguration"/>
<attribute NAME="executionMode" VALUE="on_single_node"/>
<attribute NAME="keyboardShortcut" VALUE=""/>
<attribute NAME="execute_scripts_without_asking" VALUE="true"/>
<attribute NAME="execute_scripts_without_file_restriction" VALUE="true"/>
<attribute NAME="execute_scripts_without_write_restriction" VALUE="false"/>
<attribute NAME="execute_scripts_without_exec_restriction" VALUE="false"/>
<attribute NAME="execute_scripts_without_network_restriction" VALUE="false"/>
<node TEXT="" ID="ID_116646223" CREATED="1396961418958" MODIFIED="1396961418958"/>
</node>
<node TEXT="newAppCalendars.groovy" ID="ID_1136846804" CREATED="1396436451091" MODIFIED="1396609205256">
<attribute_layout NAME_WIDTH="253" VALUE_WIDTH="253"/>
<attribute NAME="menuTitleKey" VALUE="New Appearance Calendars Node"/>
<attribute NAME="menuLocation" VALUE="/menu_bar/WebsiteConfiguration"/>
<attribute NAME="executionMode" VALUE="on_single_node"/>
<attribute NAME="keyboardShortcut" VALUE=""/>
<attribute NAME="execute_scripts_without_asking" VALUE="true"/>
<attribute NAME="execute_scripts_without_file_restriction" VALUE="true"/>
<attribute NAME="execute_scripts_without_write_restriction" VALUE="false"/>
<attribute NAME="execute_scripts_without_exec_restriction" VALUE="false"/>
<attribute NAME="execute_scripts_without_network_restriction" VALUE="false"/>
<node TEXT="" ID="ID_1016154130" CREATED="1396961418959" MODIFIED="1396961418959"/>
</node>
<node TEXT="newAppHeader.groovy" ID="ID_209814746" CREATED="1396436451091" MODIFIED="1396609199867">
<attribute_layout NAME_WIDTH="253" VALUE_WIDTH="253"/>
<attribute NAME="menuTitleKey" VALUE="New Appearance Header Node"/>
<attribute NAME="menuLocation" VALUE="/menu_bar/WebsiteConfiguration"/>
<attribute NAME="executionMode" VALUE="on_single_node"/>
<attribute NAME="keyboardShortcut" VALUE=""/>
<attribute NAME="execute_scripts_without_asking" VALUE="true"/>
<attribute NAME="execute_scripts_without_file_restriction" VALUE="true"/>
<attribute NAME="execute_scripts_without_write_restriction" VALUE="false"/>
<attribute NAME="execute_scripts_without_exec_restriction" VALUE="false"/>
<attribute NAME="execute_scripts_without_network_restriction" VALUE="false"/>
<node TEXT="" ID="ID_1179831333" CREATED="1396961418960" MODIFIED="1396961418960"/>
</node>
<node TEXT="newAppMenu.groovy" ID="ID_1403426079" CREATED="1396436451091" MODIFIED="1396609196646">
<attribute_layout NAME_WIDTH="253" VALUE_WIDTH="253"/>
<attribute NAME="menuTitleKey" VALUE="New Appearance Menu Node"/>
<attribute NAME="menuLocation" VALUE="/menu_bar/WebsiteConfiguration"/>
<attribute NAME="executionMode" VALUE="on_single_node"/>
<attribute NAME="keyboardShortcut" VALUE=""/>
<attribute NAME="execute_scripts_without_asking" VALUE="true"/>
<attribute NAME="execute_scripts_without_file_restriction" VALUE="true"/>
<attribute NAME="execute_scripts_without_write_restriction" VALUE="false"/>
<attribute NAME="execute_scripts_without_exec_restriction" VALUE="false"/>
<attribute NAME="execute_scripts_without_network_restriction" VALUE="false"/>
<node TEXT="" ID="ID_1002313944" CREATED="1396961418962" MODIFIED="1396961418962"/>
</node>
<node TEXT="newAppTheme.groovy" ID="ID_86523099" CREATED="1396436451091" MODIFIED="1396609191787">
<attribute_layout NAME_WIDTH="253" VALUE_WIDTH="253"/>
<attribute NAME="menuTitleKey" VALUE="New Appearance Theme Node"/>
<attribute NAME="menuLocation" VALUE="/menu_bar/WebsiteConfiguration"/>
<attribute NAME="executionMode" VALUE="on_single_node"/>
<attribute NAME="keyboardShortcut" VALUE=""/>
<attribute NAME="execute_scripts_without_asking" VALUE="true"/>
<attribute NAME="execute_scripts_without_file_restriction" VALUE="true"/>
<attribute NAME="execute_scripts_without_write_restriction" VALUE="false"/>
<attribute NAME="execute_scripts_without_exec_restriction" VALUE="false"/>
<attribute NAME="execute_scripts_without_network_restriction" VALUE="false"/>
<node TEXT="" ID="ID_1303797673" CREATED="1396961418963" MODIFIED="1396961418963"/>
</node>
<node TEXT="newAppWidgetCategory.groovy" ID="ID_1528642458" CREATED="1396436451091" MODIFIED="1396609188533">
<attribute_layout NAME_WIDTH="253" VALUE_WIDTH="253"/>
<attribute NAME="menuTitleKey" VALUE="New Appearance Widget Category Node"/>
<attribute NAME="menuLocation" VALUE="/menu_bar/WebsiteConfiguration"/>
<attribute NAME="executionMode" VALUE="on_single_node"/>
<attribute NAME="keyboardShortcut" VALUE=""/>
<attribute NAME="execute_scripts_without_asking" VALUE="true"/>
<attribute NAME="execute_scripts_without_file_restriction" VALUE="true"/>
<attribute NAME="execute_scripts_without_write_restriction" VALUE="false"/>
<attribute NAME="execute_scripts_without_exec_restriction" VALUE="false"/>
<attribute NAME="execute_scripts_without_network_restriction" VALUE="false"/>
<node TEXT="" ID="ID_1693598981" CREATED="1396961418964" MODIFIED="1396961418964"/>
</node>
<node TEXT="newAppWidgetComment.groovy" ID="ID_1056388064" CREATED="1396436451091" MODIFIED="1396609184086">
<attribute_layout NAME_WIDTH="253" VALUE_WIDTH="253"/>
<attribute NAME="menuTitleKey" VALUE="New Appearance Widget Comment Node"/>
<attribute NAME="menuLocation" VALUE="/menu_bar/WebsiteConfiguration"/>
<attribute NAME="executionMode" VALUE="on_single_node"/>
<attribute NAME="keyboardShortcut" VALUE=""/>
<attribute NAME="execute_scripts_without_asking" VALUE="true"/>
<attribute NAME="execute_scripts_without_file_restriction" VALUE="true"/>
<attribute NAME="execute_scripts_without_write_restriction" VALUE="false"/>
<attribute NAME="execute_scripts_without_exec_restriction" VALUE="false"/>
<attribute NAME="execute_scripts_without_network_restriction" VALUE="false"/>
<node TEXT="" ID="ID_1482406016" CREATED="1396961418965" MODIFIED="1396961418965"/>
</node>
<node TEXT="newAppWidgetFeed.groovy" ID="ID_1276825582" CREATED="1396436451091" MODIFIED="1396609179572">
<attribute_layout NAME_WIDTH="253" VALUE_WIDTH="253"/>
<attribute NAME="menuTitleKey" VALUE="New Appearance Widget Feed Node"/>
<attribute NAME="menuLocation" VALUE="/menu_bar/WebsiteConfiguration"/>
<attribute NAME="executionMode" VALUE="on_single_node"/>
<attribute NAME="keyboardShortcut" VALUE=""/>
<attribute NAME="execute_scripts_without_asking" VALUE="true"/>
<attribute NAME="execute_scripts_without_file_restriction" VALUE="true"/>
<attribute NAME="execute_scripts_without_write_restriction" VALUE="false"/>
<attribute NAME="execute_scripts_without_exec_restriction" VALUE="false"/>
<attribute NAME="execute_scripts_without_network_restriction" VALUE="false"/>
<node TEXT="" ID="ID_1114572276" CREATED="1396961418967" MODIFIED="1396961418967"/>
</node>
<node TEXT="newAppWidgetMenu.groovy" ID="ID_1564968951" CREATED="1396436451091" MODIFIED="1396609176535">
<attribute_layout NAME_WIDTH="253" VALUE_WIDTH="253"/>
<attribute NAME="menuTitleKey" VALUE="New Appearance Widget Menu Node"/>
<attribute NAME="menuLocation" VALUE="/menu_bar/WebsiteConfiguration"/>
<attribute NAME="executionMode" VALUE="on_single_node"/>
<attribute NAME="keyboardShortcut" VALUE=""/>
<attribute NAME="execute_scripts_without_asking" VALUE="true"/>
<attribute NAME="execute_scripts_without_file_restriction" VALUE="true"/>
<attribute NAME="execute_scripts_without_write_restriction" VALUE="false"/>
<attribute NAME="execute_scripts_without_exec_restriction" VALUE="false"/>
<attribute NAME="execute_scripts_without_network_restriction" VALUE="false"/>
<node TEXT="" ID="ID_633811912" CREATED="1396961418968" MODIFIED="1396961418968"/>
</node>
<node TEXT="newAppWidgetMeta.groovy" ID="ID_190555412" CREATED="1396436451091" MODIFIED="1396609171600">
<attribute_layout NAME_WIDTH="253" VALUE_WIDTH="253"/>
<attribute NAME="menuTitleKey" VALUE="New Appearance Widget Meta Node"/>
<attribute NAME="menuLocation" VALUE="/menu_bar/WebsiteConfiguration"/>
<attribute NAME="executionMode" VALUE="on_single_node"/>
<attribute NAME="keyboardShortcut" VALUE=""/>
<attribute NAME="execute_scripts_without_asking" VALUE="true"/>
<attribute NAME="execute_scripts_without_file_restriction" VALUE="true"/>
<attribute NAME="execute_scripts_without_write_restriction" VALUE="false"/>
<attribute NAME="execute_scripts_without_exec_restriction" VALUE="false"/>
<attribute NAME="execute_scripts_without_network_restriction" VALUE="false"/>
<node TEXT="" ID="ID_969618319" CREATED="1396961418969" MODIFIED="1396961418969"/>
</node>
<node TEXT="newAppWidgetPage.groovy" ID="ID_941426995" CREATED="1396436451091" MODIFIED="1396609168021">
<attribute_layout NAME_WIDTH="253" VALUE_WIDTH="253"/>
<attribute NAME="menuTitleKey" VALUE="New Appearance Widget Page Node"/>
<attribute NAME="menuLocation" VALUE="/menu_bar/WebsiteConfiguration"/>
<attribute NAME="executionMode" VALUE="on_single_node"/>
<attribute NAME="keyboardShortcut" VALUE=""/>
<attribute NAME="execute_scripts_without_asking" VALUE="true"/>
<attribute NAME="execute_scripts_without_file_restriction" VALUE="true"/>
<attribute NAME="execute_scripts_without_write_restriction" VALUE="false"/>
<attribute NAME="execute_scripts_without_exec_restriction" VALUE="false"/>
<attribute NAME="execute_scripts_without_network_restriction" VALUE="false"/>
<node TEXT="" ID="ID_1980379087" CREATED="1396961418970" MODIFIED="1396961418970"/>
</node>
<node TEXT="newAppWidgetPlacement.groovy" ID="ID_1794809511" CREATED="1396436451091" MODIFIED="1396609162169">
<attribute_layout NAME_WIDTH="253" VALUE_WIDTH="253"/>
<attribute NAME="menuTitleKey" VALUE="New Appearance Widget Placement Node"/>
<attribute NAME="menuLocation" VALUE="/menu_bar/WebsiteConfiguration"/>
<attribute NAME="executionMode" VALUE="on_single_node"/>
<attribute NAME="keyboardShortcut" VALUE=""/>
<attribute NAME="execute_scripts_without_asking" VALUE="true"/>
<attribute NAME="execute_scripts_without_file_restriction" VALUE="true"/>
<attribute NAME="execute_scripts_without_write_restriction" VALUE="false"/>
<attribute NAME="execute_scripts_without_exec_restriction" VALUE="false"/>
<attribute NAME="execute_scripts_without_network_restriction" VALUE="false"/>
<node TEXT="" ID="ID_1433741966" CREATED="1396961418971" MODIFIED="1396961418971"/>
</node>
<node TEXT="newAppWidgetPost.groovy" ID="ID_493675103" CREATED="1396436451091" MODIFIED="1396609157388">
<attribute_layout NAME_WIDTH="253" VALUE_WIDTH="253"/>
<attribute NAME="menuTitleKey" VALUE="New Appearance Widget Post Node"/>
<attribute NAME="menuLocation" VALUE="/menu_bar/WebsiteConfiguration"/>
<attribute NAME="executionMode" VALUE="on_single_node"/>
<attribute NAME="keyboardShortcut" VALUE=""/>
<attribute NAME="execute_scripts_without_asking" VALUE="true"/>
<attribute NAME="execute_scripts_without_file_restriction" VALUE="true"/>
<attribute NAME="execute_scripts_without_write_restriction" VALUE="false"/>
<attribute NAME="execute_scripts_without_exec_restriction" VALUE="false"/>
<attribute NAME="execute_scripts_without_network_restriction" VALUE="false"/>
<node TEXT="" ID="ID_325326523" CREATED="1396961418972" MODIFIED="1396961418972"/>
</node>
<node TEXT="newAppWidgetSearch.groovy" ID="ID_243196291" CREATED="1396436451091" MODIFIED="1396609152008">
<attribute_layout NAME_WIDTH="253" VALUE_WIDTH="253"/>
<attribute NAME="menuTitleKey" VALUE="New Appearance Widget Search Node"/>
<attribute NAME="menuLocation" VALUE="/menu_bar/WebsiteConfiguration"/>
<attribute NAME="executionMode" VALUE="on_single_node"/>
<attribute NAME="keyboardShortcut" VALUE=""/>
<attribute NAME="execute_scripts_without_asking" VALUE="true"/>
<attribute NAME="execute_scripts_without_file_restriction" VALUE="true"/>
<attribute NAME="execute_scripts_without_write_restriction" VALUE="false"/>
<attribute NAME="execute_scripts_without_exec_restriction" VALUE="false"/>
<attribute NAME="execute_scripts_without_network_restriction" VALUE="false"/>
<node TEXT="" ID="ID_1922987133" CREATED="1396961418973" MODIFIED="1396961418973"/>
</node>
<node TEXT="newAppWidgetTagCloud.groovy" ID="ID_1630956971" CREATED="1396436451091" MODIFIED="1396609147291">
<attribute_layout NAME_WIDTH="253" VALUE_WIDTH="253"/>
<attribute NAME="menuTitleKey" VALUE="New Appearance Widget TagCloud Node"/>
<attribute NAME="menuLocation" VALUE="/menu_bar/WebsiteConfiguration"/>
<attribute NAME="executionMode" VALUE="on_single_node"/>
<attribute NAME="keyboardShortcut" VALUE=""/>
<attribute NAME="execute_scripts_without_asking" VALUE="true"/>
<attribute NAME="execute_scripts_without_file_restriction" VALUE="true"/>
<attribute NAME="execute_scripts_without_write_restriction" VALUE="false"/>
<attribute NAME="execute_scripts_without_exec_restriction" VALUE="false"/>
<attribute NAME="execute_scripts_without_network_restriction" VALUE="false"/>
<node TEXT="" ID="ID_1583904040" CREATED="1396961418974" MODIFIED="1396961418974"/>
</node>
<node TEXT="newAppWidgetText.groovy" ID="ID_132486041" CREATED="1396436451091" MODIFIED="1396609144150">
<attribute_layout NAME_WIDTH="253" VALUE_WIDTH="253"/>
<attribute NAME="menuTitleKey" VALUE="New Appearance Widget Text Node"/>
<attribute NAME="menuLocation" VALUE="/menu_bar/WebsiteConfiguration"/>
<attribute NAME="executionMode" VALUE="on_single_node"/>
<attribute NAME="keyboardShortcut" VALUE=""/>
<attribute NAME="execute_scripts_without_asking" VALUE="true"/>
<attribute NAME="execute_scripts_without_file_restriction" VALUE="true"/>
<attribute NAME="execute_scripts_without_write_restriction" VALUE="false"/>
<attribute NAME="execute_scripts_without_exec_restriction" VALUE="false"/>
<attribute NAME="execute_scripts_without_network_restriction" VALUE="false"/>
<node TEXT="" ID="ID_529137266" CREATED="1396961418975" MODIFIED="1396961418975"/>
</node>
<node TEXT="launchTransformation.groovy" ID="ID_1379865006" CREATED="1396436451091" MODIFIED="1396957111317">
<attribute_layout NAME_WIDTH="253" VALUE_WIDTH="253"/>
<attribute NAME="menuTitleKey" VALUE="Launch website configuration"/>
<attribute NAME="menuLocation" VALUE="/menu_bar/WebsiteConfiguration"/>
<attribute NAME="executionMode" VALUE="on_single_node"/>
<attribute NAME="keyboardShortcut" VALUE=""/>
<attribute NAME="execute_scripts_without_asking" VALUE="true"/>
<attribute NAME="execute_scripts_without_file_restriction" VALUE="true"/>
<attribute NAME="execute_scripts_without_write_restriction" VALUE="true"/>
<attribute NAME="execute_scripts_without_exec_restriction" VALUE="true"/>
<attribute NAME="execute_scripts_without_network_restriction" VALUE="true"/>
<node TEXT="import groovy.io.FileType&#xd;&#xa;import javax.swing.JOptionPane&#xd;&#xa;import org.freeplane.plugin.script.proxy.Proxy&#xd;&#xa;&#xd;&#xa;try {&#x9;&#xd;&#xa;&#x9;def File xmlFreePlane = node.map.file&#xd;&#xa;&#x9;&#xd;&#xa;&#x9;def String xmlFreePlanePath = xmlFreePlane.path + &quot;.xml&quot;&#xd;&#xa;&#x9;new File(xmlFreePlanePath).bytes = xmlFreePlane.bytes&#xd;&#xa;&#x9;&#xd;&#xa;&#x9;def File jarFile = new File(c.getUserDirectory().toString()+&quot;/scripts/jar/org.inria.wordPress.enduser.xml2wdpConf.freePlane.jar&quot;)&#xd;&#xa;&#x9;def String jarFilePath = jarFile.path&#xd;&#xa;&#x9;&#x9;&#xd;&#xa;&#x9;//def Process p = new ProcessBuilder(&quot;java&quot;, &quot;-jar&quot;, jarFilePath, xmlFreePlanePath).start()&#xd;&#xa;&#x9;def ProcessBuilder procBuild = new ProcessBuilder(&quot;java&quot;, &quot;-jar&quot;, jarFilePath, xmlFreePlanePath)&#xd;&#xa;&#x9;procBuild.redirectErrorStream(true);&#xd;&#xa;    def Process process = procBuild.start();&#xd;&#xa;&#x9;&#xd;&#xa;&#x9;InputStream inputStream = process.getInputStream();&#xd;&#xa;&#x9;OutputStream outputStream = new FileOutputStream(new File(&quot;C:/Users/MALLON/log.freePlane&quot;));&#xd;&#xa;&#xd;&#xa;&#x9;int read = 0;&#xd;&#xa;&#x9;byte[] bytes = new byte[1024];&#xd;&#xa;&#xd;&#xa;&#x9;while ((read = inputStream.read(bytes)) != -1) {&#xd;&#xa;&#x9;&#x9;outputStream.write(bytes, 0, read);&#x9;&#x9;&#xd;&#xa;&#x9;}&#xd;&#xa;&#x9;&#xd;&#xa;&#x9;//Warning : this method is needed because of the limited output : if it is not&#xd;&#xa;&#x9;//consumes, FreePlane freezes.&#xd;&#xa;&#x9;process.consumeProcessOutput()&#xd;&#xa;&#x9;&#x9;&#xd;&#xa;} catch (Exception e) {&#xd;&#xa;&#x9; ui.errorMessage(e.message)&#xd;&#xa;}&#xd;&#xa;&#xd;&#xa;//C:\Users\MALLON\Desktop\WebsiteExperimExampleTest.mm.xml" ID="ID_1474179514" CREATED="1396961418976" MODIFIED="1396961418977"/>
</node>
</node>
<node TEXT="zips" POSITION="right" ID="ID_1621805495" CREATED="1396436302439" MODIFIED="1396948921011" HGAP="80" VSHIFT="-150">
<edge COLOR="#007c00"/>
<richcontent TYPE="NOTE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      An add-on may contain any number of nodes containing zip files.
    </p>
    <p>
      
    </p>
    <p>
      &#160;- The immediate child nodes contain a description of the zip. The devtools script releaseAddOn.groovy allows automatic zip creation if the name of this node matches a directory in the current directory.
    </p>
    <p>
      
    </p>
    <p>
      &#160;- The child nodes of these nodes contain the actual zip files.
    </p>
    <p>
      
    </p>
    <p>
      &#160;- Any zip file will be extracted in the &lt;installationbase&gt;. Currently, &lt;installationbase&gt; is always Freeplane's &lt;userhome&gt;, e.g. ~/.freeplane/1.2.
    </p>
    <p>
      
    </p>
    <p>
      &#160;- The files will be processed in the sequence as seen in the map.
    </p>
    <p>
      
    </p>
    <p>
      &#160;- Zip files must be uploaded into the map via the script <i>Tools-&gt;Scripts-&gt;Insert Binary</i>&#160;since they have to be (base64) encoded as simple strings.
    </p>
  </body>
</html>
</richcontent>
</node>
<node TEXT="images" POSITION="right" ID="ID_1100931022" CREATED="1396436302450" MODIFIED="1396948921016" HGAP="100" VSHIFT="-90">
<edge COLOR="#7c007c"/>
<richcontent TYPE="NOTE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      An add-on may define any number of images as child nodes of the images node. The actual image data has to be placed as base64 encoded binary data into the text of a subnode.
    </p>
    <p>
      The images are saved to the <i>${installationbase}/resources/images</i>&#160;directory.
    </p>
    <p>
      
    </p>
    <p>
      The following images should be present:
    </p>
    <ul>
      <li>
        <i>${name}-icon.png</i>, like <i>oldicons-theme-icon.png</i>. This will be used in the app-on overview.
      </li>
      <li>
        <i>${name}-screenshot-1.png</i>, like <i>oldicons-theme-screenshot-1.png</i>. This will be used in the app-on details dialog. Further images can be included but they are not used yet.
      </li>
    </ul>
    <p>
      Images can be added automatically by releaseAddOn.groovy or must be uploaded into the map via the script <i>Tools-&gt;Scripts-&gt;Insert Binary</i>&#160;since they have to be (base64) encoded as simple strings.
    </p>
  </body>
</html>
</richcontent>
</node>
</node>
</map>
