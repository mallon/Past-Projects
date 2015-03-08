<?xml version="1.0" encoding="UTF-8"?>
<?PowerDesigner AppLocale="UTF16" ID="{C08D5A7D-E3CA-4183-ACDB-471064EF4221}" Label="" LastModificationDate="1397732159" Name="WOCMMSimplified" Objects="104" Symbols="26" Target="Analyse" TargetLink="Reference" Type="{18112060-1A4B-11D1-83D9-444553540000}" signature="CLD_OBJECT_MODEL" version="15.1.0.2850"?>
<!-- Veuillez ne pas modifier ce fichier -->

<Model xmlns:a="attribute" xmlns:c="collection" xmlns:o="object">

<o:RootObject Id="o1">
<c:Children>
<o:Model Id="o2">
<a:ObjectID>C08D5A7D-E3CA-4183-ACDB-471064EF4221</a:ObjectID>
<a:Name>WOCMMSimplified</a:Name>
<a:Code>WOCMMSimplified</a:Code>
<a:CreationDate>1387288459</a:CreationDate>
<a:Creator>MALLON</a:Creator>
<a:ModificationDate>1397645564</a:ModificationDate>
<a:Modifier>MALLON</a:Modifier>
<a:PackageOptionsText>[FolderOptions]

[FolderOptions\Class Diagram Objects]
GenerationCheckModel=Yes
GenerationPath=
GenerationOptions=
GenerationTasks=
GenerationTargets=
GenerationSelections=</a:PackageOptionsText>
<a:ModelOptionsText>[ModelOptions]

[ModelOptions\Cld]
CaseSensitive=No
DisplayName=Yes
EnableTrans=No
EnableRequirements=No
ShowClss=No
DeftAttr=int
DeftMthd=
DeftParm=int
DeftCont=
DomnDttp=Yes
DomnChck=No
DomnRule=No
SupportDelay=No
PreviewEditable=Yes
AutoRealize=No
DttpFullName=Yes
DeftClssAttrVisi=private
VBNetPreprocessingSymbols=
CSharpPreprocessingSymbols=

[ModelOptions\Cld\NamingOptionsTemplates]

[ModelOptions\Cld\ClssNamingOptions]

[ModelOptions\Cld\ClssNamingOptions\CLDPCKG]

