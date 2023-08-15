static const char *cpp_unique_options =
"%{!Q:-quiet} %{nostdinc*} %{C} %{CC} %{v} %{I*&F*} %{P} %I"
 
/* This contains cpp options which are common with cc1_options and are passed
   only when preprocessing only to avoid duplication.  We pass the cc1 spec
   options to the preprocessor so that it the cc1 spec may manipulate
   options used to set target flags.  Those special target flags settings may
   in turn cause preprocessor symbols to be defined specially.  */

static const char *cpp_options =
"%(cpp_unique_options) %1 %{m*} %{std*&ansi&trigraphs} %{W*&pedantic*} %{w}\
 %{f*} %{g*:%{%:debug-level-gt(0):%{g*}\
 %{!fno-working-directory:-fworking-directory}}} %{O*}\
 %{undef} %{save-temps*:-fpch-preprocess}";