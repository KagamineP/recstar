package ui.string

import const.APP_NAME
import ui.string.Strings.*

@Suppress("REDUNDANT_ELSE_IN_WHEN")
fun Strings.zhHans(): String? =
    when (this) {
        CommonOkay -> "确定"
        CommonCancel -> "取消"
        CommonYes -> "是"
        CommonNo -> "否"
        CommonBack -> "返回"
        CommonMore -> "更多"
        CommonError -> "错误"
        CommonEdit -> "编辑"
        CommonCheck -> "选择"
        CommonImport -> "导入"
        AlertNeedManualPermissionGrantTitle -> "无权限"
        AlertNeedManualPermissionGrantMessage -> "应用需要您的录音权限，请在系统设置中授予。"
        ErrorReadFileFailedMessage -> "无法读取文件。"
        ErrorExportDataFailedMessage -> "导出数据失败。"
        ExceptionRenameSessionExisting -> "已存在名为 {0} 的会话。"
        ExceptionRenameSessionInvalid -> "无效的会话名：{0}"
        ExceptionRenameSessionUnexpected -> "重命名会话失败。"
        AlertExportTips ->
            "在 iOS 和 macOS 上录制的文件可能具有带有特殊字符的文件名。" +
                "在 Windows 上使用其他软件读取这些文件之前，请将文件名规范化为 NFC 格式。" +
                "您可以使用 `vLabeler` 应用程序的「工具」菜单中的「文件名规范化」工具来执行此操作。"
        ToastExportDataSuccess -> "导出成功"
        ToastExportDataCancel -> "导出已被取消"
        ToastImportReclistSuccess -> "导入成功"
        ToastImportReclistFailure -> "导入失败"
        AlertUnexpectedErrorOpenLog -> "发生错误。请将错误日志文件提交给开发者。"
        AlertUnexpectedErrorOpenLogButton -> "打开日志目录"
        AlertUnexpectedErrorCopyLogToClipboard -> "发生错误。请将错误信息提交给开发者。"
        AlertUnexpectedErrorCopyLogToClipboardButton -> "复制错误信息"
        MainScreenAllSessions -> "所有会话"
        MainScreenItemSelecting -> "已选 {0} 项"
        MainScreenNewSession -> "开始新会话"
        MainScreenEmpty -> "暂无会话。"
        MainScreenDeleteItemsTitle -> "删除会话"
        MainScreenDeleteItemsMessage -> "确定要删除 {0} 个会话吗？录音文件将从设备中完全删除。"
        SessionScreenCurrentSentenceLabel -> "正在录制："
        SessionScreenCommentEmpty -> "无注释。"
        SessionScreenNoData -> "暂无数据。"
        SessionScreenActionOpenDirectory -> "打开目录"
        SessionScreenActionExport -> "导出"
        SessionScreenActionRenameSession -> "重命名会话"
        SessionScreenActionConfigureGuideAudio -> "设置 BGM"
        SessionScreenActionSkipFinishedSentence -> "跳过已录制的句子"
        SessionScreenTogglePlaying -> "播放/停止"
        SessionScreenNoGuideAudio -> "未设置"
        SessionScreenAlertGuideAudioNotFoundMessage -> "找不到 BGM 文件。请重新设置 BGM。"
        CreateSessionReclistScreenTitle -> "选择录音表"
        CreateSessionReclistScreenActionImport -> "导入录音表"
        CreateSessionReclistScreenActionImportCommentAlertMessage -> "是否要继续导入对应的注释文件（-comment.txt）？"
        CreateSessionReclistScreenAllReclists -> "全部录音表"
        CreateSessionReclistScreenEmpty -> "请先导入录音表。"
        CreateSessionReclistScreenContinue -> "完成"
        CreateSessionReclistScreenFailure -> "创建会话失败。"
        CreateSessionReclistScreenDeleteItemsTitle -> "删除录音表"
        CreateSessionReclistScreenDeleteItemsMessage -> "确定要删除 {0} 个录音表吗？"
        GuideAudioScreenTitle -> "设置 BGM"
        GuideAudioScreenActionImport -> "导入 BGM"
        GuideAudioScreenActionImportConfigAlertMessage -> "是否要继续导入对应的 BGM 配置文件（.txt）？"
        GuideAudioScreenAllGuideAudios -> "全部 BGM"
        GuideAudioScreenEmpty -> "请先导入 BGM。"
        GuideAudioScreenItemSelectedLabel -> "已选"
        GuideAudioScreenDeleteItemsTitle -> "删除 BGM"
        GuideAudioScreenDeleteItemsMessage -> "确定要删除 {0} 个 BGM 吗？"
        SortingMethod -> "排序方式"
        SortingMethodNameAsc -> "名称（升序）"
        SortingMethodNameDesc -> "名称（降序）"
        SortingMethodUsedAsc -> "最近使用（升序）"
        SortingMethodUsedDesc -> "最近使用（降序）"
        PreferenceScreenTitle -> "设置"
        PreferenceGroupAppearance -> "外观"
        PreferenceLanguage -> "语言"
        PreferenceLanguageAuto -> "自动"
        PreferenceTheme -> "主题"
        PreferenceThemeSystem -> "跟随系统"
        PreferenceThemeLight -> "浅色"
        PreferenceThemeDark -> "深色"
        PreferenceOrientation -> "屏幕方向"
        PreferenceOrientationAuto -> "自动"
        PreferenceOrientationPortrait -> "垂直"
        PreferenceOrientationLandscape -> "水平"
        PreferenceGroupRecording -> "录音"
        PreferenceContinuousRecording -> "连续录音"
        PreferenceContinuousRecordingDescription -> "基于 BGM 设置"
        PreferenceTrimRecording -> "裁剪录音"
        PreferenceTrimRecordingDescription -> "基于 BGM 设置"
        PreferenceRecordWhileHolding -> "按住按钮时录音"
        PreferenceRecordingShortKey -> "录音快捷键"
        PreferenceRecordingShortKeyEnter -> "回车"
        PreferenceRecordingShortKeyR -> "R"
        PreferenceAutoListenBack -> "录音后自动回放"
        PreferenceAutoListenBackDescription -> "连续录音模式下无效"
        PreferenceAutoNext -> "录音后自动跳转到下一句"
        PreferenceAutoNextDescription -> "连续录音模式下无效"
        PreferenceGroupView -> "视图"
        PreferenceTitleBarStyle -> "标题栏样式"
        PreferenceTitleBarStyleFileName -> "仅文件名"
        PreferenceTitleBarStyleFileNameWithComment -> "文件名 + 注释（小）"
        PreferenceTitleBarStyleCommentWithFileName -> "注释 + 文件名（小）"
        PreferenceTitleBarStyleComment -> "仅注释"
        PreferenceGroupMisc -> "其他"
        PreferenceContentRootLocation -> "内容目录所在位置"
        PreferenceAbout -> "关于 $APP_NAME"
        AboutScreenPrivacyPolicy -> "隐私政策"
        AboutScreenCopyDeviceInfo -> "复制设备信息"
        AboutScreenDeviceInfoCopied -> "已将设备信息复制到剪贴板"
        AboutScreenViewOnGithub -> "在 GitHub 上查看"
        MenuFile -> "文件"
        MenuFileNewSession -> "开始新会话"
        MenuFileImportReclist -> "导入录音表"
        MenuFileImportGuideAudio -> "导入 BGM"
        MenuFileOpenDirectory -> "打开目录"
        MenuFileBack -> "返回"
        MenuEdit -> "编辑"
        MenuEditRenameSession -> "重命名会话"
        MenuEditConfigureGuideAudio -> "设置 BGM"
        MenuEditEditList -> "编辑列表"
        MenuAction -> "操作"
        MenuActionNextSentence -> "下一句"
        MenuActionPreviousSentence -> "上一句"
        MenuActionToggleRecording -> "录制/停止"
        MenuActionToggleRecordingHoldingMode -> "录制/停止（仅快捷键可用）"
        MenuSettings -> "设置"
        MenuSettingsOpenSettings -> "打开设置"
        MenuSettingsClearSettings -> "清除设置"
        MenuSettingsClearSettingsAlertMessage ->
            "确定要清除所有设置吗？您的会话数据和已导入的资源文件（如录音表和 BGM）将不会被删除。应用将在该操作后关闭。"
        MenuHelp -> "帮助"
        MenuHelpOpenContentDirectory -> "打开内容目录"
        MenuHelpOpenAppDirectory -> "打开应用目录"
        MenuHelpAbout -> "关于"
        else -> null
    }
