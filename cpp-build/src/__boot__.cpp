#include <hxcpp.h>

#ifndef INCLUDED_haxe_Log
#include <haxe/Log.h>
#endif
#ifndef INCLUDED_EReg
#include <EReg.h>
#endif
#ifndef INCLUDED_Test
#include <Test.h>
#endif
#ifndef INCLUDED_Std
#include <Std.h>
#endif
#ifndef INCLUDED_Parser
#include <Parser.h>
#endif
#ifndef INCLUDED_cpp_Lib
#include <cpp/Lib.h>
#endif
#ifndef INCLUDED_CSSValue
#include <CSSValue.h>
#endif

void __files__boot();

void __boot_all()
{
__files__boot();
hx::RegisterResources( hx::GetResources() );
::haxe::Log_obj::__register();
::EReg_obj::__register();
::Test_obj::__register();
::Std_obj::__register();
::Parser_obj::__register();
::cpp::Lib_obj::__register();
::CSSValue_obj::__register();
::EReg_obj::__boot();
::haxe::Log_obj::__boot();
}