[ModelOptions\Cld\ClssNamingOptions\CLDPCKG\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\CLDPCKG\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; +-*/!=&lt;&gt;&#39;&quot;&quot;().&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\CLDDOMN]

[ModelOptions\Cld\ClssNamingOptions\CLDDOMN\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\CLDDOMN\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; +-*/!=&lt;&gt;&#39;&quot;&quot;().&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\CLDCLASS]

[ModelOptions\Cld\ClssNamingOptions\CLDCLASS\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\CLDCLASS\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; +-*/!=&lt;&gt;&#39;&quot;&quot;().&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\CLDINTF]

[ModelOptions\Cld\ClssNamingOptions\CLDINTF\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\CLDINTF\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; +-*/!=&lt;&gt;&#39;&quot;&quot;().&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\UCDACTR]

[ModelOptions\Cld\ClssNamingOptions\UCDACTR\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\UCDACTR\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; +-*/!=&lt;&gt;&#39;&quot;&quot;().&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\UCDUCAS]

[ModelOptions\Cld\ClssNamingOptions\UCDUCAS\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\UCDUCAS\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; +-*/!=&lt;&gt;&#39;&quot;&quot;().&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\SQDOBJT]

[ModelOptions\Cld\ClssNamingOptions\SQDOBJT\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\SQDOBJT\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; +-*/!=&lt;&gt;&#39;&quot;&quot;().&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\SQDMSSG]

[ModelOptions\Cld\ClssNamingOptions\SQDMSSG\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\SQDMSSG\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; +-*/!=&lt;&gt;&#39;&quot;&quot;().&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\CPDCOMP]

[ModelOptions\Cld\ClssNamingOptions\CPDCOMP\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\CPDCOMP\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; +-*/!=&lt;&gt;&#39;&quot;&quot;().&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\CLDATTR]

[ModelOptions\Cld\ClssNamingOptions\CLDATTR\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\CLDATTR\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; +-*/!=&lt;&gt;&#39;&quot;&quot;().&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\CLDMETHOD]

[ModelOptions\Cld\ClssNamingOptions\CLDMETHOD\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\CLDMETHOD\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; +-*/!=&lt;&gt;&#39;&quot;&quot;().&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\CLDPARM]

[ModelOptions\Cld\ClssNamingOptions\CLDPARM\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\CLDPARM\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; +-*/!=&lt;&gt;&#39;&quot;&quot;().&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\OOMPORT]

[ModelOptions\Cld\ClssNamingOptions\OOMPORT\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\OOMPORT\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; +-*/!=&lt;&gt;&#39;&quot;&quot;().&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\OOMPART]

[ModelOptions\Cld\ClssNamingOptions\OOMPART\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\OOMPART\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; +-*/!=&lt;&gt;&#39;&quot;&quot;().&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\CLDASSC]

[ModelOptions\Cld\ClssNamingOptions\CLDASSC\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\CLDASSC\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; +-*/!=&lt;&gt;&#39;&quot;&quot;().&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\UCDASSC]

[ModelOptions\Cld\ClssNamingOptions\UCDASSC\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\UCDASSC\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; +-*/!=&lt;&gt;&#39;&quot;&quot;().&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\GNRLLINK]

[ModelOptions\Cld\ClssNamingOptions\GNRLLINK\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\GNRLLINK\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; +-*/!=&lt;&gt;&#39;&quot;&quot;().&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\RQLINK]

[ModelOptions\Cld\ClssNamingOptions\RQLINK\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\RQLINK\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; +-*/!=&lt;&gt;&#39;&quot;&quot;().&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\RLZSLINK]

[ModelOptions\Cld\ClssNamingOptions\RLZSLINK\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\RLZSLINK\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; +-*/!=&lt;&gt;&#39;&quot;&quot;().&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\DEPDLINK]

[ModelOptions\Cld\ClssNamingOptions\DEPDLINK\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\DEPDLINK\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; +-*/!=&lt;&gt;&#39;&quot;&quot;().&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\OOMACTV]

[ModelOptions\Cld\ClssNamingOptions\OOMACTV\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\OOMACTV\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; +-*/!=&lt;&gt;&#39;&quot;&quot;().&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\ACDOBST]

[ModelOptions\Cld\ClssNamingOptions\ACDOBST\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\ACDOBST\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; +-*/!=&lt;&gt;&#39;&quot;&quot;().&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\STAT]

[ModelOptions\Cld\ClssNamingOptions\STAT\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\STAT\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; +-*/!=&lt;&gt;&#39;&quot;&quot;().&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\DPDNODE]

[ModelOptions\Cld\ClssNamingOptions\DPDNODE\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\DPDNODE\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; +-*/!=&lt;&gt;&#39;&quot;&quot;().&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\DPDCMPI]

[ModelOptions\Cld\ClssNamingOptions\DPDCMPI\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\DPDCMPI\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; +-*/!=&lt;&gt;&#39;&quot;&quot;().&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\DPDASSC]

[ModelOptions\Cld\ClssNamingOptions\DPDASSC\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\DPDASSC\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; +-*/!=&lt;&gt;&#39;&quot;&quot;().&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\OOMVAR]

[ModelOptions\Cld\ClssNamingOptions\OOMVAR\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\OOMVAR\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; +-*/!=&lt;&gt;&#39;&quot;&quot;().&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\FILO]

[ModelOptions\Cld\ClssNamingOptions\FILO\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=&quot;\/:*?&lt;&gt;|&quot;
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\FILO\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_. &quot;
InvldChar=&quot; +-*/!=&lt;&gt;&#39;&quot;&quot;().&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\FRMEOBJ]

[ModelOptions\Cld\ClssNamingOptions\FRMEOBJ\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\FRMEOBJ\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; +-*/!=&lt;&gt;&#39;&quot;&quot;().&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\FRMELNK]

[ModelOptions\Cld\ClssNamingOptions\FRMELNK\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\FRMELNK\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; +-*/!=&lt;&gt;&#39;&quot;&quot;().&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\DefaultClass]

[ModelOptions\Cld\ClssNamingOptions\DefaultClass\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\DefaultClass\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; +-*/!=&lt;&gt;&#39;&quot;&quot;().&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Generate]

[ModelOptions\Generate\Cdm]
CheckModel=Yes
SaveLinks=Yes
NameToCode=No
Notation=2

[ModelOptions\Generate\Pdm]
CheckModel=Yes
SaveLinks=Yes
ORMapping=No
NameToCode=No
BuildTrgr=No
TablePrefix=
RefrUpdRule=RESTRICT
RefrDelRule=RESTRICT
IndxPKName=%TABLE%_PK
IndxAKName=%TABLE%_AK
IndxFKName=%REFR%_FK
IndxThreshold=
ColnFKName=%.3:PARENT%_%COLUMN%
ColnFKNameUse=No

[ModelOptions\Generate\Xsm]
CheckModel=Yes
SaveLinks=Yes
ORMapping=No
NameToCode=No</a:ModelOptionsText>
<c:ObjectLanguage>
<o:Shortcut Id="o3">
<a:ObjectID>AFD387C7-7F2B-4764-95FF-CB317A3BBCB4</a:ObjectID>
<a:Name>Analyse</a:Name>
<a:Code>Analysis</a:Code>
<a:CreationDate>1387288459</a:CreationDate>
<a:Creator>MALLON</a:Creator>
<a:ModificationDate>1387288459</a:ModificationDate>
<a:Modifier>MALLON</a:Modifier>
<a:TargetStereotype/>
<a:TargetID>87317290-AF03-469F-BC1E-99593F18A4AB</a:TargetID>
<a:TargetClassID>1811206C-1A4B-11D1-83D9-444553540000</a:TargetClassID>
</o:Shortcut>
</c:ObjectLanguage>
<c:ClassDiagrams>
<o:ClassDiagram Id="o4">
<a:ObjectID>17D95165-F1A1-49BB-817C-049DB77DE161</a:ObjectID>
<a:Name>WOCMMSimplified</a:Name>
<a:Code>WOCMMSimplified</a:Code>
<a:CreationDate>1387288459</a:CreationDate>
<a:Creator>MALLON</a:Creator>
<a:ModificationDate>1397645564</a:ModificationDate>
<a:Modifier>MALLON</a:Modifier>
<a:DisplayPreferences>[DisplayPreferences]

[DisplayPreferences\CLD]

[DisplayPreferences\General]
Adjust to text=Yes
Snap Grid=No
Constrain Labels=Yes
Display Grid=No
Show Page Delimiter=Yes
Grid size=0
Graphic unit=2
Window color=255, 255, 255
Background image=
Background mode=8
Watermark image=
Watermark mode=8
Show watermark on screen=No
Gradient mode=0
Gradient end color=255, 255, 255
Show Swimlane=No
SwimlaneVert=Yes
TreeVert=No
CompDark=0

[DisplayPreferences\Object]
Mode=2
Trunc Length=40
Word Length=40
Word Text=!&quot;&quot;#$%&amp;&#39;()*+,-./:;&lt;=&gt;?@[\]^_`{|}~
Shortcut IntIcon=Yes
Shortcut IntLoct=Yes
Shortcut IntFullPath=No
Shortcut IntLastPackage=Yes
Shortcut ExtIcon=Yes
Shortcut ExtLoct=No
Shortcut ExtFullPath=No
Shortcut ExtLastPackage=Yes
Shortcut ExtIncludeModl=Yes
EObjShowStrn=Yes
ExtendedObject.Comment=No
ExtendedObject.IconPicture=No
ExtendedObject_SymbolLayout=&lt;Form&gt;[CRLF] &lt;StandardAttribute Name=&quot;Stéréotype&quot; Attribute=&quot;Stereotype&quot; Prefix=&quot;&amp;lt;&amp;lt;&quot; Suffix=&quot;&amp;gt;&amp;gt;&quot; Alignment=&quot;CNTR&quot; Caption=&quot;&quot; Mandatory=&quot;No&quot; /&gt;[CRLF] &lt;StandardAttribute Name=&quot;Nom de l&amp;#39;objet&quot; Attribute=&quot;DisplayName&quot; Prefix=&quot;&quot; Suffix=&quot;&quot; Alignment=&quot;CNTR&quot; Caption=&quot;&quot; Mandatory=&quot;Yes&quot; /&gt;[CRLF] &lt;Separator Name=&quot;Séparateur&quot; /&gt;[CRLF] &lt;StandardAttribute Name=&quot;Commentaire&quot; Attribute=&quot;Comment&quot; Prefix=&quot;&quot; Suffix=&quot;&quot; Alignment=&quot;LEFT&quot; Caption=&quot;&quot; Mandatory=&quot;No&quot; /&gt;[CRLF] &lt;StandardAttribute Name=&quot;Icône&quot; Attribute=&quot;IconPicture&quot; Prefix=&quot;&quot; Suffix=&quot;&quot; Alignment=&quot;CNTR&quot; Caption=&quot;&quot; Mandatory=&quot;Yes&quot; /&gt;[CRLF]&lt;/Form&gt;
ELnkShowStrn=Yes
ELnkShowName=Yes
ExtendedLink_SymbolLayout=&lt;Form&gt;[CRLF] &lt;Form Name=&quot;Centre&quot; &gt;[CRLF]  &lt;StandardAttribute Name=&quot;Stéréotype&quot; Attribute=&quot;Stereotype&quot; Prefix=&quot;&amp;lt;&amp;lt;&quot; Suffix=&quot;&amp;gt;&amp;gt;&quot; Caption=&quot;&quot; Mandatory=&quot;No&quot; /&gt;[CRLF]  &lt;StandardAttribute Name=&quot;Nom&quot; Attribute=&quot;DisplayName&quot; Prefix=&quot;&quot; Suffix=&quot;&quot; Caption=&quot;&quot; Mandatory=&quot;No&quot; /&gt;[CRLF] &lt;/Form&gt;[CRLF] &lt;Form Name=&quot;Source&quot; &gt;[CRLF] &lt;/Form&gt;[CRLF] &lt;Form Name=&quot;Destination&quot; &gt;[CRLF] &lt;/Form&gt;[CRLF]&lt;/Form&gt;
FileObject.Stereotype=No
FileObject.DisplayName=Yes
FileObject.LocationOrName=No
FileObject.IconPicture=No
FileObject.IconMode=Yes
FileObject_SymbolLayout=&lt;Form&gt;[CRLF] &lt;StandardAttribute Name=&quot;Stéréotype&quot; Attribute=&quot;Stereotype&quot; Prefix=&quot;&amp;lt;&amp;lt;&quot; Suffix=&quot;&amp;gt;&amp;gt;&quot; Alignment=&quot;CNTR&quot; Caption=&quot;&quot; Mandatory=&quot;No&quot; /&gt;[CRLF] &lt;ExclusiveChoice Name=&quot;Choix exclusif&quot; Mandatory=&quot;Yes&quot; Display=&quot;HorizontalRadios&quot; &gt;[CRLF]  &lt;StandardAttribute Name=&quot;Nom&quot; Attribute=&quot;DisplayName&quot; Prefix=&quot;&quot; Suffix=&quot;&quot; Alignment=&quot;CNTR&quot; Caption=&quot;&quot; Mandatory=&quot;No&quot; /&gt;[CRLF]  &lt;StandardAttribute Name=&quot;Emplacement&quot; Attribute=&quot;LocationOrName&quot; Prefix=&quot;&quot; Suffix=&quot;&quot; Alignment=&quot;CNTR&quot; Caption=&quot;&quot; Mandatory=&quot;No&quot; /&gt;[CRLF] &lt;/ExclusiveChoice&gt;[CRLF] &lt;StandardAttribute Name=&quot;Icône&quot; Attribute=&quot;IconPicture&quot; Prefix=&quot;&quot; Suffix=&quot;&quot; Alignment=&quot;CNTR&quot; Caption=&quot;&quot; Mandatory=&quot;Yes&quot; /&gt;[CRLF]&lt;/Form&gt;
PckgShowStrn=Yes
Package.Comment=No
Package.IconPicture=No
Package_SymbolLayout=
Display Model Version=Yes
Class.IconPicture=No
Class_SymbolLayout=
Interface.IconPicture=No
Interface_SymbolLayout=
Port.IconPicture=No
Port_SymbolLayout=
ClssShowSttr=Yes
Class.Comment=No
ClssShowCntr=Yes
ClssShowAttr=Yes
ClssAttrTrun=No
ClssAttrMax=3
ClssShowMthd=Yes
ClssMthdTrun=No
ClssMthdMax=3
ClssShowInnr=Yes
IntfShowSttr=Yes
Interface.Comment=No
IntfShowAttr=Yes
IntfAttrTrun=No
IntfAttrMax=3
IntfShowMthd=Yes
IntfMthdTrun=No
IntfMthdMax=3
IntfShowCntr=Yes
IntfShowInnr=Yes
PortShowName=Yes
PortShowType=No
PortShowMult=No
AttrShowVisi=Yes
AttrVisiFmt=1
AttrShowStrn=Yes
AttrShowDttp=Yes
AttrShowDomn=No
AttrShowInit=Yes
MthdShowVisi=Yes
MthdVisiFmt=1
MthdShowStrn=Yes
MthdShowRttp=Yes
MthdShowParm=Yes
AsscShowName=No
AsscShowCntr=Yes
AsscShowRole=Yes
AsscShowOrdr=Yes
AsscShowMult=Yes
AsscMultStr=Yes
AsscShowStrn=No
GnrlShowName=No
GnrlShowStrn=Yes
GnrlShowCntr=Yes
RlzsShowName=No
RlzsShowStrn=Yes
RlzsShowCntr=Yes
DepdShowName=No
DepdShowStrn=Yes
DepdShowCntr=Yes
RqlkShowName=No
RqlkShowStrn=Yes
RqlkShowCntr=Yes

[DisplayPreferences\Symbol]

[DisplayPreferences\Symbol\FRMEOBJ]
STRNFont=Arial,8,N
STRNFont color=0, 0, 0
DISPNAMEFont=Arial,8,N
DISPNAMEFont color=0, 0, 0
LABLFont=Arial,8,N
LABLFont color=0, 0, 0
AutoAdjustToText=Yes
Keep aspect=No
Keep center=No
Keep size=No
Width=6000
Height=2000
Brush color=255 255 255
Fill Color=Yes
Brush style=6
Brush bitmap mode=12
Brush gradient mode=64
Brush gradient color=192 192 192
Brush background image=
Custom shape=
Custom text mode=0
Pen=1 0 255 128 128
Shadow color=192 192 192
Shadow=0

[DisplayPreferences\Symbol\FRMELNK]
CENTERFont=Arial,8,N
CENTERFont color=0, 0, 0
Line style=2
AutoAdjustToText=Yes
Keep aspect=No
Keep center=No
Keep size=No
Brush color=255 255 255
Fill Color=Yes
Brush style=1
Brush bitmap mode=12
Brush gradient mode=0
Brush gradient color=118 118 118
Brush background image=
Custom shape=
Custom text mode=0
Pen=1 0 128 128 255
Shadow color=192 192 192
Shadow=0

[DisplayPreferences\Symbol\FILO]
OBJSTRNFont=Arial,8,N
OBJSTRNFont color=0, 0, 0
DISPNAMEFont=Arial,8,N
DISPNAMEFont color=0, 0, 0
LCNMFont=Arial,8,N
LCNMFont color=0, 0, 0
AutoAdjustToText=Yes
Keep aspect=Yes
Keep center=Yes
Keep size=No
Width=2400
Height=2400
Brush color=255 255 255
Fill Color=No
Brush style=1
Brush bitmap mode=12
Brush gradient mode=0
Brush gradient color=118 118 118
Brush background image=
Custom shape=
Custom text mode=0
Pen=1 0 0 0 255
Shadow color=192 192 192
Shadow=-1

[DisplayPreferences\Symbol\CLDPCKG]
STRNFont=Arial,8,N
STRNFont color=0 0 0
DISPNAMEFont=Arial,8,N
DISPNAMEFont color=0 0 0
LABLFont=Arial,8,N
LABLFont color=0 0 0
AutoAdjustToText=Yes
Keep aspect=No
Keep center=No
Keep size=No
Width=4800
Height=3600
Brush color=255 255 192
Fill Color=Yes
Brush style=6
Brush bitmap mode=12
Brush gradient mode=65
Brush gradient color=255 255 255
Brush background image=
Custom shape=
Custom text mode=0
Pen=1 0 178 178 178
Shadow color=192 192 192
Shadow=0

[DisplayPreferences\Symbol\CLDCLASS]
STRNFont=Arial,8,N
STRNFont color=0 0 0
DISPNAMEFont=Arial,8,N
DISPNAMEFont color=0 0 0
CNTRFont=Arial,8,N
CNTRFont color=0 0 0
AttributesFont=Arial,8,N
AttributesFont color=0 0 0
ClassPrimaryAttributeFont=Arial,8,U
ClassPrimaryAttributeFont color=0 0 0
OperationsFont=Arial,8,N
OperationsFont color=0 0 0
InnerClassifiersFont=Arial,8,N
InnerClassifiersFont color=0 0 0
LABLFont=Arial,8,N
LABLFont color=0 0 0
AutoAdjustToText=Yes
Keep aspect=No
Keep center=No
Keep size=No
Width=4800
Height=3600
Brush color=233 202 131
Fill Color=Yes
Brush style=6
Brush bitmap mode=12
Brush gradient mode=65
Brush gradient color=255 255 255
Brush background image=
Custom shape=
Custom text mode=0
Pen=1 0 128 0 0
Shadow color=192 192 192
Shadow=0

[DisplayPreferences\Symbol\CLDINTF]
STRNFont=Arial,8,N
STRNFont color=0 0 0
DISPNAMEFont=Arial,8,N
DISPNAMEFont color=0 0 0
CNTRFont=Arial,8,N
CNTRFont color=0 0 0
AttributesFont=Arial,8,N
AttributesFont color=0 0 0
OperationsFont=Arial,8,N
OperationsFont color=0 0 0
InnerClassifiersFont=Arial,8,N
InnerClassifiersFont color=0 0 0
LABLFont=Arial,8,N
LABLFont color=0 0 0
AutoAdjustToText=Yes
Keep aspect=No
Keep center=No
Keep size=No
Width=4800
Height=3600
Brush color=205 156 156
Fill Color=Yes
Brush style=6
Brush bitmap mode=12
Brush gradient mode=65
Brush gradient color=255 255 255
Brush background image=
Custom shape=
Custom text mode=0
Pen=1 0 128 0 0
Shadow color=192 192 192
Shadow=0

[DisplayPreferences\Symbol\OOMPORT]
DISPNAMEFont=Arial,8,N
DISPNAMEFont color=0 0 0
AutoAdjustToText=No
Keep aspect=No
Keep center=No
Keep size=No
Width=825
Height=800
Brush color=250 241 211
Fill Color=Yes
Brush style=6
Brush bitmap mode=12
Brush gradient mode=65
Brush gradient color=255 255 255
Brush background image=
Custom shape=
Custom text mode=0
Pen=1 0 128 64 0
Shadow color=192 192 192
Shadow=0

[DisplayPreferences\Symbol\CLDASSC]
DISPNAMEFont=Arial,8,N
DISPNAMEFont color=0 0 0
MULAFont=Arial,8,N
MULAFont color=0 0 0
Line style=2
Pen=1 0 128 0 64
Shadow color=192 192 192
Shadow=0

[DisplayPreferences\Symbol\INNERLINK]
Line style=2
Pen=1 0 128 0 64
Shadow color=192 192 192
Shadow=0

[DisplayPreferences\Symbol\CLDACLK]
Line style=2
Pen=2 0 128 0 64
Shadow color=192 192 192
Shadow=0

[DisplayPreferences\Symbol\GNRLLINK]
DISPNAMEFont=Arial,8,N
DISPNAMEFont color=0 0 0
Line style=2
Pen=1 0 128 0 64
Shadow color=192 192 192
Shadow=0

[DisplayPreferences\Symbol\RLZSLINK]
DISPNAMEFont=Arial,8,N
DISPNAMEFont color=0 0 0
Line style=2
Pen=3 0 128 0 64
Shadow color=192 192 192
Shadow=0

[DisplayPreferences\Symbol\RQLINK]
DISPNAMEFont=Arial,8,N
DISPNAMEFont color=0 0 0
Line style=2
Pen=1 0 128 0 64
Shadow color=192 192 192
Shadow=0

[DisplayPreferences\Symbol\DEPDLINK]
DISPNAMEFont=Arial,8,N
DISPNAMEFont color=0 0 0
Line style=2
Pen=2 0 128 0 64
Shadow color=192 192 192
Shadow=0

[DisplayPreferences\Symbol\USRDEPD]
OBJXSTRFont=Arial,8,N
OBJXSTRFont color=0 0 0
Line style=2
AutoAdjustToText=Yes
Keep aspect=No
Keep center=No
Keep size=No
Brush color=255 255 255
Fill Color=Yes
Brush style=1
Brush bitmap mode=12
Brush gradient mode=0
Brush gradient color=118 118 118
Brush background image=
Custom shape=
Custom text mode=0
Pen=2 0 128 0 64
Shadow color=192 192 192
Shadow=0

[DisplayPreferences\Symbol\Free Symbol]
Free TextFont=Arial,8,N
Free TextFont color=0 0 0
Line style=2
AutoAdjustToText=Yes
Keep aspect=No
Keep center=No
Keep size=No
Brush color=255 255 255
Fill Color=Yes
Brush style=1
Brush bitmap mode=12
Brush gradient mode=0
Brush gradient color=118 118 118
Brush background image=
Custom shape=
Custom text mode=0
Pen=1 0 128 64 0
Shadow color=192 192 192
Shadow=0</a:DisplayPreferences>
<a:PaperSize>(8268, 11693)</a:PaperSize>
<a:PageMargins>((315,354), (433,354))</a:PageMargins>
<a:PageOrientation>1</a:PageOrientation>
<a:PaperSource>7</a:PaperSource>
<c:Symbols>
<o:AssociationSymbol Id="o5">
<a:CreationDate>1387290349</a:CreationDate>
<a:ModificationDate>1397732159</a:ModificationDate>
<a:DestinationTextOffset>(-188, 962)</a:DestinationTextOffset>
<a:Rect>((-50105,-6210), (-20814,-500))</a:Rect>
<a:ListOfPoints>((-20814,-501),(-37562,-501),(-37562,-6210),(-50105,-6210))</a:ListOfPoints>
<a:CornerStyle>2</a:CornerStyle>
<a:ArrowStyle>3584</a:ArrowStyle>
<a:LineColor>0</a:LineColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>DISPNAME 0 Arial,8,N
MULA 0 Arial,8,N</a:FontList>
<c:SourceSymbol>
<o:ClassSymbol Ref="o6"/>
</c:SourceSymbol>
<c:DestinationSymbol>
<o:ClassSymbol Ref="o7"/>
</c:DestinationSymbol>
<c:Object>
<o:Association Ref="o8"/>
</c:Object>
</o:AssociationSymbol>
<o:AssociationSymbol Id="o9">
<a:CreationDate>1387290496</a:CreationDate>
<a:ModificationDate>1397732159</a:ModificationDate>
<a:Rect>((-20060,-6857), (9141,-4619))</a:Rect>
<a:ListOfPoints>((-20060,-5794),(-8596,-5794),(-8596,-5784),(9141,-5784))</a:ListOfPoints>
<a:CornerStyle>2</a:CornerStyle>
<a:ArrowStyle>3584</a:ArrowStyle>
<a:LineColor>0</a:LineColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>DISPNAME 0 Arial,8,N
MULA 0 Arial,8,N</a:FontList>
<c:SourceSymbol>
<o:ClassSymbol Ref="o6"/>
</c:SourceSymbol>
<c:DestinationSymbol>
<o:ClassSymbol Ref="o10"/>
</c:DestinationSymbol>
<c:Object>
<o:Association Ref="o11"/>
</c:Object>
</o:AssociationSymbol>
<o:AssociationSymbol Id="o12">
<a:CreationDate>1387290498</a:CreationDate>
<a:ModificationDate>1397732159</a:ModificationDate>
<a:DestinationTextOffset>(-188, 887)</a:DestinationTextOffset>
<a:Rect>((-44752,-1701), (-32685,11685))</a:Rect>
<a:ListOfPoints>((-32685,-528),(-37607,-528),(-37607,10211),(-44752,10211))</a:ListOfPoints>
<a:CornerStyle>2</a:CornerStyle>
<a:ArrowStyle>3584</a:ArrowStyle>
<a:LineColor>0</a:LineColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>DISPNAME 0 Arial,8,N
MULA 0 Arial,8,N</a:FontList>
<c:SourceSymbol>
<o:ClassSymbol Ref="o6"/>
</c:SourceSymbol>
<c:DestinationSymbol>
<o:ClassSymbol Ref="o13"/>
</c:DestinationSymbol>
<c:Object>
<o:Association Ref="o14"/>
</c:Object>
</o:AssociationSymbol>
<o:AssociationSymbol Id="o15">
<a:CreationDate>1387290503</a:CreationDate>
<a:ModificationDate>1397732159</a:ModificationDate>
<a:DestinationTextOffset>(-113, 962)</a:DestinationTextOffset>
<a:Rect>((-42798,-1661), (-29293,1031))</a:Rect>
<a:ListOfPoints>((-29293,-488),(-36663,-488),(-36663,-519),(-42798,-519))</a:ListOfPoints>
<a:CornerStyle>2</a:CornerStyle>
<a:ArrowStyle>3584</a:ArrowStyle>
<a:LineColor>0</a:LineColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>DISPNAME 0 Arial,8,N
MULA 0 Arial,8,N</a:FontList>
<c:SourceSymbol>
<o:ClassSymbol Ref="o6"/>
</c:SourceSymbol>
<c:DestinationSymbol>
<o:ClassSymbol Ref="o16"/>
</c:DestinationSymbol>
<c:Object>
<o:Association Ref="o17"/>
</c:Object>
</o:AssociationSymbol>
<o:AssociationSymbol Id="o18">
<a:CreationDate>1387292217</a:CreationDate>
<a:ModificationDate>1397732159</a:ModificationDate>
<a:DestinationTextOffset>(-1538, -62)</a:DestinationTextOffset>
<a:Rect>((-30047,-8833), (5298,-7010))</a:Rect>
<a:ListOfPoints>((-30047,-8185),(5298,-8185))</a:ListOfPoints>
<a:CornerStyle>2</a:CornerStyle>
<a:ArrowStyle>8</a:ArrowStyle>
<a:LineColor>0</a:LineColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>DISPNAME 0 Arial,8,N
MULA 0 Arial,8,N</a:FontList>
<c:SourceSymbol>
<o:ClassSymbol Ref="o6"/>
</c:SourceSymbol>
<c:DestinationSymbol>
<o:ClassSymbol Ref="o10"/>
</c:DestinationSymbol>
<c:Object>
<o:Association Ref="o19"/>
</c:Object>
</o:AssociationSymbol>
<o:AssociationSymbol Id="o20">
<a:CreationDate>1390825115</a:CreationDate>
<a:ModificationDate>1397732159</a:ModificationDate>
<a:Rect>((-1744,-25837), (3955,-21223))</a:Rect>
<a:ListOfPoints>((-1707,-22597),(-1707,-25837),(2118,-25837),(2118,-21223))</a:ListOfPoints>
<a:CornerStyle>2</a:CornerStyle>
<a:ArrowStyle>3584</a:ArrowStyle>
<a:LineColor>0</a:LineColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>DISPNAME 0 Arial,8,N
MULA 0 Arial,8,N</a:FontList>
<c:SourceSymbol>
<o:ClassSymbol Ref="o21"/>
</c:SourceSymbol>
<c:DestinationSymbol>
<o:ClassSymbol Ref="o21"/>
</c:DestinationSymbol>
<c:Object>
<o:Association Ref="o22"/>
</c:Object>
</o:AssociationSymbol>
<o:AssociationSymbol Id="o23">
<a:CreationDate>1397643950</a:CreationDate>
<a:ModificationDate>1397732159</a:ModificationDate>
<a:DestinationTextOffset>(-188, 812)</a:DestinationTextOffset>
<a:Rect>((-42022,-1673), (-30133,19299))</a:Rect>
<a:ListOfPoints>((-30133,-500),(-37612,-500),(-37612,17900),(-42022,17900))</a:ListOfPoints>
<a:CornerStyle>2</a:CornerStyle>
<a:ArrowStyle>3584</a:ArrowStyle>
<a:LineColor>0</a:LineColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>DISPNAME 0 Arial,8,N
MULA 0 Arial,8,N</a:FontList>
<c:SourceSymbol>
<o:ClassSymbol Ref="o6"/>
</c:SourceSymbol>
<c:DestinationSymbol>
<o:ClassSymbol Ref="o24"/>
</c:DestinationSymbol>
<c:Object>
<o:Association Ref="o25"/>
</c:Object>
</o:AssociationSymbol>
<o:AssociationSymbol Id="o26">
<a:CreationDate>1397644147</a:CreationDate>
<a:ModificationDate>1397732159</a:ModificationDate>
<a:SourceTextOffset>(1687, -287)</a:SourceTextOffset>
<a:DestinationTextOffset>(-1462, -163)</a:DestinationTextOffset>
<a:Rect>((-33611,-17088), (-16600,-9425))</a:Rect>
<a:ListOfPoints>((-19299,-9425),(-19299,-13650),(-31212,-13650),(-31212,-17088))</a:ListOfPoints>
<a:CornerStyle>2</a:CornerStyle>
<a:ArrowStyle>3584</a:ArrowStyle>
<a:LineColor>0</a:LineColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>DISPNAME 0 Arial,8,N
MULA 0 Arial,8,N</a:FontList>
<c:SourceSymbol>
<o:ClassSymbol Ref="o6"/>
</c:SourceSymbol>
<c:DestinationSymbol>
<o:ClassSymbol Ref="o27"/>
</c:DestinationSymbol>
<c:Object>
<o:Association Ref="o28"/>
</c:Object>
</o:AssociationSymbol>
<o:AssociationSymbol Id="o29">
<a:CreationDate>1397644303</a:CreationDate>
<a:ModificationDate>1397732159</a:ModificationDate>
<a:SourceTextOffset>(1612, -312)</a:SourceTextOffset>
<a:DestinationTextOffset>(1388, 12)</a:DestinationTextOffset>
<a:Rect>((-19619,-19650), (-16690,-8150))</a:Rect>
<a:ListOfPoints>((-19314,-8150),(-19314,-13160),(-19224,-13160),(-19224,-19650))</a:ListOfPoints>
<a:CornerStyle>2</a:CornerStyle>
<a:ArrowStyle>3584</a:ArrowStyle>
<a:LineColor>0</a:LineColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>DISPNAME 0 Arial,8,N
MULA 0 Arial,8,N</a:FontList>
<c:SourceSymbol>
<o:ClassSymbol Ref="o6"/>
</c:SourceSymbol>
<c:DestinationSymbol>
<o:ClassSymbol Ref="o30"/>
</c:DestinationSymbol>
<c:Object>
<o:Association Ref="o31"/>
</c:Object>
</o:AssociationSymbol>
<o:AssociationSymbol Id="o32">
<a:CreationDate>1397644371</a:CreationDate>
<a:ModificationDate>1397732159</a:ModificationDate>
<a:SourceTextOffset>(1612, -287)</a:SourceTextOffset>
<a:Rect>((-19299,-18675), (1450,-9050))</a:Rect>
<a:ListOfPoints>((-19299,-9050),(-19299,-13650),(1413,-13650),(1413,-18675))</a:ListOfPoints>
<a:CornerStyle>2</a:CornerStyle>
<a:ArrowStyle>3584</a:ArrowStyle>
<a:LineColor>0</a:LineColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>DISPNAME 0 Arial,8,N
MULA 0 Arial,8,N</a:FontList>
<c:SourceSymbol>
<o:ClassSymbol Ref="o6"/>
</c:SourceSymbol>
<c:DestinationSymbol>
<o:ClassSymbol Ref="o21"/>
</c:DestinationSymbol>
<c:Object>
<o:Association Ref="o33"/>
</c:Object>
</o:AssociationSymbol>
<o:AssociationSymbol Id="o34">
<a:CreationDate>1397644375</a:CreationDate>
<a:ModificationDate>1397732159</a:ModificationDate>
<a:SourceTextOffset>(1687, -362)</a:SourceTextOffset>
<a:Rect>((-49799,-17700), (-16600,-8675))</a:Rect>
<a:ListOfPoints>((-19299,-8675),(-19299,-13650),(-47962,-13650),(-47962,-17700))</a:ListOfPoints>
<a:CornerStyle>2</a:CornerStyle>
<a:ArrowStyle>3584</a:ArrowStyle>
<a:LineColor>0</a:LineColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>DISPNAME 0 Arial,8,N
MULA 0 Arial,8,N</a:FontList>
<c:SourceSymbol>
<o:ClassSymbol Ref="o6"/>
</c:SourceSymbol>
<c:DestinationSymbol>
<o:ClassSymbol Ref="o35"/>
</c:DestinationSymbol>
<c:Object>
<o:Association Ref="o36"/>
</c:Object>
</o:AssociationSymbol>
<o:AssociationSymbol Id="o37">
<a:CreationDate>1397645469</a:CreationDate>
<a:ModificationDate>1397732159</a:ModificationDate>
<a:SourceTextOffset>(-1612, -538)</a:SourceTextOffset>
<a:DestinationTextOffset>(1012, 313)</a:DestinationTextOffset>
<a:Rect>((-25011,5400), (-20363,11775))</a:Rect>
<a:ListOfPoints>((-22387,5400),(-22387,11775))</a:ListOfPoints>
<a:CornerStyle>2</a:CornerStyle>
<a:ArrowStyle>3584</a:ArrowStyle>
<a:LineColor>0</a:LineColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>DISPNAME 0 Arial,8,N
MULA 0 Arial,8,N</a:FontList>
<c:SourceSymbol>
<o:ClassSymbol Ref="o6"/>
</c:SourceSymbol>
<c:DestinationSymbol>
<o:ClassSymbol Ref="o38"/>
</c:DestinationSymbol>
<c:Object>
<o:Association Ref="o39"/>
</c:Object>
</o:AssociationSymbol>
<o:AssociationSymbol Id="o40">
<a:CreationDate>1397645564</a:CreationDate>
<a:ModificationDate>1397732159</a:ModificationDate>
<a:Rect>((-12262,1875), (-1575,14325))</a:Rect>
<a:ListOfPoints>((-12262,1875),(-3412,1875),(-3412,14325))</a:ListOfPoints>
<a:CornerStyle>2</a:CornerStyle>
<a:ArrowStyle>3584</a:ArrowStyle>
<a:LineColor>0</a:LineColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>DISPNAME 0 Arial,8,N
MULA 0 Arial,8,N</a:FontList>
<c:SourceSymbol>
<o:ClassSymbol Ref="o6"/>
</c:SourceSymbol>
<c:DestinationSymbol>
<o:ClassSymbol Ref="o41"/>
</c:DestinationSymbol>
<c:Object>
<o:Association Ref="o42"/>
</c:Object>
</o:AssociationSymbol>
<o:ClassSymbol Id="o6">
<a:CreationDate>1387289825</a:CreationDate>
<a:ModificationDate>1397732159</a:ModificationDate>
<a:IconMode>-1</a:IconMode>
<a:Rect>((-33701,-10100), (-10087,6070))</a:Rect>
<a:AutoAdjustToText>0</a:AutoAdjustToText>
<a:LineColor>0</a:LineColor>
<a:FillColor>15395562</a:FillColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>STRN 0 Arial,8,N
DISPNAME 0 Arial,11,N
CNTR 0 Arial,8,N
Attributes 0 Arial,11,N
ClassPrimaryAttribute 0 Arial,8,U
Operations 0 Arial,8,N
InnerClassifiers 0 Arial,8,N
LABL 0 Arial,8,N</a:FontList>
<a:ManuallyResized>1</a:ManuallyResized>
<c:Object>
<o:Class Ref="o43"/>
</c:Object>
</o:ClassSymbol>
<o:ClassSymbol Id="o38">
<a:CreationDate>1387289825</a:CreationDate>
<a:ModificationDate>1397732159</a:ModificationDate>
<a:IconMode>-1</a:IconMode>
<a:Rect>((-33745,9324), (-9987,21888))</a:Rect>
<a:AutoAdjustToText>0</a:AutoAdjustToText>
<a:LineColor>0</a:LineColor>
<a:FillColor>15395562</a:FillColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>STRN 0 Arial,8,N
DISPNAME 0 Arial,11,N
CNTR 0 Arial,8,N
Attributes 0 Arial,11,N
ClassPrimaryAttribute 0 Arial,8,U
Operations 0 Arial,8,N
InnerClassifiers 0 Arial,8,N
LABL 0 Arial,8,N</a:FontList>
<a:ManuallyResized>1</a:ManuallyResized>
<c:Object>
<o:Class Ref="o44"/>
</c:Object>
</o:ClassSymbol>
<o:ClassSymbol Id="o10">
<a:CreationDate>1387289880</a:CreationDate>
<a:ModificationDate>1397732159</a:ModificationDate>
<a:IconMode>-1</a:IconMode>
<a:Rect>((-688,-10089), (10588,5463))</a:Rect>
<a:AutoAdjustToText>0</a:AutoAdjustToText>
<a:LineColor>0</a:LineColor>
<a:FillColor>15395562</a:FillColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>STRN 0 Arial,11,N
DISPNAME 0 Arial,11,N
CNTR 0 Arial,8,N
Attributes 0 Arial,11,N
ClassPrimaryAttribute 0 Arial,8,U
Operations 0 Arial,8,N
InnerClassifiers 0 Arial,8,N
LABL 0 Arial,8,N</a:FontList>
<a:ManuallyResized>1</a:ManuallyResized>
<c:Object>
<o:Class Ref="o45"/>
</c:Object>
</o:ClassSymbol>
<o:ClassSymbol Id="o24">
<a:CreationDate>1387289880</a:CreationDate>
<a:ModificationDate>1397732159</a:ModificationDate>
<a:IconMode>-1</a:IconMode>
<a:Rect>((-57211,15300), (-39487,21936))</a:Rect>
<a:AutoAdjustToText>0</a:AutoAdjustToText>
<a:LineColor>0</a:LineColor>
<a:FillColor>15395562</a:FillColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>STRN 0 Arial,8,N
DISPNAME 0 Arial,11,N
CNTR 0 Arial,8,N
Attributes 0 Arial,11,N
ClassPrimaryAttribute 0 Arial,8,U
Operations 0 Arial,8,N
InnerClassifiers 0 Arial,8,N
LABL 0 Arial,8,N</a:FontList>
<a:ManuallyResized>1</a:ManuallyResized>
<c:Object>
<o:Class Ref="o46"/>
</c:Object>
</o:ClassSymbol>
<o:ClassSymbol Id="o41">
<a:CreationDate>1387289880</a:CreationDate>
<a:ModificationDate>1397732159</a:ModificationDate>
<a:IconMode>-1</a:IconMode>
<a:Rect>((-6411,12899), (10487,21915))</a:Rect>
<a:AutoAdjustToText>0</a:AutoAdjustToText>
<a:LineColor>0</a:LineColor>
<a:FillColor>15395562</a:FillColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>STRN 0 Arial,8,N
DISPNAME 0 Arial,11,N
CNTR 0 Arial,8,N
Attributes 0 Arial,11,N
ClassPrimaryAttribute 0 Arial,8,U
Operations 0 Arial,8,N
InnerClassifiers 0 Arial,8,N
LABL 0 Arial,8,N</a:FontList>
<a:ManuallyResized>1</a:ManuallyResized>
<c:Object>
<o:Class Ref="o47"/>
</c:Object>
</o:ClassSymbol>
<o:ClassSymbol Id="o13">
<a:CreationDate>1387289880</a:CreationDate>
<a:ModificationDate>1397732159</a:ModificationDate>
<a:IconMode>-1</a:IconMode>
<a:Rect>((-57286,6651), (-39562,13415))</a:Rect>
<a:AutoAdjustToText>0</a:AutoAdjustToText>
<a:LineColor>0</a:LineColor>
<a:FillColor>15395562</a:FillColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>STRN 0 Arial,8,N
DISPNAME 0 Arial,11,N
CNTR 0 Arial,8,N
Attributes 0 Arial,11,N
ClassPrimaryAttribute 0 Arial,8,U
Operations 0 Arial,8,N
InnerClassifiers 0 Arial,8,N
LABL 0 Arial,8,N</a:FontList>
<a:ManuallyResized>1</a:ManuallyResized>
<c:Object>
<o:Class Ref="o48"/>
</c:Object>
</o:ClassSymbol>
<o:ClassSymbol Id="o16">
<a:CreationDate>1387289880</a:CreationDate>
<a:ModificationDate>1397732159</a:ModificationDate>
<a:IconMode>-1</a:IconMode>
<a:Rect>((-57362,-1650), (-39626,4918))</a:Rect>
<a:AutoAdjustToText>0</a:AutoAdjustToText>
<a:LineColor>0</a:LineColor>
<a:FillColor>15395562</a:FillColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>STRN 0 Arial,8,N
DISPNAME 0 Arial,11,N
CNTR 0 Arial,8,N
Attributes 0 Arial,11,N
ClassPrimaryAttribute 0 Arial,8,U
Operations 0 Arial,8,N
InnerClassifiers 0 Arial,8,N
LABL 0 Arial,8,N</a:FontList>
<a:ManuallyResized>1</a:ManuallyResized>
<c:Object>
<o:Class Ref="o49"/>
</c:Object>
</o:ClassSymbol>
<o:ClassSymbol Id="o7">
<a:CreationDate>1387289880</a:CreationDate>
<a:ModificationDate>1397732159</a:ModificationDate>
<a:IconMode>-1</a:IconMode>
<a:Rect>((-57437,-10100), (-39711,-3358))</a:Rect>
<a:AutoAdjustToText>0</a:AutoAdjustToText>
<a:LineColor>0</a:LineColor>
<a:FillColor>15395562</a:FillColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>STRN 0 Arial,11,N
DISPNAME 0 Arial,11,N
CNTR 0 Arial,8,N
Attributes 0 Arial,11,N
ClassPrimaryAttribute 0 Arial,8,U
Operations 0 Arial,8,N
InnerClassifiers 0 Arial,8,N
LABL 0 Arial,8,N</a:FontList>
<a:ManuallyResized>1</a:ManuallyResized>
<c:Object>
<o:Class Ref="o50"/>
</c:Object>
</o:ClassSymbol>
<o:ClassSymbol Id="o27">
<a:CreationDate>1387289880</a:CreationDate>
<a:ModificationDate>1397732159</a:ModificationDate>
<a:IconMode>-1</a:IconMode>
<a:Rect>((-37812,-22949), (-28218,-16177))</a:Rect>
<a:AutoAdjustToText>0</a:AutoAdjustToText>
<a:LineColor>0</a:LineColor>
<a:FillColor>15395562</a:FillColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>STRN 0 Arial,8,N
DISPNAME 0 Arial,11,N
CNTR 0 Arial,8,N
Attributes 0 Arial,11,N
ClassPrimaryAttribute 0 Arial,8,U
Operations 0 Arial,8,N
InnerClassifiers 0 Arial,8,N
LABL 0 Arial,8,N</a:FontList>
<a:ManuallyResized>1</a:ManuallyResized>
<c:Object>
<o:Class Ref="o51"/>
</c:Object>
</o:ClassSymbol>
<o:ClassSymbol Id="o30">
<a:CreationDate>1387290115</a:CreationDate>
<a:ModificationDate>1397732159</a:ModificationDate>
<a:IconMode>-1</a:IconMode>
<a:Rect>((-24407,-22950), (-11737,-16222))</a:Rect>
<a:AutoAdjustToText>0</a:AutoAdjustToText>
<a:LineColor>0</a:LineColor>
<a:FillColor>15395562</a:FillColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>STRN 0 Arial,8,N
DISPNAME 0 Arial,11,N
CNTR 0 Arial,8,N
Attributes 0 Arial,11,N
ClassPrimaryAttribute 0 Arial,8,U
Operations 0 Arial,8,N
InnerClassifiers 0 Arial,8,N
LABL 0 Arial,8,N</a:FontList>
<a:ManuallyResized>1</a:ManuallyResized>
<c:Object>
<o:Class Ref="o52"/>
</c:Object>
</o:ClassSymbol>
<o:ClassSymbol Id="o35">
<a:CreationDate>1387290169</a:CreationDate>
<a:ModificationDate>1397732159</a:ModificationDate>
<a:IconMode>-1</a:IconMode>
<a:Rect>((-57283,-22943), (-41211,-16201))</a:Rect>
<a:AutoAdjustToText>0</a:AutoAdjustToText>
<a:LineColor>0</a:LineColor>
<a:FillColor>15395562</a:FillColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>STRN 0 Arial,8,N
DISPNAME 0 Arial,11,N
CNTR 0 Arial,8,N
Attributes 0 Arial,11,N
ClassPrimaryAttribute 0 Arial,8,U
Operations 0 Arial,8,N
InnerClassifiers 0 Arial,8,N
LABL 0 Arial,8,N</a:FontList>
<a:ManuallyResized>1</a:ManuallyResized>
<c:Object>
<o:Class Ref="o53"/>
</c:Object>
</o:ClassSymbol>
<o:ClassSymbol Id="o21">
<a:CreationDate>1387290234</a:CreationDate>
<a:ModificationDate>1397732159</a:ModificationDate>
<a:IconMode>-1</a:IconMode>
<a:Rect>((-8323,-22950), (10531,-16200))</a:Rect>
<a:AutoAdjustToText>0</a:AutoAdjustToText>
<a:LineColor>0</a:LineColor>
<a:FillColor>15395562</a:FillColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>STRN 0 Arial,11,N
DISPNAME 0 Arial,11,N
CNTR 0 Arial,8,N
Attributes 0 Arial,11,N
ClassPrimaryAttribute 0 Arial,8,U
Operations 0 Arial,8,N
InnerClassifiers 0 Arial,8,N
LABL 0 Arial,8,N</a:FontList>
<a:SubObjects>Attribute 0
Operation 0
</a:SubObjects>
<a:ManuallyResized>1</a:ManuallyResized>
<c:Object>
<o:Class Ref="o54"/>
</c:Object>
</o:ClassSymbol>
<o:RectangleSymbol Id="o55">
<a:Text>adminUser</a:Text>
<a:CreationDate>1387292195</a:CreationDate>
<a:ModificationDate>1397732159</a:ModificationDate>
<a:Rect>((-10019,-7187), (-4913,-9325))</a:Rect>
<a:TextStyle>4130</a:TextStyle>
<a:AutoAdjustToText>0</a:AutoAdjustToText>
<a:LineColor>0</a:LineColor>
<a:FillColor>15395562</a:FillColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontName>Arial,11,N</a:FontName>
<a:ManuallyResized>1</a:ManuallyResized>
</o:RectangleSymbol>
</c:Symbols>
</o:ClassDiagram>
</c:ClassDiagrams>
<c:DefaultDiagram>
<o:ClassDiagram Ref="o4"/>
</c:DefaultDiagram>
<c:Classes>
<o:Class Id="o45">
<a:ObjectID>47AA11CF-A850-4416-997F-467E492D4106</a:ObjectID>
<a:Name>User</a:Name>
<a:Code>User</a:Code>
<a:CreationDate>1387289880</a:CreationDate>
<a:Creator>MALLON</a:Creator>
<a:ModificationDate>1387292246</a:ModificationDate>
<a:Modifier>MALLON</a:Modifier>
<a:UseParentNamespace>0</a:UseParentNamespace>
<c:Attributes>
<o:Attribute Id="o56">
<a:ObjectID>F88F38C0-54AD-497A-A1DA-0D3C0EFE8F4F</a:ObjectID>
<a:Name>name</a:Name>
<a:Code>name</a:Code>
<a:CreationDate>1387289880</a:CreationDate>
<a:Creator>MALLON</a:Creator>
<a:ModificationDate>1387289880</a:ModificationDate>
<a:Modifier>MALLON</a:Modifier>
<a:DataType>String</a:DataType>
<a:Attribute.Visibility>-</a:Attribute.Visibility>
</o:Attribute>
<o:Attribute Id="o57">
<a:ObjectID>FEC9B5F6-8762-4188-8E3E-437DFF002715</a:ObjectID>
<a:Name>userName</a:Name>
<a:Code>userName</a:Code>
<a:CreationDate>1387289880</a:CreationDate>
<a:Creator>MALLON</a:Creator>
<a:ModificationDate>1387289880</a:ModificationDate>
<a:Modifier>MALLON</a:Modifier>
<a:DataType>String</a:DataType>
<a:Attribute.Visibility>-</a:Attribute.Visibility>
</o:Attribute>
<o:Attribute Id="o58">
<a:ObjectID>D21938CA-C0C6-4522-9505-68BC9D905157</a:ObjectID>
<a:Name>password</a:Name>
<a:Code>password</a:Code>
<a:CreationDate>1387289880</a:CreationDate>
<a:Creator>MALLON</a:Creator>
<a:ModificationDate>1387289880</a:ModificationDate>
<a:Modifier>MALLON</a:Modifier>
<a:DataType>String</a:DataType>
<a:Attribute.Visibility>-</a:Attribute.Visibility>
</o:Attribute>
<o:Attribute Id="o59">
<a:ObjectID>324AA2A3-FD1F-4CD1-929A-52F20399B691</a:ObjectID>
<a:Name>firstName</a:Name>
<a:Code>firstName</a:Code>
<a:CreationDate>1387289880</a:CreationDate>
<a:Creator>MALLON</a:Creator>
<a:ModificationDate>1387289880</a:ModificationDate>
<a:Modifier>MALLON</a:Modifier>
<a:DataType>String</a:DataType>
<a:Attribute.Visibility>-</a:Attribute.Visibility>
</o:Attribute>
<o:Attribute Id="o60">
<a:ObjectID>0CBD1E26-0A66-4E44-B5F3-443A16E62E4A</a:ObjectID>
<a:Name>lastName</a:Name>
<a:Code>lastName</a:Code>
<a:CreationDate>1387289880</a:CreationDate>
<a:Creator>MALLON</a:Creator>
<a:ModificationDate>1387289880</a:ModificationDate>
<a:Modifier>MALLON</a:Modifier>
<a:DataType>String</a:DataType>
<a:Attribute.Visibility>-</a:Attribute.Visibility>
</o:Attribute>
<o:Attribute Id="o61">
<a:ObjectID>1D44A0F6-4323-4264-B70B-5112746C2B47</a:ObjectID>
<a:Name>nickName</a:Name>
<a:Code>nickName</a:Code>
<a:CreationDate>1387289880</a:CreationDate>
<a:Creator>MALLON</a:Creator>
<a:ModificationDate>1387289880</a:ModificationDate>
<a:Modifier>MALLON</a:Modifier>
<a:DataType>String</a:DataType>
<a:Attribute.Visibility>-</a:Attribute.Visibility>
</o:Attribute>
<o:Attribute Id="o62">
<a:ObjectID>AAD1BBCD-8874-49E0-A8BF-F276D85BD011</a:ObjectID>
<a:Name>publicName</a:Name>
<a:Code>publicName</a:Code>
<a:CreationDate>1387289880</a:CreationDate>
<a:Creator>MALLON</a:Creator>
<a:ModificationDate>1387289880</a:ModificationDate>
<a:Modifier>MALLON</a:Modifier>
<a:DataType>String</a:DataType>
<a:Attribute.Visibility>-</a:Attribute.Visibility>
</o:Attribute>
<o:Attribute Id="o63">
<a:ObjectID>C34E698C-B14C-4840-8BF1-7C258456B8D0</a:ObjectID>
<a:Name>email</a:Name>
<a:Code>email</a:Code>
<a:CreationDate>1387289880</a:CreationDate>
<a:Creator>MALLON</a:Creator>
<a:ModificationDate>1387289880</a:ModificationDate>
<a:Modifier>MALLON</a:Modifier>
<a:DataType>String</a:DataType>
<a:Attribute.Visibility>-</a:Attribute.Visibility>
</o:Attribute>
<o:Attribute Id="o64">
<a:ObjectID>B5E367B5-1500-4CD9-BC20-E7358B4476B6</a:ObjectID>
<a:Name>website</a:Name>
<a:Code>website</a:Code>
<a:CreationDate>1387289880</a:CreationDate>
<a:Creator>MALLON</a:Creator>
<a:ModificationDate>1387289880</a:ModificationDate>
<a:Modifier>MALLON</a:Modifier>
<a:DataType>String</a:DataType>
<a:Attribute.Visibility>-</a:Attribute.Visibility>
</o:Attribute>
<o:Attribute Id="o65">
<a:ObjectID>1046AEE5-AD03-4C3E-996B-5870487114C0</a:ObjectID>
<a:Name>biography</a:Name>
<a:Code>biography</a:Code>
<a:CreationDate>1387289880</a:CreationDate>
<a:Creator>MALLON</a:Creator>
<a:ModificationDate>1387289880</a:ModificationDate>
<a:Modifier>MALLON</a:Modifier>
<a:DataType>String</a:DataType>
<a:Attribute.Visibility>-</a:Attribute.Visibility>
</o:Attribute>
<o:Attribute Id="o66">
<a:ObjectID>BB953CBC-0591-4288-905F-B09FFD5CC497</a:ObjectID>
<a:Name>userRole</a:Name>
<a:Code>userRole</a:Code>
<a:CreationDate>1387289880</a:CreationDate>
<a:Creator>MALLON</a:Creator>
<a:ModificationDate>1387289880</a:ModificationDate>
<a:Modifier>MALLON</a:Modifier>
<a:DataType>role</a:DataType>
<a:Attribute.Visibility>-</a:Attribute.Visibility>
</o:Attribute>
</c:Attributes>
</o:Class>
<o:Class Id="o44">
<a:ObjectID>A64C7718-A06B-45CE-83AB-9409256DE915</a:ObjectID>
<a:Name>Deletion</a:Name>
<a:Code>Deletion</a:Code>
<a:CreationDate>1387289825</a:CreationDate>
<a:Creator>MALLON</a:Creator>
<a:ModificationDate>1397645503</a:ModificationDate>
<a:Modifier>MALLON</a:Modifier>
<a:UseParentNamespace>0</a:UseParentNamespace>
<c:Attributes>
<o:Attribute Id="o67">
<a:ObjectID>4090D937-D146-47F2-BDC5-916CD9896EAD</a:ObjectID>
<a:Name>pagesByTitle</a:Name>
<a:Code>pagesByTitle</a:Code>
<a:CreationDate>1387289825</a:CreationDate>
<a:Creator>MALLON</a:Creator>
<a:ModificationDate>1387289825</a:ModificationDate>
<a:Modifier>MALLON</a:Modifier>
<a:DataType>String</a:DataType>
<a:Attribute.Visibility>-</a:Attribute.Visibility>
</o:Attribute>
<o:Attribute Id="o68">
<a:ObjectID>CBCC6743-AEBC-42B7-B4FB-B50B0C0F9061</a:ObjectID>
<a:Name>usersByLogin</a:Name>
<a:Code>usersByLogin</a:Code>
<a:CreationDate>1387289825</a:CreationDate>
<a:Creator>MALLON</a:Creator>
<a:ModificationDate>1387289825</a:ModificationDate>
<a:Modifier>MALLON</a:Modifier>
<a:DataType>String</a:DataType>
<a:Attribute.Visibility>-</a:Attribute.Visibility>
</o:Attribute>
<o:Attribute Id="o69">
<a:ObjectID>CA80EFCA-F050-4192-BD08-7A5BE2EB94B8</a:ObjectID>
<a:Name>mediasByTitle</a:Name>
<a:Code>mediasByTitle</a:Code>
<a:CreationDate>1387289825</a:CreationDate>
<a:Creator>MALLON</a:Creator>
<a:ModificationDate>1387289825</a:ModificationDate>
<a:Modifier>MALLON</a:Modifier>
<a:DataType>String</a:DataType>
<a:Attribute.Visibility>-</a:Attribute.Visibility>
</o:Attribute>
<o:Attribute Id="o70">
<a:ObjectID>B4E861C9-ACA9-46A6-AACD-CB01A3401469</a:ObjectID>
<a:Name>functionalitiesByName</a:Name>
<a:Code>functionalitiesByName</a:Code>
<a:CreationDate>1387289825</a:CreationDate>
<a:Creator>MALLON</a:Creator>
<a:ModificationDate>1387289825</a:ModificationDate>
<a:Modifier>MALLON</a:Modifier>
<a:DataType>functionnalities</a:DataType>
<a:Attribute.Visibility>-</a:Attribute.Visibility>
</o:Attribute>
<o:Attribute Id="o71">
<a:ObjectID>B02E7CD8-9716-4BFF-B1C6-1BA5492B93FF</a:ObjectID>
<a:Name>pluginsByFileName</a:Name>
<a:Code>pluginsByFileName</a:Code>
<a:CreationDate>1387289825</a:CreationDate>
<a:Creator>MALLON</a:Creator>
<a:ModificationDate>1387289825</a:ModificationDate>
<a:Modifier>MALLON</a:Modifier>
<a:DataType>String</a:DataType>
<a:Attribute.Visibility>-</a:Attribute.Visibility>
</o:Attribute>
<o:Attribute Id="o72">
<a:ObjectID>3CE1B7FB-AFE6-434A-BB4C-24D4770E665F</a:ObjectID>
<a:Name>categoriesByName</a:Name>
<a:Code>categoriesByName</a:Code>
<a:CreationDate>1387289825</a:CreationDate>
<a:Creator>MALLON</a:Creator>
<a:ModificationDate>1387289825</a:ModificationDate>
<a:Modifier>MALLON</a:Modifier>
<a:DataType>String</a:DataType>
<a:Attribute.Visibility>-</a:Attribute.Visibility>
</o:Attribute>
<o:Attribute Id="o73">
<a:ObjectID>EADD8CC1-8663-4639-9505-35892BB8C2B6</a:ObjectID>
<a:Name>tagsByName</a:Name>
<a:Code>tagsByName</a:Code>
<a:CreationDate>1387289825</a:CreationDate>
<a:Creator>MALLON</a:Creator>
<a:ModificationDate>1387289825</a:ModificationDate>
<a:Modifier>MALLON</a:Modifier>
<a:DataType>String</a:DataType>
<a:Attribute.Visibility>-</a:Attribute.Visibility>
</o:Attribute>
<o:Attribute Id="o74">
<a:ObjectID>A3DD17E8-22FD-466D-9A4C-801501BC2B85</a:ObjectID>
<a:Name>menusByName</a:Name>
<a:Code>menusByName</a:Code>
<a:CreationDate>1387289825</a:CreationDate>
<a:Creator>MALLON</a:Creator>
<a:ModificationDate>1387289825</a:ModificationDate>
<a:Modifier>MALLON</a:Modifier>
<a:DataType>String</a:DataType>
<a:Attribute.Visibility>-</a:Attribute.Visibility>
</o:Attribute>
<o:Attribute Id="o75">
<a:ObjectID>B276B2A8-FFEF-4143-AD6B-BB37438F46A6</a:ObjectID>
<a:Name>commentsByPostDateAuthor</a:Name>
<a:Code>commentsByPostDateAuthor</a:Code>
<a:CreationDate>1387289825</a:CreationDate>
<a:Creator>MALLON</a:Creator>
<a:ModificationDate>1387289825</a:ModificationDate>
<a:Modifier>MALLON</a:Modifier>
<a:DataType>PostDateAuthor</a:DataType>
<a:Attribute.Visibility>-</a:Attribute.Visibility>
</o:Attribute>
</c:Attributes>
</o:Class>
<o:Class Id="o43">
<a:ObjectID>571768C5-175D-4066-B6CC-1FF6E47A0E4B</a:ObjectID>
<a:Name>Website</a:Name>
<a:Code>Website</a:Code>
<a:CreationDate>1387289825</a:CreationDate>
<a:Creator>MALLON</a:Creator>
<a:ModificationDate>1397645573</a:ModificationDate>
<a:Modifier>MALLON</a:Modifier>
<a:UseParentNamespace>0</a:UseParentNamespace>
<c:Attributes>
<o:Attribute Id="o76">
<a:ObjectID>0CAC5401-D3AA-4D62-83B5-CA14A0FBAFF3</a:ObjectID>
<a:Name>adminUser</a:Name>
<a:Code>adminUser</a:Code>
<a:CreationDate>1387289825</a:CreationDate>
<a:Creator>MALLON</a:Creator>
<a:ModificationDate>1387289825</a:ModificationDate>
<a:Modifier>MALLON</a:Modifier>
<a:DataType>User</a:DataType>
<a:Attribute.Visibility>-</a:Attribute.Visibility>
<c:ObjectDataType>
<o:Shortcut Ref="o77"/>
</c:ObjectDataType>
</o:Attribute>
<o:Attribute Id="o78">
<a:ObjectID>051DFC7B-73FB-4BE2-8049-7FF106BA7003</a:ObjectID>
<a:Name>users</a:Name>
<a:Code>users</a:Code>
<a:CreationDate>1387289825</a:CreationDate>
<a:Creator>MALLON</a:Creator>
<a:ModificationDate>1387289825</a:ModificationDate>
<a:Modifier>MALLON</a:Modifier>
<a:DataType>User</a:DataType>
<a:Attribute.Visibility>-</a:Attribute.Visibility>
<c:ObjectDataType>
<o:Shortcut Ref="o77"/>
</c:ObjectDataType>
</o:Attribute>
<o:Attribute Id="o79">
<a:ObjectID>FD768795-C9F7-4CE9-8FC4-0C1D2B91BEAA</a:ObjectID>
<a:Name>posts</a:Name>
<a:Code>posts</a:Code>
<a:CreationDate>1387289825</a:CreationDate>
<a:Creator>MALLON</a:Creator>
<a:ModificationDate>1387289825</a:ModificationDate>
<a:Modifier>MALLON</a:Modifier>
<a:DataType>Post</a:DataType>
<a:Attribute.Visibility>-</a:Attribute.Visibility>
<c:ObjectDataType>
<o:Shortcut Ref="o80"/>
</c:ObjectDataType>
</o:Attribute>
<o:Attribute Id="o81">
<a:ObjectID>8F0DF8C8-4873-4C85-B7EC-A57D4A2A1786</a:ObjectID>
<a:Name>pages</a:Name>
<a:Code>pages</a:Code>
<a:CreationDate>1387289825</a:CreationDate>
<a:Creator>MALLON</a:Creator>
<a:ModificationDate>1387289825</a:ModificationDate>
<a:Modifier>MALLON</a:Modifier>
<a:DataType>Page</a:DataType>
<a:Attribute.Visibility>-</a:Attribute.Visibility>
<c:ObjectDataType>
<o:Shortcut Ref="o82"/>
</c:ObjectDataType>
</o:Attribute>
<o:Attribute Id="o83">
<a:ObjectID>E1D3607D-DD16-4C1C-BD5B-CC1DE12DFC4B</a:ObjectID>
<a:Name>appearance</a:Name>
<a:Code>appearance</a:Code>
<a:CreationDate>1387289825</a:CreationDate>
<a:Creator>MALLON</a:Creator>
<a:ModificationDate>1387289825</a:ModificationDate>
<a:Modifier>MALLON</a:Modifier>
<a:DataType>Appearance</a:DataType>
<a:Attribute.Visibility>-</a:Attribute.Visibility>
<c:ObjectDataType>
<o:Shortcut Ref="o84"/>
</c:ObjectDataType>
</o:Attribute>
<o:Attribute Id="o85">
<a:ObjectID>4A29C9A9-07ED-43D2-A603-4A0F03EDCD8B</a:ObjectID>
<a:Name>mediaLibrary</a:Name>
<a:Code>mediaLibrary</a:Code>
<a:CreationDate>1387289825</a:CreationDate>
<a:Creator>MALLON</a:Creator>
<a:ModificationDate>1387289825</a:ModificationDate>
<a:Modifier>MALLON</a:Modifier>
<a:DataType>Media</a:DataType>
<a:Attribute.Visibility>-</a:Attribute.Visibility>
<c:ObjectDataType>
<o:Shortcut Ref="o86"/>
</c:ObjectDataType>
</o:Attribute>
<o:Attribute Id="o87">
<a:ObjectID>6CDBEC4E-EAE1-46E9-B0EF-FD5D290AE8C5</a:ObjectID>
<a:Name>functionnalities</a:Name>
<a:Code>functionnalities</a:Code>
<a:CreationDate>1387289825</a:CreationDate>
<a:Creator>MALLON</a:Creator>
<a:ModificationDate>1387289825</a:ModificationDate>
<a:Modifier>MALLON</a:Modifier>
<a:DataType>Functionality</a:DataType>
<a:Attribute.Visibility>-</a:Attribute.Visibility>
<c:ObjectDataType>
<o:Shortcut Ref="o88"/>
</c:ObjectDataType>
</o:Attribute>
<o:Attribute Id="o89">
<a:ObjectID>5759547B-2C3D-46B8-9015-3DB669163757</a:ObjectID>
<a:Name>comments</a:Name>
<a:Code>comments</a:Code>
<a:CreationDate>1387289825</a:CreationDate>
<a:Creator>MALLON</a:Creator>
<a:ModificationDate>1387289825</a:ModificationDate>
<a:Modifier>MALLON</a:Modifier>
<a:DataType>Comment</a:DataType>
<a:Attribute.Visibility>-</a:Attribute.Visibility>
<c:ObjectDataType>
<o:Shortcut Ref="o90"/>
</c:ObjectDataType>
</o:Attribute>
<o:Attribute Id="o91">
<a:ObjectID>899BEB0B-5FAC-4769-8BA8-65633E62EAE4</a:ObjectID>
<a:Name>categories</a:Name>
<a:Code>categories</a:Code>
<a:CreationDate>1387289825</a:CreationDate>
<a:Creator>MALLON</a:Creator>
<a:ModificationDate>1387289825</a:ModificationDate>
<a:Modifier>MALLON</a:Modifier>
<a:DataType>Category</a:DataType>
<a:Attribute.Visibility>-</a:Attribute.Visibility>
<c:ObjectDataType>
<o:Shortcut Ref="o92"/>
</c:ObjectDataType>
</o:Attribute>
<o:Attribute Id="o93">
<a:ObjectID>5E2E8CE0-65D1-49CB-8791-85A890E0F2FA</a:ObjectID>
<a:Name>tags</a:Name>
<a:Code>tags</a:Code>
<a:CreationDate>1387289825</a:CreationDate>
<a:Creator>MALLON</a:Creator>
<a:ModificationDate>1387289825</a:ModificationDate>
<a:Modifier>MALLON</a:Modifier>
<a:DataType>Tag</a:DataType>
<a:Attribute.Visibility>-</a:Attribute.Visibility>
<c:ObjectDataType>
<o:Shortcut Ref="o94"/>
</c:ObjectDataType>
</o:Attribute>
<o:Attribute Id="o95">
<a:ObjectID>3E36414B-247D-4E13-AE6E-15C78221318A</a:ObjectID>
<a:Name>settings</a:Name>
<a:Code>settings</a:Code>
<a:CreationDate>1387289825</a:CreationDate>
<a:Creator>MALLON</a:Creator>
<a:ModificationDate>1387289825</a:ModificationDate>
<a:Modifier>MALLON</a:Modifier>
<a:DataType>Settings</a:DataType>
<a:Attribute.Visibility>-</a:Attribute.Visibility>
<c:ObjectDataType>
<o:Shortcut Ref="o96"/>
</c:ObjectDataType>
</o:Attribute>
<o:Attribute Id="o97">
<a:ObjectID>4FEB92F5-9DAA-45E6-B494-76B66C18781D</a:ObjectID>
<a:Name>deletion</a:Name>
<a:Code>deletion</a:Code>
<a:CreationDate>1387289825</a:CreationDate>
<a:Creator>MALLON</a:Creator>
<a:ModificationDate>1387289825</a:ModificationDate>
<a:Modifier>MALLON</a:Modifier>
<a:DataType>Deletion</a:DataType>
<a:Attribute.Visibility>-</a:Attribute.Visibility>
<c:ObjectDataType>
<o:Class Ref="o44"/>
</c:ObjectDataType>
</o:Attribute>
</c:Attributes>
</o:Class>
<o:Shortcut Id="o77">
<a:ObjectID>1403772C-A4C0-4C26-B5B9-BB5932DB55FD</a:ObjectID>
<a:Name>User</a:Name>
<a:Code>User</a:Code>
<a:CreationDate>1387289825</a:CreationDate>
<a:Creator>MALLON</a:Creator>
<a:ModificationDate>1387289825</a:ModificationDate>
<a:Modifier>MALLON</a:Modifier>
<a:TargetStereotype/>
<a:TargetID>DF38C0DE-CDB5-4F7B-952E-5C7FC37EBA4C</a:TargetID>
<a:TargetClassID>18112063-1A4B-11D1-83D9-444553540000</a:TargetClassID>
<a:TargetPackagePath>&lt;Modèle&gt;</a:TargetPackagePath>
</o:Shortcut>
<o:Shortcut Id="o80">
<a:ObjectID>0300DD73-38AA-4999-88D1-1A679CDB3E96</a:ObjectID>
<a:Name>Post</a:Name>
<a:Code>Post</a:Code>
<a:CreationDate>1387289825</a:CreationDate>
<a:Creator>MALLON</a:Creator>
<a:ModificationDate>1387289825</a:ModificationDate>
<a:Modifier>MALLON</a:Modifier>
<a:TargetStereotype/>
<a:TargetID>57F0AD5A-047F-4E2F-B215-2D16577EB098</a:TargetID>
<a:TargetClassID>18112063-1A4B-11D1-83D9-444553540000</a:TargetClassID>
<a:TargetPackagePath>&lt;Modèle&gt;</a:TargetPackagePath>
</o:Shortcut>
<o:Shortcut Id="o82">
<a:ObjectID>92843FA0-863A-4012-9F91-B83C8276185C</a:ObjectID>
<a:Name>Page</a:Name>
<a:Code>Page</a:Code>
<a:CreationDate>1387289825</a:CreationDate>
<a:Creator>MALLON</a:Creator>
<a:ModificationDate>1387289825</a:ModificationDate>
<a:Modifier>MALLON</a:Modifier>
<a:TargetStereotype/>
<a:TargetID>BABA8BFF-B4EF-4160-BCE2-E921A579B34F</a:TargetID>
<a:TargetClassID>18112063-1A4B-11D1-83D9-444553540000</a:TargetClassID>
<a:TargetPackagePath>&lt;Modèle&gt;</a:TargetPackagePath>
</o:Shortcut>
<o:Shortcut Id="o84">
<a:ObjectID>93534DCF-91DA-426B-8C1A-9AFB93821C6A</a:ObjectID>
<a:Name>Appearance</a:Name>
<a:Code>Appearance</a:Code>
<a:CreationDate>1387289825</a:CreationDate>
<a:Creator>MALLON</a:Creator>
<a:ModificationDate>1387289825</a:ModificationDate>
<a:Modifier>MALLON</a:Modifier>
<a:TargetStereotype/>
<a:TargetID>4D07EEC1-AE43-4820-A34D-502A4AE0185F</a:TargetID>
<a:TargetClassID>18112063-1A4B-11D1-83D9-444553540000</a:TargetClassID>
<a:TargetPackagePath>&lt;Modèle&gt;</a:TargetPackagePath>
</o:Shortcut>
<o:Shortcut Id="o86">
<a:ObjectID>CA395D28-8A4B-4EA3-85B2-B4C3E79F8452</a:ObjectID>
<a:Name>Media</a:Name>
<a:Code>Media</a:Code>
<a:CreationDate>1387289825</a:CreationDate>
<a:Creator>MALLON</a:Creator>
<a:ModificationDate>1387289825</a:ModificationDate>
<a:Modifier>MALLON</a:Modifier>
<a:TargetStereotype/>
<a:TargetID>2FCC4765-6C34-417A-AEC1-12AADA102C9D</a:TargetID>
<a:TargetClassID>18112063-1A4B-11D1-83D9-444553540000</a:TargetClassID>
<a:TargetPackagePath>&lt;Modèle&gt;</a:TargetPackagePath>
</o:Shortcut>
<o:Shortcut Id="o88">
<a:ObjectID>0A73A194-E0AB-4A80-AEAB-5FE84354FA65</a:ObjectID>
<a:Name>Functionality</a:Name>
<a:Code>Functionality</a:Code>
<a:CreationDate>1387289825</a:CreationDate>
<a:Creator>MALLON</a:Creator>
<a:ModificationDate>1387289825</a:ModificationDate>
<a:Modifier>MALLON</a:Modifier>
<a:TargetStereotype/>
<a:TargetID>F84435D5-A1B9-4C52-A6B9-44E91EE7B20B</a:TargetID>
<a:TargetClassID>18112063-1A4B-11D1-83D9-444553540000</a:TargetClassID>
<a:TargetPackagePath>&lt;Modèle&gt;</a:TargetPackagePath>
</o:Shortcut>
<o:Shortcut Id="o90">
<a:ObjectID>6723921C-411A-4E32-BFD9-2E86DCD93A7C</a:ObjectID>
<a:Name>Comment</a:Name>
<a:Code>Comment</a:Code>
<a:CreationDate>1387289825</a:CreationDate>
<a:Creator>MALLON</a:Creator>
<a:ModificationDate>1387289825</a:ModificationDate>
<a:Modifier>MALLON</a:Modifier>
<a:TargetStereotype/>
<a:TargetID>1C78E479-EA7F-409B-A77C-BFA6022F988B</a:TargetID>
<a:TargetClassID>18112063-1A4B-11D1-83D9-444553540000</a:TargetClassID>
<a:TargetPackagePath>&lt;Modèle&gt;</a:TargetPackagePath>
</o:Shortcut>
<o:Shortcut Id="o92">
<a:ObjectID>9C1EC911-894D-4AEF-ACA7-811B40876DEC</a:ObjectID>
<a:Name>Category</a:Name>
<a:Code>Category</a:Code>
<a:CreationDate>1387289825</a:CreationDate>
<a:Creator>MALLON</a:Creator>
<a:ModificationDate>1387289825</a:ModificationDate>
<a:Modifier>MALLON</a:Modifier>
<a:TargetStereotype/>
<a:TargetID>6ADEA88F-FADE-4E90-978C-646744B27620</a:TargetID>
<a:TargetClassID>18112063-1A4B-11D1-83D9-444553540000</a:TargetClassID>
<a:TargetPackagePath>&lt;Modèle&gt;</a:TargetPackagePath>
</o:Shortcut>
<o:Shortcut Id="o94">
<a:ObjectID>AAC72065-6EE5-4C72-A6AA-EEE114A2775D</a:ObjectID>
<a:Name>Tag</a:Name>
<a:Code>Tag</a:Code>
<a:CreationDate>1387289825</a:CreationDate>
<a:Creator>MALLON</a:Creator>
<a:ModificationDate>1387289825</a:ModificationDate>
<a:Modifier>MALLON</a:Modifier>
<a:TargetStereotype/>
<a:TargetID>1635DC08-3CE9-4EE6-BBC4-2299F8DCDB3C</a:TargetID>
<a:TargetClassID>18112063-1A4B-11D1-83D9-444553540000</a:TargetClassID>
<a:TargetPackagePath>&lt;Modèle&gt;</a:TargetPackagePath>
</o:Shortcut>
<o:Shortcut Id="o96">
<a:ObjectID>9F6FA467-A4D2-41CB-9837-22FA08C70A35</a:ObjectID>
<a:Name>Settings</a:Name>
<a:Code>Settings</a:Code>
<a:CreationDate>1387289825</a:CreationDate>
<a:Creator>MALLON</a:Creator>
<a:ModificationDate>1387289825</a:ModificationDate>
<a:Modifier>MALLON</a:Modifier>
<a:TargetStereotype/>
<a:TargetID>27BC7D8A-E4CE-4A2F-ABA3-57C889659F0E</a:TargetID>
<a:TargetClassID>18112063-1A4B-11D1-83D9-444553540000</a:TargetClassID>
<a:TargetPackagePath>&lt;Modèle&gt;</a:TargetPackagePath>
</o:Shortcut>
<o:Class Id="o46">
<a:ObjectID>BA0CDC89-5747-4936-9D35-F63145AF5298</a:ObjectID>
<a:Name>Appearance</a:Name>
<a:Code>Appearance</a:Code>
<a:CreationDate>1387289880</a:CreationDate>
<a:Creator>MALLON</a:Creator>
<a:ModificationDate>1397644016</a:ModificationDate>
<a:Modifier>MALLON</a:Modifier>
<a:UseParentNamespace>0</a:UseParentNamespace>
<c:Attributes>
<o:Attribute Id="o98">
<a:ObjectID>E1F39646-CB84-42BE-A457-B834FF0C1971</a:ObjectID>
<a:Name>widgets</a:Name>
<a:Code>widgets</a:Code>
<a:CreationDate>1387289880</a:CreationDate>
<a:Creator>MALLON</a:Creator>
<a:ModificationDate>1390824787</a:ModificationDate>
<a:Modifier>MALLON</a:Modifier>
<a:DataType>Widget</a:DataType>
<a:Attribute.Visibility>-</a:Attribute.Visibility>
</o:Attribute>
<o:Attribute Id="o99">
<a:ObjectID>9B84CD7A-8A20-4FFE-AE82-3F7FC2C6B2EA</a:ObjectID>
<a:Name>appearanceMenus</a:Name>
<a:Code>appearanceMenus</a:Code>
<a:CreationDate>1387289880</a:CreationDate>
<a:Creator>MALLON</a:Creator>
<a:ModificationDate>1387289880</a:ModificationDate>
<a:Modifier>MALLON</a:Modifier>
<a:DataType>Menu</a:DataType>
<a:Attribute.Visibility>-</a:Attribute.Visibility>
</o:Attribute>
<o:Attribute Id="o100">
<a:ObjectID>EB3B1770-3488-4B9E-9F9F-535CEBEE93A8</a:ObjectID>
<a:Name>appearanceHeaders</a:Name>
<a:Code>appearanceHeaders</a:Code>
<a:CreationDate>1387289880</a:CreationDate>
<a:Creator>MALLON</a:Creator>
<a:ModificationDate>1387289880</a:ModificationDate>
<a:Modifier>MALLON</a:Modifier>
<a:DataType>Header</a:DataType>
<a:Attribute.Visibility>-</a:Attribute.Visibility>
</o:Attribute>
<o:Attribute Id="o101">
<a:ObjectID>B86B2B93-3F4D-421B-B6DC-B5FB1192C076</a:ObjectID>
<a:Name>theme</a:Name>
<a:Code>theme</a:Code>
<a:CreationDate>1387289880</a:CreationDate>
<a:Creator>MALLON</a:Creator>
<a:ModificationDate>1387289880</a:ModificationDate>
<a:Modifier>MALLON</a:Modifier>
<a:DataType>Plugin</a:DataType>
<a:Attribute.Visibility>-</a:Attribute.Visibility>
</o:Attribute>
</c:Attributes>
</o:Class>
<o:Class Id="o47">
<a:ObjectID>06C3FF90-E067-4613-911C-94642E6F7B8F</a:ObjectID>
<a:Name>Settings</a:Name>
<a:Code>Settings</a:Code>
<a:CreationDate>1387289880</a:CreationDate>
<a:Creator>MALLON</a:Creator>
<a:ModificationDate>1397645573</a:ModificationDate>
<a:Modifier>MALLON</a:Modifier>
<a:UseParentNamespace>0</a:UseParentNamespace>
<c:Attributes>
<o:Attribute Id="o102">
<a:ObjectID>EFF222CB-5B0C-4ABE-B54F-9E458C69FD6D</a:ObjectID>
<a:Name>general</a:Name>
<a:Code>general</a:Code>
<a:CreationDate>1387289880</a:CreationDate>
<a:Creator>MALLON</a:Creator>
<a:ModificationDate>1387289880</a:ModificationDate>
<a:Modifier>MALLON</a:Modifier>
<a:DataType>GeneralSettings</a:DataType>
<a:Attribute.Visibility>-</a:Attribute.Visibility>
</o:Attribute>
<o:Attribute Id="o103">
<a:ObjectID>E722E8E0-71A1-47B8-B8F5-CD92B8718DD4</a:ObjectID>
<a:Name>writing</a:Name>
<a:Code>writing</a:Code>
<a:CreationDate>1387289880</a:CreationDate>
<a:Creator>MALLON</a:Creator>
<a:ModificationDate>1387289880</a:ModificationDate>
<a:Modifier>MALLON</a:Modifier>
<a:DataType>WritingSettings</a:DataType>
<a:Attribute.Visibility>-</a:Attribute.Visibility>
</o:Attribute>
<o:Attribute Id="o104">
<a:ObjectID>D1BAB61E-DC20-4BE4-9004-0F63C5A4669D</a:ObjectID>
<a:Name>reading</a:Name>
<a:Code>reading</a:Code>
<a:CreationDate>1387289880</a:CreationDate>
<a:Creator>MALLON</a:Creator>
<a:ModificationDate>1387289880</a:ModificationDate>
<a:Modifier>MALLON</a:Modifier>
<a:DataType>ReadingSettings</a:DataType>
<a:Attribute.Visibility>-</a:Attribute.Visibility>
</o:Attribute>
<o:Attribute Id="o105">
<a:ObjectID>1DBD255C-5371-4724-936D-3FA2AF3D3F86</a:ObjectID>
<a:Name>discussion</a:Name>
<a:Code>discussion</a:Code>
<a:CreationDate>1387289880</a:CreationDate>
<a:Creator>MALLON</a:Creator>
<a:ModificationDate>1387289880</a:ModificationDate>
<a:Modifier>MALLON</a:Modifier>
<a:DataType>DiscussionSettings</a:DataType>
<a:Attribute.Visibility>-</a:Attribute.Visibility>
</o:Attribute>
<o:Attribute Id="o106">
<a:ObjectID>DB197FF4-A9F6-4995-9C0A-E51C9B92E63A</a:ObjectID>
<a:Name>media</a:Name>
<a:Code>media</a:Code>
<a:CreationDate>1387289880</a:CreationDate>
<a:Creator>MALLON</a:Creator>
<a:ModificationDate>1387289880</a:ModificationDate>
<a:Modifier>MALLON</a:Modifier>
<a:DataType>MediaSettings</a:DataType>
<a:Attribute.Visibility>-</a:Attribute.Visibility>
</o:Attribute>
<o:Attribute Id="o107">
<a:ObjectID>71980C78-6586-4BD3-808D-7515C2F08B10</a:ObjectID>
<a:Name>permalink</a:Name>
<a:Code>permalink</a:Code>
<a:CreationDate>1387289880</a:CreationDate>
<a:Creator>MALLON</a:Creator>
<a:ModificationDate>1387289880</a:ModificationDate>
<a:Modifier>MALLON</a:Modifier>
<a:DataType>PermalinkSettings</a:DataType>
<a:Attribute.Visibility>-</a:Attribute.Visibility>
</o:Attribute>
</c:Attributes>
</o:Class>
<o:Class Id="o48">
<a:ObjectID>DBA6B6DB-A761-4F9A-AAA5-0F1DA0AF1453</a:ObjectID>
<a:Name>Post</a:Name>
<a:Code>Post</a:Code>
<a:CreationDate>1387289880</a:CreationDate>
<a:Creator>MALLON</a:Creator>
<a:ModificationDate>1387291944</a:ModificationDate>
<a:Modifier>MALLON</a:Modifier>
<a:UseParentNamespace>0</a:UseParentNamespace>
<c:Attributes>
<o:Attribute Id="o108">
<a:ObjectID>D519B760-145B-4218-8656-7A23D87E0E2F</a:ObjectID>
<a:Name>format</a:Name>
<a:Code>format</a:Code>
<a:CreationDate>1387289880</a:CreationDate>
<a:Creator>MALLON</a:Creator>
<a:ModificationDate>1387289880</a:ModificationDate>
<a:Modifier>MALLON</a:Modifier>
<a:DataType>postFormat</a:DataType>
<a:Attribute.Visibility>-</a:Attribute.Visibility>
</o:Attribute>
<o:Attribute Id="o109">
<a:ObjectID>CB70EAFC-2B2D-4BE0-9573-5F1145B82342</a:ObjectID>
<a:Name>categories</a:Name>
<a:Code>categories</a:Code>
<a:CreationDate>1387289880</a:CreationDate>
<a:Creator>MALLON</a:Creator>
<a:ModificationDate>1387289880</a:ModificationDate>
<a:Modifier>MALLON</a:Modifier>
<a:DataType>Category</a:DataType>
<a:Attribute.Visibility>-</a:Attribute.Visibility>
</o:Attribute>
<o:Attribute Id="o110">
<a:ObjectID>9F3373A8-9DDC-4DF6-B6A2-06B83A1E095B</a:ObjectID>
<a:Name>tags</a:Name>
<a:Code>tags</a:Code>
<a:CreationDate>1387289880</a:CreationDate>
<a:Creator>MALLON</a:Creator>
<a:ModificationDate>1387289880</a:ModificationDate>
<a:Modifier>MALLON</a:Modifier>
<a:DataType>Tag</a:DataType>
<a:Attribute.Visibility>-</a:Attribute.Visibility>
</o:Attribute>
</c:Attributes>
</o:Class>
<o:Class Id="o49">
<a:ObjectID>5EE3F7CA-ABD2-42A9-BE4E-8D9079A02681</a:ObjectID>
<a:Name>Page</a:Name>
<a:Code>Page</a:Code>
<a:CreationDate>1387289880</a:CreationDate>
<a:Creator>MALLON</a:Creator>
<a:ModificationDate>1387291953</a:ModificationDate>
<a:Modifier>MALLON</a:Modifier>
<a:UseParentNamespace>0</a:UseParentNamespace>
<c:Attributes>
<o:Attribute Id="o111">
<a:ObjectID>25A632BA-9080-4BA0-B333-0E0E73C38E4D</a:ObjectID>
<a:Name>order</a:Name>
<a:Code>order</a:Code>
<a:CreationDate>1387289880</a:CreationDate>
<a:Creator>MALLON</a:Creator>
<a:ModificationDate>1387289880</a:ModificationDate>
<a:Modifier>MALLON</a:Modifier>
<a:DataType>int</a:DataType>
<a:Attribute.Visibility>-</a:Attribute.Visibility>
</o:Attribute>
<o:Attribute Id="o112">
<a:ObjectID>FCE0C54E-03E2-4165-A762-705B3DC94D50</a:ObjectID>
<a:Name>parent</a:Name>
<a:Code>parent</a:Code>
<a:CreationDate>1387289880</a:CreationDate>
<a:Creator>MALLON</a:Creator>
<a:ModificationDate>1387289880</a:ModificationDate>
<a:Modifier>MALLON</a:Modifier>
<a:DataType>Page</a:DataType>
<a:Attribute.Visibility>-</a:Attribute.Visibility>
<c:ObjectDataType>
<o:Class Ref="o49"/>
</c:ObjectDataType>
</o:Attribute>
<o:Attribute Id="o113">
<a:ObjectID>C6F229A6-BBA4-4550-9B9B-F4C0F23FCEC6</a:ObjectID>
<a:Name>publicationDateGMT</a:Name>
<a:Code>publicationDateGMT</a:Code>
<a:CreationDate>1387289880</a:CreationDate>
<a:Creator>MALLON</a:Creator>
<a:ModificationDate>1387289880</a:ModificationDate>
<a:Modifier>MALLON</a:Modifier>
<a:DataType>String</a:DataType>
<a:Attribute.Visibility>-</a:Attribute.Visibility>
</o:Attribute>
<o:Attribute Id="o114">
<a:ObjectID>833504F5-87D1-479D-ABEA-8143AE0AB4C7</a:ObjectID>
<a:Name>publicationDate</a:Name>
<a:Code>publicationDate</a:Code>
<a:CreationDate>1387289880</a:CreationDate>
<a:Creator>MALLON</a:Creator>
<a:ModificationDate>1387289880</a:ModificationDate>
<a:Modifier>MALLON</a:Modifier>
<a:DataType>String</a:DataType>
<a:Attribute.Visibility>-</a:Attribute.Visibility>
</o:Attribute>
</c:Attributes>
</o:Class>
<o:Class Id="o50">
<a:ObjectID>B82C5E81-B687-4A13-A5D2-092E8BBEDD73</a:ObjectID>
<a:Name>Functionality</a:Name>
<a:Code>Functionality</a:Code>
<a:CreationDate>1387289880</a:CreationDate>
<a:Creator>MALLON</a:Creator>
<a:ModificationDate>1387291963</a:ModificationDate>
<a:Modifier>MALLON</a:Modifier>
<a:UseParentNamespace>0</a:UseParentNamespace>
<c:Attributes>
<o:Attribute Id="o115">
<a:ObjectID>03575E53-D149-439B-A8C3-8EA3530A855B</a:ObjectID>
<a:Name>name</a:Name>
<a:Code>name</a:Code>
<a:CreationDate>1387289880</a:CreationDate>
<a:Creator>MALLON</a:Creator>
<a:ModificationDate>1387289880</a:ModificationDate>
<a:Modifier>MALLON</a:Modifier>
<a:DataType>String</a:DataType>
<a:Attribute.Visibility>-</a:Attribute.Visibility>
</o:Attribute>
<o:Attribute Id="o116">
<a:ObjectID>74EF088C-3B03-4C0D-9114-4C46285CE3A1</a:ObjectID>
<a:Name>socialNetworks</a:Name>
<a:Code>socialNetworks</a:Code>
<a:CreationDate>1387289880</a:CreationDate>
<a:Creator>MALLON</a:Creator>
<a:ModificationDate>1387289880</a:ModificationDate>
<a:Modifier>MALLON</a:Modifier>
<a:DataType>String</a:DataType>
<a:Attribute.Visibility>-</a:Attribute.Visibility>
</o:Attribute>
<o:Attribute Id="o117">
<a:ObjectID>2FBF8C69-13FA-4146-BC3C-C15BC495DFBD</a:ObjectID>
<a:Name>functionalityType</a:Name>
<a:Code>functionalityType</a:Code>
<a:CreationDate>1387289880</a:CreationDate>
<a:Creator>MALLON</a:Creator>
<a:ModificationDate>1387289880</a:ModificationDate>
<a:Modifier>MALLON</a:Modifier>
<a:DataType>functionnalities</a:DataType>
<a:Attribute.Visibility>-</a:Attribute.Visibility>
</o:Attribute>
<o:Attribute Id="o118">
<a:ObjectID>C619F66B-0D3A-4DAE-877A-9B349365A939</a:ObjectID>
<a:Name>defaultPlugin</a:Name>
<a:Code>defaultPlugin</a:Code>
<a:CreationDate>1387289880</a:CreationDate>
<a:Creator>MALLON</a:Creator>
<a:ModificationDate>1387289880</a:ModificationDate>
<a:Modifier>MALLON</a:Modifier>
<a:DataType>Plugin</a:DataType>
<a:Attribute.Visibility>-</a:Attribute.Visibility>
</o:Attribute>
</c:Attributes>
</o:Class>
<o:Class Id="o51">
<a:ObjectID>759ADE0B-C98D-4145-995E-7EE86EAC4569</a:ObjectID>
<a:Name>Tag</a:Name>
<a:Code>Tag</a:Code>
<a:CreationDate>1387289880</a:CreationDate>
<a:Creator>MALLON</a:Creator>
<a:ModificationDate>1397644348</a:ModificationDate>
<a:Modifier>MALLON</a:Modifier>
<a:UseParentNamespace>0</a:UseParentNamespace>
<c:Attributes>
<o:Attribute Id="o119">
<a:ObjectID>50117323-EED4-460F-B687-199035AF079D</a:ObjectID>
<a:Name>tagName</a:Name>
<a:Code>tagName</a:Code>
<a:CreationDate>1387289880</a:CreationDate>
<a:Creator>MALLON</a:Creator>
<a:ModificationDate>1387289880</a:ModificationDate>
<a:Modifier>MALLON</a:Modifier>
<a:DataType>String</a:DataType>
<a:Attribute.Visibility>-</a:Attribute.Visibility>
</o:Attribute>
</c:Attributes>
</o:Class>
<o:Class Id="o52">
<a:ObjectID>59C8A7A8-951F-4448-9206-768F6327201E</a:ObjectID>
<a:Name>Media</a:Name>
<a:Code>Media</a:Code>
<a:CreationDate>1387290115</a:CreationDate>
<a:Creator>MALLON</a:Creator>
<a:ModificationDate>1397644312</a:ModificationDate>
<a:Modifier>MALLON</a:Modifier>
<a:UseParentNamespace>0</a:UseParentNamespace>
<c:Attributes>
<o:Attribute Id="o120">
<a:ObjectID>F1243B22-CBC0-4D64-87EE-CE6488B2DE8C</a:ObjectID>
<a:Name>name</a:Name>
<a:Code>name</a:Code>
<a:CreationDate>1387290115</a:CreationDate>
<a:Creator>MALLON</a:Creator>
<a:ModificationDate>1387290115</a:ModificationDate>
<a:Modifier>MALLON</a:Modifier>
<a:DataType>String</a:DataType>
<a:Attribute.Visibility>-</a:Attribute.Visibility>
</o:Attribute>
<o:Attribute Id="o121">
<a:ObjectID>D387039C-09AB-4378-AEC0-38564DEFBF96</a:ObjectID>
<a:Name>date</a:Name>
<a:Code>date</a:Code>
<a:CreationDate>1387290115</a:CreationDate>
<a:Creator>MALLON</a:Creator>
<a:ModificationDate>1387290115</a:ModificationDate>
<a:Modifier>MALLON</a:Modifier>
<a:DataType>String</a:DataType>
<a:Attribute.Visibility>-</a:Attribute.Visibility>
</o:Attribute>
<o:Attribute Id="o122">
<a:ObjectID>85E3D603-B4B6-46CE-8995-D2B3A1D627BC</a:ObjectID>
<a:Name>url</a:Name>
<a:Code>url</a:Code>
<a:CreationDate>1387290115</a:CreationDate>
<a:Creator>MALLON</a:Creator>
<a:ModificationDate>1387290115</a:ModificationDate>
<a:Modifier>MALLON</a:Modifier>
<a:DataType>Url</a:DataType>
<a:Attribute.Visibility>-</a:Attribute.Visibility>
</o:Attribute>
<o:Attribute Id="o123">
<a:ObjectID>5B8B9E21-42FA-46BA-A0A0-6054CB88643B</a:ObjectID>
<a:Name>uploadedTo</a:Name>
<a:Code>uploadedTo</a:Code>
<a:CreationDate>1387290115</a:CreationDate>
<a:Creator>MALLON</a:Creator>
<a:ModificationDate>1387290115</a:ModificationDate>
<a:Modifier>MALLON</a:Modifier>
<a:DataType>PostPage</a:DataType>
<a:Attribute.Visibility>-</a:Attribute.Visibility>
</o:Attribute>
</c:Attributes>
</o:Class>
<o:Class Id="o53">
<a:ObjectID>F884DC53-8B83-4BB9-9B85-A52A239CFDDC</a:ObjectID>
<a:Name>Comment</a:Name>
<a:Code>Comment</a:Code>
<a:CreationDate>1387290169</a:CreationDate>
<a:Creator>MALLON</a:Creator>
<a:ModificationDate>1397644400</a:ModificationDate>
<a:Modifier>MALLON</a:Modifier>
<a:UseParentNamespace>0</a:UseParentNamespace>
<c:Attributes>
<o:Attribute Id="o124">
<a:ObjectID>ED11A517-4914-4C57-A25A-A9FDE233DDFC</a:ObjectID>
<a:Name>name</a:Name>
<a:Code>name</a:Code>
<a:CreationDate>1387290169</a:CreationDate>
<a:Creator>MALLON</a:Creator>
<a:ModificationDate>1387290169</a:ModificationDate>
<a:Modifier>MALLON</a:Modifier>
<a:DataType>String</a:DataType>
<a:Attribute.Visibility>-</a:Attribute.Visibility>
</o:Attribute>
<o:Attribute Id="o125">
<a:ObjectID>0DB4D616-3220-4151-B705-38731CF4D8B7</a:ObjectID>
<a:Name>content</a:Name>
<a:Code>content</a:Code>
<a:CreationDate>1387290169</a:CreationDate>
<a:Creator>MALLON</a:Creator>
<a:ModificationDate>1387290169</a:ModificationDate>
<a:Modifier>MALLON</a:Modifier>
<a:DataType>String</a:DataType>
<a:Attribute.Visibility>-</a:Attribute.Visibility>
</o:Attribute>
<o:Attribute Id="o126">
<a:ObjectID>FAE8FCA0-DF3B-49D9-93C7-A2653B9E8D96</a:ObjectID>
<a:Name>authorName</a:Name>
<a:Code>authorName</a:Code>
<a:CreationDate>1387290169</a:CreationDate>
<a:Creator>MALLON</a:Creator>
<a:ModificationDate>1387290169</a:ModificationDate>
<a:Modifier>MALLON</a:Modifier>
<a:DataType>String</a:DataType>
<a:Attribute.Visibility>-</a:Attribute.Visibility>
</o:Attribute>
<o:Attribute Id="o127">
<a:ObjectID>AB9691B1-427E-41C4-B6D4-C30A40E89D92</a:ObjectID>
<a:Name>commentPostPage</a:Name>
<a:Code>commentPostPage</a:Code>
<a:CreationDate>1387290169</a:CreationDate>
<a:Creator>MALLON</a:Creator>
<a:ModificationDate>1387290169</a:ModificationDate>
<a:Modifier>MALLON</a:Modifier>
<a:DataType>PostPage</a:DataType>
<a:Attribute.Visibility>-</a:Attribute.Visibility>
</o:Attribute>
</c:Attributes>
</o:Class>
<o:Class Id="o54">
<a:ObjectID>E1EC1B6E-0075-4DE1-8BDE-97770A46A655</a:ObjectID>
<a:Name>Category</a:Name>
<a:Code>Category</a:Code>
<a:CreationDate>1387290234</a:CreationDate>
<a:Creator>MALLON</a:Creator>
<a:ModificationDate>1397644391</a:ModificationDate>
<a:Modifier>MALLON</a:Modifier>
<a:UseParentNamespace>0</a:UseParentNamespace>
<c:Attributes>
<o:Attribute Id="o128">
<a:ObjectID>9B77033A-3409-4796-9F4F-BA44FED982A9</a:ObjectID>
<a:Name>categoryName</a:Name>
<a:Code>categoryName</a:Code>
<a:CreationDate>1387290234</a:CreationDate>
<a:Creator>MALLON</a:Creator>
<a:ModificationDate>1387290234</a:ModificationDate>
<a:Modifier>MALLON</a:Modifier>
<a:DataType>String</a:DataType>
<a:Attribute.Visibility>-</a:Attribute.Visibility>
</o:Attribute>
<o:Attribute Id="o129">
<a:ObjectID>2B1EF62A-1CD2-4A41-8993-240E4F69E945</a:ObjectID>
<a:Name>childCategories</a:Name>
<a:Code>childCategories</a:Code>
<a:CreationDate>1390825084</a:CreationDate>
<a:Creator>MALLON</a:Creator>
<a:ModificationDate>1390825102</a:ModificationDate>
<a:Modifier>MALLON</a:Modifier>
<a:DataType>Category</a:DataType>
<a:Attribute.Visibility>-</a:Attribute.Visibility>
<c:ObjectDataType>
<o:Class Ref="o54"/>
</c:ObjectDataType>
</o:Attribute>
</c:Attributes>
</o:Class>
</c:Classes>
<c:Associations>
<o:Association Id="o8">
<a:ObjectID>2048F8A1-DD46-43E9-8598-869D67C1C7D8</a:ObjectID>
<a:Name>Association_8</a:Name>
<a:Code>Association_8</a:Code>
<a:CreationDate>1387290349</a:CreationDate>
<a:Creator>MALLON</a:Creator>
<a:ModificationDate>1387291963</a:ModificationDate>
<a:Modifier>MALLON</a:Modifier>
<a:RoleAIndicator>C</a:RoleAIndicator>
<a:RoleAMultiplicity>1..1</a:RoleAMultiplicity>
<a:RoleBMultiplicity>0..*</a:RoleBMultiplicity>
<a:RoleBNavigability>0</a:RoleBNavigability>
<c:Object1>
<o:Class Ref="o50"/>
</c:Object1>
<c:Object2>
<o:Class Ref="o43"/>
</c:Object2>
</o:Association>
<o:Association Id="o11">
<a:ObjectID>67E05CA1-E951-425D-8DCF-27EE679591B7</a:ObjectID>
<a:Name>Association_11</a:Name>
<a:Code>Association_11</a:Code>
<a:CreationDate>1387290496</a:CreationDate>
<a:Creator>MALLON</a:Creator>
<a:ModificationDate>1387291744</a:ModificationDate>
<a:Modifier>MALLON</a:Modifier>
<a:RoleAIndicator>C</a:RoleAIndicator>
<a:RoleBName>users</a:RoleBName>
<a:RoleAMultiplicity>1..1</a:RoleAMultiplicity>
<a:RoleBMultiplicity>0..*</a:RoleBMultiplicity>
<a:RoleBNavigability>0</a:RoleBNavigability>
<c:Object1>
<o:Class Ref="o45"/>
</c:Object1>
<c:Object2>
<o:Class Ref="o43"/>
</c:Object2>
</o:Association>
<o:Association Id="o14">
<a:ObjectID>AFB466CD-6D4B-48C1-B6B5-DAE24B52F02C</a:ObjectID>
<a:Name>Association_12</a:Name>
<a:Code>Association_12</a:Code>
<a:CreationDate>1387290498</a:CreationDate>
<a:Creator>MALLON</a:Creator>
<a:ModificationDate>1387291944</a:ModificationDate>
<a:Modifier>MALLON</a:Modifier>
<a:RoleAIndicator>C</a:RoleAIndicator>
<a:RoleAMultiplicity>0..1</a:RoleAMultiplicity>
<a:RoleBMultiplicity>0..*</a:RoleBMultiplicity>
<a:RoleBNavigability>0</a:RoleBNavigability>
<c:Object1>
<o:Class Ref="o48"/>
</c:Object1>
<c:Object2>
<o:Class Ref="o43"/>
</c:Object2>
</o:Association>
<o:Association Id="o17">
<a:ObjectID>32EBC543-EFE3-4BE9-AAC4-3574721B52F0</a:ObjectID>
<a:Name>Association_14</a:Name>
<a:Code>Association_14</a:Code>
<a:CreationDate>1387290503</a:CreationDate>
<a:Creator>MALLON</a:Creator>
<a:ModificationDate>1387291953</a:ModificationDate>
<a:Modifier>MALLON</a:Modifier>
<a:RoleAIndicator>C</a:RoleAIndicator>
<a:RoleAMultiplicity>1..1</a:RoleAMultiplicity>
<a:RoleBMultiplicity>0..*</a:RoleBMultiplicity>
<a:RoleBNavigability>0</a:RoleBNavigability>
<c:Object1>
<o:Class Ref="o49"/>
</c:Object1>
<c:Object2>
<o:Class Ref="o43"/>
</c:Object2>
</o:Association>
<o:Association Id="o19">
<a:ObjectID>07CBEF9A-BE9F-435B-9571-D524AF3F2D96</a:ObjectID>
<a:Name>Association_15</a:Name>
<a:Code>Association_15</a:Code>
<a:CreationDate>1387292217</a:CreationDate>
<a:Creator>MALLON</a:Creator>
<a:ModificationDate>1387292246</a:ModificationDate>
<a:Modifier>MALLON</a:Modifier>
<a:RoleAMultiplicity>1..1</a:RoleAMultiplicity>
<a:RoleBMultiplicity>1..1</a:RoleBMultiplicity>
<c:Object1>
<o:Class Ref="o45"/>
</c:Object1>
<c:Object2>
<o:Class Ref="o43"/>
</c:Object2>
</o:Association>
<o:Association Id="o22">
<a:ObjectID>46EFFB6D-E8C5-481C-BA34-C1C5509FC21C</a:ObjectID>
<a:Name>Association_16</a:Name>
<a:Code>Association_16</a:Code>
<a:CreationDate>1390825115</a:CreationDate>
<a:Creator>MALLON</a:Creator>
<a:ModificationDate>1390825131</a:ModificationDate>
<a:Modifier>MALLON</a:Modifier>
<a:RoleAIndicator>C</a:RoleAIndicator>
<a:RoleAMultiplicity>0..1</a:RoleAMultiplicity>
<a:RoleBMultiplicity>0..*</a:RoleBMultiplicity>
<a:RoleBNavigability>0</a:RoleBNavigability>
<c:Object1>
<o:Class Ref="o54"/>
</c:Object1>
<c:Object2>
<o:Class Ref="o54"/>
</c:Object2>
</o:Association>
<o:Association Id="o25">
<a:ObjectID>5A079FF4-CAA5-4735-889A-7E0D08FEE759</a:ObjectID>
<a:Name>Association_18</a:Name>
<a:Code>Association_18</a:Code>
<a:CreationDate>1397643950</a:CreationDate>
<a:Creator>MALLON</a:Creator>
<a:ModificationDate>1397644016</a:ModificationDate>
<a:Modifier>MALLON</a:Modifier>
<a:RoleAIndicator>C</a:RoleAIndicator>
<a:RoleAMultiplicity>1..1</a:RoleAMultiplicity>
<a:RoleBMultiplicity>0..*</a:RoleBMultiplicity>
<a:RoleBNavigability>0</a:RoleBNavigability>
<c:Object1>
<o:Class Ref="o46"/>
</c:Object1>
<c:Object2>
<o:Class Ref="o43"/>
</c:Object2>
</o:Association>
<o:Association Id="o28">
<a:ObjectID>80CAA3A4-ACD5-4AC7-BED8-2BBCFB6DA5FB</a:ObjectID>
<a:Name>Association_19</a:Name>
<a:Code>Association_19</a:Code>
<a:CreationDate>1397644147</a:CreationDate>
<a:Creator>MALLON</a:Creator>
<a:ModificationDate>1397644348</a:ModificationDate>
<a:Modifier>MALLON</a:Modifier>
<a:RoleAIndicator>C</a:RoleAIndicator>
<a:RoleAMultiplicity>0..1</a:RoleAMultiplicity>
<a:RoleBMultiplicity>0..*</a:RoleBMultiplicity>
<a:RoleBNavigability>0</a:RoleBNavigability>
<c:Object1>
<o:Class Ref="o51"/>
</c:Object1>
<c:Object2>
<o:Class Ref="o43"/>
</c:Object2>
</o:Association>
<o:Association Id="o31">
<a:ObjectID>F1DEAA2B-A441-4333-A07E-7442DCB87AB4</a:ObjectID>
<a:Name>Association_17</a:Name>
<a:Code>Association_17</a:Code>
<a:CreationDate>1397644303</a:CreationDate>
<a:Creator>MALLON</a:Creator>
<a:ModificationDate>1397644312</a:ModificationDate>
<a:Modifier>MALLON</a:Modifier>
<a:RoleAIndicator>C</a:RoleAIndicator>
<a:RoleAMultiplicity>1..1</a:RoleAMultiplicity>
<a:RoleBMultiplicity>0..*</a:RoleBMultiplicity>
<a:RoleBNavigability>0</a:RoleBNavigability>
<c:Object1>
<o:Class Ref="o52"/>
</c:Object1>
<c:Object2>
<o:Class Ref="o43"/>
</c:Object2>
</o:Association>
<o:Association Id="o33">
<a:ObjectID>14DDBD1E-4D67-472C-A8A4-5B1FA745F7AF</a:ObjectID>
<a:Name>Association_20</a:Name>
<a:Code>Association_20</a:Code>
<a:CreationDate>1397644371</a:CreationDate>
<a:Creator>MALLON</a:Creator>
<a:ModificationDate>1397644391</a:ModificationDate>
<a:Modifier>MALLON</a:Modifier>
<a:RoleAIndicator>C</a:RoleAIndicator>
<a:RoleAMultiplicity>1..1</a:RoleAMultiplicity>
<a:RoleBMultiplicity>0..*</a:RoleBMultiplicity>
<a:RoleBNavigability>0</a:RoleBNavigability>
<c:Object1>
<o:Class Ref="o54"/>
</c:Object1>
<c:Object2>
<o:Class Ref="o43"/>
</c:Object2>
</o:Association>
<o:Association Id="o36">
<a:ObjectID>3E08DFDD-7151-4BCA-92F4-7C5A610FA71E</a:ObjectID>
<a:Name>Association_21</a:Name>
<a:Code>Association_21</a:Code>
<a:CreationDate>1397644375</a:CreationDate>
<a:Creator>MALLON</a:Creator>
<a:ModificationDate>1397644400</a:ModificationDate>
<a:Modifier>MALLON</a:Modifier>
<a:RoleAIndicator>C</a:RoleAIndicator>
<a:RoleAMultiplicity>1..1</a:RoleAMultiplicity>
<a:RoleBMultiplicity>0..*</a:RoleBMultiplicity>
<a:RoleBNavigability>0</a:RoleBNavigability>
<c:Object1>
<o:Class Ref="o53"/>
</c:Object1>
<c:Object2>
<o:Class Ref="o43"/>
</c:Object2>
</o:Association>
<o:Association Id="o39">
<a:ObjectID>72702F06-17A4-496B-A8D9-1AE388224BEC</a:ObjectID>
<a:Name>Association_13</a:Name>
<a:Code>Association_13</a:Code>
<a:CreationDate>1397645469</a:CreationDate>
<a:Creator>MALLON</a:Creator>
<a:ModificationDate>1397645503</a:ModificationDate>
<a:Modifier>MALLON</a:Modifier>
<a:RoleAIndicator>C</a:RoleAIndicator>
<a:RoleAMultiplicity>1..1</a:RoleAMultiplicity>
<a:RoleBMultiplicity>0..1</a:RoleBMultiplicity>
<a:RoleBNavigability>0</a:RoleBNavigability>
<c:Object1>
<o:Class Ref="o44"/>
</c:Object1>
<c:Object2>
<o:Class Ref="o43"/>
</c:Object2>
</o:Association>
<o:Association Id="o42">
<a:ObjectID>1C4C213C-FEA6-4A9B-B38E-CCB5227763AE</a:ObjectID>
<a:Name>Association_22</a:Name>
<a:Code>Association_22</a:Code>
<a:CreationDate>1397645564</a:CreationDate>
<a:Creator>MALLON</a:Creator>
<a:ModificationDate>1397645573</a:ModificationDate>
<a:Modifier>MALLON</a:Modifier>
<a:RoleAIndicator>C</a:RoleAIndicator>
<a:RoleAMultiplicity>1..1</a:RoleAMultiplicity>
<a:RoleBMultiplicity>0..*</a:RoleBMultiplicity>
<a:RoleBNavigability>0</a:RoleBNavigability>
<c:Object1>
<o:Class Ref="o47"/>
</c:Object1>
<c:Object2>
<o:Class Ref="o43"/>
</c:Object2>
</o:Association>
</c:Associations>
<c:TargetModels>
<o:TargetModel Id="o130">
<a:ObjectID>619E8FCB-4C70-422B-8D52-E868B944FBEF</a:ObjectID>
<a:Name>Analyse</a:Name>
<a:Code>Analysis</a:Code>
<a:CreationDate>1387288459</a:CreationDate>
<a:Creator>MALLON</a:Creator>
<a:ModificationDate>1395837622</a:ModificationDate>
<a:Modifier>MALLON</a:Modifier>
<a:TargetModelURL>file:///%_OBJLANG%/analysis.xol</a:TargetModelURL>
<a:TargetModelID>87317290-AF03-469F-BC1E-99593F18A4AB</a:TargetModelID>
<a:TargetModelClassID>1811206C-1A4B-11D1-83D9-444553540000</a:TargetModelClassID>
<c:SessionShortcuts>
<o:Shortcut Ref="o3"/>
</c:SessionShortcuts>
</o:TargetModel>
<o:TargetModel Id="o131">
<a:ObjectID>30B60354-E239-4190-AF06-EA5AEEEF8BED</a:ObjectID>
<a:Name>WOCMM</a:Name>
<a:Code>WOCMM</a:Code>
<a:ExtractionID>2097264</a:ExtractionID>
<a:CreationDate>1387289825</a:CreationDate>
<a:Creator>MALLON</a:Creator>
<a:ModificationDate>1387289825</a:ModificationDate>
<a:Modifier>MALLON</a:Modifier>
<a:TargetModelURL>file:///C|/Users/MALLON/Desktop/Mind map and wordpress/ressources/WOCSL.moo</a:TargetModelURL>
<a:TargetModelID>A8D4F60E-2A67-4A77-9767-87403EE48F96</a:TargetModelID>
<a:TargetModelClassID>18112060-1A4B-11D1-83D9-444553540000</a:TargetModelClassID>
<c:SessionShortcuts>
<o:Shortcut Ref="o96"/>
<o:Shortcut Ref="o94"/>
<o:Shortcut Ref="o92"/>
<o:Shortcut Ref="o90"/>
<o:Shortcut Ref="o88"/>
<o:Shortcut Ref="o86"/>
<o:Shortcut Ref="o84"/>
<o:Shortcut Ref="o82"/>
<o:Shortcut Ref="o80"/>
<o:Shortcut Ref="o77"/>
</c:SessionShortcuts>
</o:TargetModel>
</c:TargetModels>
</o:Model>
</c:Children>
</o:RootObject>

</Model>