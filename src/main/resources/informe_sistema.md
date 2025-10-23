# Informe de Recursos del Sistema
**Fecha de generación:** 2025-10-22 19:49:14

## Procesos en Ejecución
```bash
USER         PID %CPU %MEM    VSZ   RSS TTY      STAT START   TIME COMMAND
root           1  0.1  0.2 167788  8236 ?        Ss   19:16   0:02 /sbin/init
root           2  0.0  0.0      0     0 ?        S    19:16   0:00 [kthreadd]
root           3  0.0  0.0      0     0 ?        I<   19:16   0:00 [rcu_gp]
root           4  0.0  0.0      0     0 ?        I<   19:16   0:00 [rcu_par_gp]
root           5  0.0  0.0      0     0 ?        I<   19:16   0:00 [slub_flushwq]
root           6  0.0  0.0      0     0 ?        I<   19:16   0:00 [netns]
root           7  0.2  0.0      0     0 ?        I    19:16   0:05 [kworker/0:0-events]
root           8  0.0  0.0      0     0 ?        I<   19:16   0:00 [kworker/0:0H-events_highpri]
root          10  0.0  0.0      0     0 ?        I<   19:16   0:00 [mm_percpu_wq]
root          11  0.0  0.0      0     0 ?        I    19:16   0:00 [rcu_tasks_kthread]
root          12  0.0  0.0      0     0 ?        I    19:16   0:00 [rcu_tasks_rude_kthread]
root          13  0.0  0.0      0     0 ?        I    19:16   0:00 [rcu_tasks_trace_kthread]
root          14  0.1  0.0      0     0 ?        S    19:16   0:03 [ksoftirqd/0]
root          15  0.6  0.0      0     0 ?        I    19:16   0:13 [rcu_preempt]
root          16  0.0  0.0      0     0 ?        S    19:16   0:00 [migration/0]
root          18  0.0  0.0      0     0 ?        S    19:16   0:00 [cpuhp/0]
root          19  0.0  0.0      0     0 ?        S    19:16   0:00 [cpuhp/1]
root          20  0.0  0.0      0     0 ?        S    19:16   0:00 [migration/1]
root          21  0.0  0.0      0     0 ?        S    19:16   0:00 [ksoftirqd/1]
root          23  0.0  0.0      0     0 ?        I<   19:16   0:00 [kworker/1:0H-events_highpri]
root          24  0.0  0.0      0     0 ?        S    19:16   0:00 [cpuhp/2]
root          25  0.0  0.0      0     0 ?        S    19:16   0:00 [migration/2]
root          26  0.0  0.0      0     0 ?        S    19:16   0:00 [ksoftirqd/2]
root          27  0.0  0.0      0     0 ?        I    19:16   0:01 [kworker/2:0-mm_percpu_wq]
root          28  0.0  0.0      0     0 ?        I<   19:16   0:00 [kworker/2:0H-kblockd]
root          29  0.0  0.0      0     0 ?        S    19:16   0:00 [cpuhp/3]
root          30  0.0  0.0      0     0 ?        S    19:16   0:00 [migration/3]
root          31  0.0  0.0      0     0 ?        S    19:16   0:00 [ksoftirqd/3]
root          32  0.0  0.0      0     0 ?        I    19:16   0:00 [kworker/3:0-mm_percpu_wq]
root          33  0.0  0.0      0     0 ?        I<   19:16   0:00 [kworker/3:0H-events_highpri]
root          34  0.0  0.0      0     0 ?        S    19:16   0:00 [cpuhp/4]
root          35  0.0  0.0      0     0 ?        S    19:16   0:00 [migration/4]
root          36  0.2  0.0      0     0 ?        S    19:16   0:04 [ksoftirqd/4]
root          38  0.0  0.0      0     0 ?        I<   19:16   0:00 [kworker/4:0H-events_highpri]
root          42  0.0  0.0      0     0 ?        S    19:16   0:00 [kdevtmpfs]
root          43  0.0  0.0      0     0 ?        I<   19:16   0:00 [inet_frag_wq]
root          44  0.0  0.0      0     0 ?        S    19:16   0:00 [kauditd]
root          45  0.0  0.0      0     0 ?        S    19:16   0:00 [khungtaskd]
root          46  0.0  0.0      0     0 ?        S    19:16   0:00 [oom_reaper]
root          47  0.0  0.0      0     0 ?        I<   19:16   0:00 [writeback]
root          48  0.3  0.0      0     0 ?        S    19:16   0:07 [kcompactd0]
root          49  0.0  0.0      0     0 ?        SN   19:16   0:00 [ksmd]
root          50  0.0  0.0      0     0 ?        SN   19:16   0:00 [khugepaged]
root          51  0.0  0.0      0     0 ?        I<   19:16   0:00 [kintegrityd]
root          52  0.0  0.0      0     0 ?        I<   19:16   0:00 [kblockd]
root          53  0.0  0.0      0     0 ?        I<   19:16   0:00 [blkcg_punt_bio]
root          54  0.0  0.0      0     0 ?        I<   19:16   0:00 [tpm_dev_wq]
root          55  0.0  0.0      0     0 ?        I<   19:16   0:00 [edac-poller]
root          56  0.0  0.0      0     0 ?        I<   19:16   0:00 [devfreq_wq]
root          59  0.9  0.0      0     0 ?        S    19:16   0:17 [kswapd0]
root          69  0.0  0.0      0     0 ?        I<   19:16   0:00 [kthrotld]
root          71  0.0  0.0      0     0 ?        I<   19:16   0:00 [acpi_thermal_pm]
root          73  0.0  0.0      0     0 ?        I<   19:16   0:00 [mld]
root          74  0.1  0.0      0     0 ?        I<   19:16   0:02 [kworker/0:1H-kblockd]
root          75  0.0  0.0      0     0 ?        I<   19:16   0:00 [ipv6_addrconf]
root          80  0.0  0.0      0     0 ?        I<   19:16   0:00 [kstrp]
root          83  0.0  0.0      0     0 ?        I<   19:16   0:00 [zswap-shrink]
root          84  0.0  0.0      0     0 ?        I<   19:16   0:00 [kworker/u11:0]
root         165  0.0  0.0      0     0 ?        I<   19:16   0:01 [kworker/1:1H-kblockd]
root         173  0.0  0.0      0     0 ?        I<   19:16   0:01 [kworker/3:1H-kblockd]
root         174  0.5  0.0      0     0 ?        I<   19:16   0:10 [kworker/4:1H-kblockd]
root         194  0.0  0.0      0     0 ?        I<   19:16   0:00 [ata_sff]
root         196  0.0  0.0      0     0 ?        I    19:16   0:01 [kworker/1:2-mm_percpu_wq]
root         197  0.0  0.0      0     0 ?        S    19:16   0:00 [scsi_eh_0]
root         198  0.0  0.0      0     0 ?        I<   19:16   0:00 [scsi_tmf_0]
root         199  0.0  0.0      0     0 ?        S    19:16   0:00 [scsi_eh_1]
root         200  0.0  0.0      0     0 ?        I<   19:16   0:00 [scsi_tmf_1]
root         201  0.0  0.0      0     0 ?        S    19:16   0:00 [scsi_eh_2]
root         202  0.0  0.0      0     0 ?        I<   19:16   0:00 [scsi_tmf_2]
root         207  0.0  0.0      0     0 ?        S    19:16   0:00 [irq/18-vmwgfx]
root         214  0.0  0.0      0     0 ?        I<   19:16   0:00 [kdmflush/254:0]
root         215  0.0  0.0      0     0 ?        I<   19:16   0:00 [kdmflush/254:1]
root         218  0.0  0.0      0     0 ?        I<   19:16   0:00 [kdmflush/254:2]
root         220  0.0  0.0      0     0 ?        I<   19:16   0:00 [kdmflush/254:3]
root         222  0.0  0.0      0     0 ?        I<   19:16   0:00 [kdmflush/254:4]
root         268  0.0  0.0      0     0 ?        S    19:16   0:00 [jbd2/dm-0-8]
root         269  0.0  0.0      0     0 ?        I<   19:16   0:00 [ext4-rsv-conver]
root         318  0.0  0.1  49520  7332 ?        Ss   19:16   0:00 /lib/systemd/systemd-journald
root         341  0.0  0.0  27300  3888 ?        Ss   19:16   0:00 /lib/systemd/systemd-udevd
root         403  0.0  0.0      0     0 ?        I<   19:16   0:00 [cryptd]
root         406  0.0  0.0      0     0 ?        S    19:16   0:00 [jbd2/dm-1-8]
root         407  0.0  0.0      0     0 ?        I<   19:16   0:00 [iprt-VBoxWQueue]
root         408  0.0  0.0      0     0 ?        I<   19:16   0:00 [ext4-rsv-conver]
root         428  0.0  0.0      0     0 ?        S    19:16   0:00 [jbd2/dm-3-8]
root         431  0.0  0.0      0     0 ?        I<   19:16   0:00 [ext4-rsv-conver]
root         442  0.1  0.0      0     0 ?        S    19:16   0:02 [jbd2/dm-4-8]
root         445  0.0  0.0      0     0 ?        I<   19:16   0:00 [ext4-rsv-conver]
root         495  0.0  0.0      0     0 ?        I<   19:16   0:01 [kworker/2:2H-kblockd]
root         539  0.0  0.0      0     0 ?        I<   19:16   0:00 [ext4-rsv-conver]
avahi        577  0.0  0.0   8300  3300 ?        Ss   19:16   0:00 avahi-daemon: running [debian12.local]
root         579  0.0  0.0   6616  2608 ?        Ss   19:16   0:00 /usr/sbin/cron -f
message+     582  0.0  0.1   9616  4420 ?        Ss   19:16   0:00 /usr/bin/dbus-daemon --system --address=systemd: --nofork --nopidfile --systemd-activation --syslog-only
root         587  0.0  0.1  25368  4740 ?        Ss   19:16   0:00 /lib/systemd/systemd-logind
root         588  0.0  0.1 395068  7220 ?        Ssl  19:16   0:00 /usr/libexec/udisks2/udisksd
avahi        590  0.0  0.0   8112   336 ?        S    19:16   0:00 avahi-daemon: chroot helper
root         602  0.0  0.0  16548  3284 ?        Ss   19:16   0:00 /sbin/wpa_supplicant -u -s -O DIR=/run/wpa_supplicant GROUP=netdev
root         616  0.0  0.0   5876  3248 ?        Ss   19:16   0:00 dhclient -4 -v -i -pf /run/dhclient.enp0s3.pid -lf /var/lib/dhcp/dhclient.enp0s3.leases -I -df /var/lib/dhcp/dhclient6.enp0s3.leases enp0s3
polkitd      627  0.0  0.1 309556  6820 ?        Ssl  19:16   0:00 /usr/lib/polkit-1/polkitd --no-debug
root         780  0.2  0.4 1949536 17196 ?       Ssl  19:16   0:05 /usr/bin/containerd
root         785  0.0  0.1 308728  4132 ?        Ssl  19:16   0:00 /usr/sbin/lightdm
root         801  0.0  0.1  15448  5988 ?        Ss   19:16   0:00 sshd: /usr/sbin/sshd -D [listener] 0 of 10-100 startups
root         806  0.2  0.0 286764   996 ?        Sl   19:16   0:04 /usr/bin/VBoxDRMClient
root         808  0.0  0.0 292900  2272 ?        Sl   19:16   0:01 /usr/sbin/VBoxService --pidfile /var/run/vboxadd-service.sh
root         835  0.0  0.0   5880  1028 tty1     Ss+  19:16   0:00 /sbin/agetty -o -p -- \u --noclear - linux
root         836 10.0  2.4 545380 96296 tty7     Rsl+ 19:16   3:14 /usr/lib/xorg/Xorg :0 -seat seat0 -auth /var/run/lightdm/root/:0 -nolisten tcp vt7 -novtswitch
root         848  0.1  0.5 2047932 23716 ?       Ssl  19:16   0:03 /usr/bin/dockerd -H fd:// --containerd=/run/containerd/containerd.sock
root         882  0.0  0.1 162516  4440 ?        Sl   19:16   0:00 lightdm --session-child 15 18
debian       893  0.0  0.1  19252  6764 ?        Ss   19:16   0:00 /lib/systemd/systemd --user
debian       895  0.0  0.0 168948  2440 ?        S    19:16   0:00 (sd-pam)
debian       964  0.0  0.1 425088  7252 ?        S<sl 19:16   0:00 /usr/bin/pulseaudio --daemonize=no --log-target=journal
debian       974  0.0  0.2 250204  9572 ?        Ssl  19:16   0:00 /usr/bin/lxsession -s LXDE -e LXDE
debian       997  0.0  0.1   9412  4024 ?        Ss   19:16   0:00 /usr/bin/dbus-daemon --session --address=systemd: --nofork --nopidfile --systemd-activation --syslog-only
rtkit       1009  0.0  0.0  22708  1184 ?        SNsl 19:16   0:00 /usr/libexec/rtkit-daemon
debian      1127  0.0  0.0  19184    60 ?        S    19:16   0:00 /usr/bin/VBoxClient --clipboard
debian      1128  0.0  0.0 217372  2524 ?        Sl   19:16   0:00 /usr/bin/VBoxClient --clipboard
debian      1144  0.0  0.0  19184    88 ?        S    19:16   0:00 /usr/bin/VBoxClient --seamless
debian      1146  0.4  0.0 217472  1440 ?        Sl   19:16   0:07 /usr/bin/VBoxClient --seamless
debian      1149  0.0  0.0  19184    92 ?        S    19:16   0:00 /usr/bin/VBoxClient --draganddrop
debian      1152  0.9  0.0 217988  1428 ?        Sl   19:16   0:18 /usr/bin/VBoxClient --draganddrop
debian      1163  0.0  0.0  19184    76 ?        S    19:16   0:00 /usr/bin/VBoxClient --vmsvga-session
debian      1165  0.1  0.0 217444  1372 ?        Sl   19:16   0:02 /usr/bin/VBoxClient --vmsvga-session
debian      1171  0.0  0.0   7700    40 ?        Ss   19:16   0:00 /usr/bin/ssh-agent x-session-manager
debian      1212  0.0  0.1 237524  5432 ?        Ssl  19:16   0:00 /usr/libexec/gvfsd
debian      1217  0.0  0.1 380384  5796 ?        Sl   19:16   0:00 /usr/libexec/gvfsd-fuse /run/user/1000/gvfs -f
debian      1226  0.0  0.3 232684 15492 ?        S    19:16   0:01 openbox --config-file /home/debian/.config/openbox/lxde-rc.xml
debian      1234  0.0  0.1 179072  6944 ?        Sl   19:16   0:00 lxpolkit
debian      1245  0.2  0.7 976616 28416 ?        Sl   19:16   0:04 lxpanel --profile LXDE
debian      1248  0.0  0.6 666468 25932 ?        Sl   19:16   0:01 pcmanfm --desktop --profile LXDE
debian      1254  0.1  0.0   6632  2372 ?        S    19:16   0:02 xscreensaver -no-splash
debian      1259  0.0  0.1 311216  4540 ?        Sl   19:16   0:00 /usr/libexec/at-spi-bus-launcher --launch-immediately
debian      1261  0.0  0.0   7700     0 ?        Ss   19:16   0:00 /usr/bin/ssh-agent -s
debian      1273  0.0  0.0   9640  2872 ?        S    19:16   0:00 xscreensaver-systemd
debian      1286  0.0  0.0   9000  3212 ?        S    19:16   0:00 /usr/bin/dbus-daemon --config-file=/usr/share/defaults/at-spi2/accessibility.conf --nofork --print-address 11 --address=unix:path=/run/user/1000/at-spi/bus_0
debian      1325  0.0  0.0 156904  3056 ?        Sl   19:16   0:00 /usr/lib/menu-cache/menu-cached /run/user/1000/menu-cached-:0
debian      1352  0.0  0.0 156332  2692 ?        Ssl  19:16   0:00 /usr/libexec/dconf-service
debian      1358  0.0  0.1 351368  7144 ?        Ssl  19:16   0:00 /usr/libexec/gvfs-udisks2-volume-monitor
debian      1363  0.0  0.1 233528  4584 ?        Ssl  19:16   0:00 /usr/libexec/gvfs-goa-volume-monitor
debian      1367  0.0  0.1 233364  4332 ?        Ssl  19:16   0:00 /usr/libexec/gvfs-mtp-volume-monitor
debian      1371  0.0  0.1 312436  6496 ?        Ssl  19:16   0:00 /usr/libexec/gvfs-afc-volume-monitor
debian      1376  0.0  0.1 234320  4500 ?        Ssl  19:16   0:00 /usr/libexec/gvfs-gphoto2-volume-monitor
debian      1385  0.0  0.1 311632  4992 ?        Sl   19:16   0:00 /usr/libexec/gvfsd-trash --spawner :1.5 /org/gtk/gvfs/exec_spaw/0
debian      1398  3.4  2.6 1461504212 106724 ?   Sl   19:17   1:05 /usr/share/code/code
debian      1401  0.0  0.3 33807628 14972 ?      S    19:17   0:00 /usr/share/code/code --type=zygote --no-zygote-sandbox
debian      1402  0.0  0.4 33807616 17436 ?      S    19:17   0:00 /usr/share/code/code --type=zygote
debian      1404  0.0  0.1 33807644 5932 ?       S    19:17   0:00 /usr/share/code/code --type=zygote
debian      1423  0.0  0.0 33575840 2280 ?       Sl   19:17   0:00 /usr/share/code/chrome_crashpad_handler --monitor-self-annotation=ptype=crashpad-handler --no-rate-limit --database=/home/debian/.config/Code/Crashpad --url=appcenter://code?aid=fba07a4d-84bd-4fc8-a125-9640fc8ce171&uid=155fbaff-9f22-42f4-9e7f-6ee12fab7f8b&iid=155fbaff-9f22-42f4-9e7f-6ee12fab7f8b&sid=155fbaff-9f22-42f4-9e7f-6ee12fab7f8b --annotation=_companyName=Microsoft --annotation=_productName=VSCode --annotation=_version=1.103.2 --annotation=lsb-release=Debian GNU/Linux 12 (bookworm) --annotation=plat=Linux --annotation=prod=Electron --annotation=ver=37.2.3 --initial-client-fd=43 --shared-client-connection
debian      1435  0.0  0.2 537668 11176 ?        Ssl  19:17   0:00 /usr/libexec/xdg-desktop-portal
debian      1438  7.0  5.4 34232668 217724 ?     Sl   19:17   2:13 /usr/share/code/code --type=zygote --no-zygote-sandbox
debian      1444  0.0  0.1 534088  6948 ?        Ssl  19:17   0:00 /usr/libexec/xdg-document-portal
debian      1449  0.0  0.0 236708  3388 ?        Ssl  19:17   0:00 /usr/libexec/xdg-permission-store
debian      1450  0.4  0.7 33866132 30684 ?      Sl   19:17   0:08 /proc/self/exe --type=utility --utility-sub-type=network.mojom.NetworkService --lang=es --service-sandbox-type=none --crashpad-handler-pid=1423 --enable-crash-reporter=e581a95d-79e2-4b0e-8cd4-f0f7a2ff6cc1,no_channel --user-data-dir=/home/debian/.config/Code --standard-schemes=vscode-webview,vscode-file --enable-sandbox --secure-schemes=vscode-webview,vscode-file --cors-schemes=vscode-webview,vscode-file --fetch-schemes=vscode-webview,vscode-file --service-worker-schemes=vscode-webview --code-cache-schemes=vscode-webview,vscode-file --shared-files=v8_context_snapshot_data:100 --field-trial-handle=3,i,5311286946587817577,16475212634692565604,262144 --enable-features=DocumentPolicyIncludeJSCallStacksInCrashReports,EarlyEstablishGpuChannel,EstablishGpuChannelAsync --disable-features=CalculateNativeWinOcclusion,FontationsLinuxSystemFonts,ScreenAIOCREnabled,SpareRendererForSitePerProcess --variations-seed-version
root        1456  0.0  0.0   2488   828 ?        Ss   19:17   0:00 fusermount3 -o rw,nosuid,nodev,fsname=portal,auto_unmount,subtype=portal -- /run/user/1000/doc
debian      1460  0.0  0.3 335376 14632 ?        Ssl  19:17   0:00 /usr/libexec/xdg-desktop-portal-gtk
debian      1472  0.0  0.1 164400  5240 ?        Sl   19:17   0:01 /usr/libexec/at-spi2-registryd --use-gnome-session
debian      1480  0.0  0.1 239636  5420 ?        Sl   19:17   0:00 /usr/bin/gnome-keyring-daemon --start --foreground --components=secrets
debian      1481  0.0  0.1 313648  7324 ?        SLsl 19:17   0:00 /usr/bin/gnome-keyring-daemon --foreground --components=pkcs11,secrets --control-directory=/run/user/1000/keyring
debian      1506 21.1 13.3 1479896048 533952 ?   Sl   19:17   6:38 /usr/share/code/code --type=zygote
debian      1535  1.5  1.5 1461293660 62792 ?    Sl   19:17   0:28 /proc/self/exe --type=utility --utility-sub-type=node.mojom.NodeService --lang=es --service-sandbox-type=none --crashpad-handler-pid=1423 --enable-crash-reporter=e581a95d-79e2-4b0e-8cd4-f0f7a2ff6cc1,no_channel --user-data-dir=/home/debian/.config/Code --standard-schemes=vscode-webview,vscode-file --enable-sandbox --secure-schemes=vscode-webview,vscode-file --cors-schemes=vscode-webview,vscode-file --fetch-schemes=vscode-webview,vscode-file --service-worker-schemes=vscode-webview --code-cache-schemes=vscode-webview,vscode-file --shared-files=v8_context_snapshot_data:100 --field-trial-handle=3,i,5311286946587817577,16475212634692565604,262144 --enable-features=DocumentPolicyIncludeJSCallStacksInCrashReports,EarlyEstablishGpuChannel,EstablishGpuChannelAsync --disable-features=CalculateNativeWinOcclusion,FontationsLinuxSystemFonts,ScreenAIOCREnabled,SpareRendererForSitePerProcess --variations-seed-version
debian      1969  0.0  0.1 385464  4700 ?        Sl   19:19   0:00 /usr/libexec/gvfsd-network --spawner :1.5 /org/gtk/gvfs/exec_spaw/1
debian      1993  0.0  0.1 313740  7744 ?        Sl   19:19   0:00 /usr/libexec/gvfsd-dnssd --spawner :1.5 /org/gtk/gvfs/exec_spaw/3
debian      2159  0.5  1.1 1461310604 44916 ?    Sl   19:19   0:09 /proc/self/exe --type=utility --utility-sub-type=node.mojom.NodeService --lang=es --service-sandbox-type=none --crashpad-handler-pid=1423 --enable-crash-reporter=e581a95d-79e2-4b0e-8cd4-f0f7a2ff6cc1,no_channel --user-data-dir=/home/debian/.config/Code --standard-schemes=vscode-webview,vscode-file --enable-sandbox --secure-schemes=vscode-webview,vscode-file --cors-schemes=vscode-webview,vscode-file --fetch-schemes=vscode-webview,vscode-file --service-worker-schemes=vscode-webview --code-cache-schemes=vscode-webview,vscode-file --shared-files=v8_context_snapshot_data:100 --field-trial-handle=3,i,5311286946587817577,16475212634692565604,262144 --enable-features=DocumentPolicyIncludeJSCallStacksInCrashReports,EarlyEstablishGpuChannel,EstablishGpuChannelAsync --disable-features=CalculateNativeWinOcclusion,FontationsLinuxSystemFonts,ScreenAIOCREnabled,SpareRendererForSitePerProcess --variations-seed-version
debian      2169  9.9 14.3 1463013968 575800 ?   Sl   19:19   2:56 /proc/self/exe --type=utility --utility-sub-type=node.mojom.NodeService --lang=es --service-sandbox-type=none --dns-result-order=ipv4first --experimental-network-inspection --inspect-port=0 --crashpad-handler-pid=1423 --enable-crash-reporter=e581a95d-79e2-4b0e-8cd4-f0f7a2ff6cc1,no_channel --user-data-dir=/home/debian/.config/Code --standard-schemes=vscode-webview,vscode-file --enable-sandbox --secure-schemes=vscode-webview,vscode-file --cors-schemes=vscode-webview,vscode-file --fetch-schemes=vscode-webview,vscode-file --service-worker-schemes=vscode-webview --code-cache-schemes=vscode-webview,vscode-file --shared-files=v8_context_snapshot_data:100 --field-trial-handle=3,i,5311286946587817577,16475212634692565604,262144 --enable-features=DocumentPolicyIncludeJSCallStacksInCrashReports,EarlyEstablishGpuChannel,EstablishGpuChannelAsync --disable-features=CalculateNativeWinOcclusion,FontationsLinuxSystemFonts,ScreenAIOCREnabled,SpareRendererForSitePerProcess --variations-seed-version
debian      2266  0.0  0.0   7316  2044 ?        S    19:19   0:00 /bin/bash /home/debian/.vscode/extensions/oracle.oracle-java-24.1.2/nbcode/bin/../platform/lib/nbexec.sh --jdkhome  --clusters /home/debian/.vscode/extensions/oracle.oracle-java-24.1.2/nbcode/platform:/home/debian/.vscode/extensions/oracle.oracle-java-24.1.2/nbcode/ide:/home/debian/.vscode/extensions/oracle.oracle-java-24.1.2/nbcode/extide:/home/debian/.vscode/extensions/oracle.oracle-java-24.1.2/nbcode/webcommon:/home/debian/.vscode/extensions/oracle.oracle-java-24.1.2/nbcode/java:/home/debian/.vscode/extensions/oracle.oracle-java-24.1.2/nbcode/bin/../groovy:/home/debian/.vscode/extensions/oracle.oracle-java-24.1.2/nbcode/bin/../cpplite:/home/debian/.vscode/extensions/oracle.oracle-java-24.1.2/nbcode/extra:/home/debian/.vscode/extensions/oracle.oracle-java-24.1.2/nbcode/bin/../apisupport:/home/debian/.vscode/extensions/oracle.oracle-java-24.1.2/nbcode/bin/../enterprise:/home/debian/.vscode/extensions/oracle.oracle-java-24.1.2/nbcode/nbcode: --userdir /home/debian/.config/Code/User/workspaceStorage/c63081ce59aa1a7a0d161e974250c42a/Oracle.oracle-java/userdir --nogui --nosplash --branding nbcode -J-Xmx1G -J-XX:+UseParallelGC -J-XX:GCTimeRatio=4 -J-XX:AdaptiveSizePolicyWeight=90 -J-Djava.awt.headless=true -J-DTopSecurityManager.disable=true -J--enable-native-access=ALL-UNNAMED -J--add-opens=java.base/java.net=ALL-UNNAMED -J--add-opens=java.base/java.lang.ref=ALL-UNNAMED -J--add-opens=java.base/java.lang=ALL-UNNAMED -J--add-opens=java.base/java.security=ALL-UNNAMED -J--add-opens=java.base/java.util=ALL-UNNAMED -J--add-opens=java.desktop/javax.swing.plaf.basic=ALL-UNNAMED -J--add-opens=java.desktop/javax.swing.text=ALL-UNNAMED -J--add-opens=java.desktop/javax.swing=ALL-UNNAMED -J--add-opens=java.desktop/java.awt=ALL-UNNAMED -J--add-opens=java.desktop/java.awt.event=ALL-UNNAMED -J--add-opens=java.prefs/java.util.prefs=ALL-UNNAMED -J--add-opens=jdk.jshell/jdk.jshell=ALL-UNNAMED -J--add-modules=jdk.jshell -J--add-exports=java.desktop/sun.awt=ALL-UNNAMED -J--add-exports=java.desktop/java.awt.peer=ALL-UNNAMED -J--add-exports=java.desktop/com.sun.beans.editors=ALL-UNNAMED -J--add-exports=java.desktop/sun.swing=ALL-UNNAMED -J--add-exports=java.desktop/sun.awt.im=ALL-UNNAMED -J--add-exports=jdk.internal.jvmstat/sun.jvmstat.monitor=ALL-UNNAMED -J--add-exports=java.management/sun.management=ALL-UNNAMED -J--add-exports=java.base/sun.reflect.annotation=ALL-UNNAMED -J--add-exports=jdk.compiler/com.sun.tools.javac.api=ALL-UNNAMED -J--add-exports=jdk.compiler/com.sun.tools.javac.code=ALL-UNNAMED -J--add-exports=jdk.compiler/com.sun.tools.javac.comp=ALL-UNNAMED -J--add-exports=jdk.compiler/com.sun.tools.javac.file=ALL-UNNAMED -J--add-exports=jdk.compiler/com.sun.tools.javac.jvm=ALL-UNNAMED -J--add-exports=jdk.compiler/com.sun.tools.javac.main=ALL-UNNAMED -J--add-exports=jdk.compiler/com.sun.tools.javac.model=ALL-UNNAMED -J--add-exports=jdk.compiler/com.sun.tools.javac.parser=ALL-UNNAMED -J--add-exports=jdk.compiler/com.sun.tools.javac.processing=ALL-UNNAMED -J--add-exports=jdk.compiler/com.sun.tools.javac.tree=ALL-UNNAMED -J--add-exports=jdk.compiler/com.sun.tools.javac.util=ALL-UNNAMED -J--add-opens=jdk.compiler/com.sun.tools.javac.api=ALL-UNNAMED -J--add-opens=jdk.compiler/com.sun.tools.javac.code=ALL-UNNAMED -J--add-opens=jdk.compiler/com.sun.tools.javac.comp=ALL-UNNAMED -J--add-opens=jdk.compiler/com.sun.tools.javac.file=ALL-UNNAMED -J--add-opens=jdk.compiler/com.sun.tools.javac.jvm=ALL-UNNAMED -J--add-opens=jdk.compiler/com.sun.tools.javac.main=ALL-UNNAMED -J--add-opens=jdk.compiler/com.sun.tools.javac.model=ALL-UNNAMED -J--add-opens=jdk.compiler/com.sun.tools.javac.parser=ALL-UNNAMED -J--add-opens=jdk.compiler/com.sun.tools.javac.processing=ALL-UNNAMED -J--add-opens=jdk.compiler/com.sun.tools.javac.tree=ALL-UNNAMED -J--add-opens=jdk.compiler/com.sun.tools.javac.util=ALL-UNNAMED -J--add-exports=jdk.jdeps/com.sun.tools.classfile=ALL-UNNAMED -J--add-exports=jdk.jdeps/com.sun.tools.javap=ALL-UNNAMED -J-XX:+IgnoreUnrecognizedVMOptions -J-Dproject.limitScanRoot=/home/debian:/home/debian/Documents/ejercicio-informe --laf com.formdev.flatlaf.FlatDarkLaf --modules --list -J-XX:PerfMaxStringConstLength=10240 --locale es --start-java-language-server=listen-hash:0 --start-java-debug-adapter-server=listen-hash:0 -J--add-exports=jdk.compiler/com.sun.tools.javac.resources=ALL-UNNAMED
debian      2429 22.7 13.2 5441380 530844 ?      Sl   19:19   6:38 /usr/lib/jvm/java-17-openjdk-amd64/bin/java -Djdk.home=/usr/lib/jvm/java-17-openjdk-amd64 -classpath /home/debian/.vscode/extensions/oracle.oracle-java-24.1.2/nbcode/platform/lib/boot.jar:/home/debian/.vscode/extensions/oracle.oracle-java-24.1.2/nbcode/platform/lib/org-openide-modules.jar:/home/debian/.vscode/extensions/oracle.oracle-java-24.1.2/nbcode/platform/lib/org-openide-util.jar:/home/debian/.vscode/extensions/oracle.oracle-java-24.1.2/nbcode/platform/lib/org-openide-util-lookup.jar:/home/debian/.vscode/extensions/oracle.oracle-java-24.1.2/nbcode/platform/lib/org-openide-util-ui.jar -Dnetbeans.dirs=/home/debian/.vscode/extensions/oracle.oracle-java-24.1.2/nbcode/platform:/home/debian/.vscode/extensions/oracle.oracle-java-24.1.2/nbcode/ide:/home/debian/.vscode/extensions/oracle.oracle-java-24.1.2/nbcode/extide:/home/debian/.vscode/extensions/oracle.oracle-java-24.1.2/nbcode/webcommon:/home/debian/.vscode/extensions/oracle.oracle-java-24.1.2/nbcode/java:/home/debian/.vscode/extensions/oracle.oracle-java-24.1.2/nbcode/bin/../groovy:/home/debian/.vscode/extensions/oracle.oracle-java-24.1.2/nbcode/bin/../cpplite:/home/debian/.vscode/extensions/oracle.oracle-java-24.1.2/nbcode/extra:/home/debian/.vscode/extensions/oracle.oracle-java-24.1.2/nbcode/bin/../apisupport:/home/debian/.vscode/extensions/oracle.oracle-java-24.1.2/nbcode/bin/../enterprise:/home/debian/.vscode/extensions/oracle.oracle-java-24.1.2/nbcode/nbcode: -Dnetbeans.home=/home/debian/.vscode/extensions/oracle.oracle-java-24.1.2/nbcode/platform -Xmx1G -XX:+UseParallelGC -XX:GCTimeRatio=4 -XX:AdaptiveSizePolicyWeight=90 -Djava.awt.headless=true -DTopSecurityManager.disable=true --enable-native-access=ALL-UNNAMED --add-opens=java.base/java.net=ALL-UNNAMED --add-opens=java.base/java.lang.ref=ALL-UNNAMED --add-opens=java.base/java.lang=ALL-UNNAMED --add-opens=java.base/java.security=ALL-UNNAMED --add-opens=java.base/java.util=ALL-UNNAMED --add-opens=java.desktop/javax.swing.plaf.basic=ALL-UNNAMED --add-opens=java.desktop/javax.swing.text=ALL-UNNAMED --add-opens=java.desktop/javax.swing=ALL-UNNAMED --add-opens=java.desktop/java.awt=ALL-UNNAMED --add-opens=java.desktop/java.awt.event=ALL-UNNAMED --add-opens=java.prefs/java.util.prefs=ALL-UNNAMED --add-opens=jdk.jshell/jdk.jshell=ALL-UNNAMED --add-modules=jdk.jshell --add-exports=java.desktop/sun.awt=ALL-UNNAMED --add-exports=java.desktop/java.awt.peer=ALL-UNNAMED --add-exports=java.desktop/com.sun.beans.editors=ALL-UNNAMED --add-exports=java.desktop/sun.swing=ALL-UNNAMED --add-exports=java.desktop/sun.awt.im=ALL-UNNAMED --add-exports=jdk.internal.jvmstat/sun.jvmstat.monitor=ALL-UNNAMED --add-exports=java.management/sun.management=ALL-UNNAMED --add-exports=java.base/sun.reflect.annotation=ALL-UNNAMED --add-exports=jdk.compiler/com.sun.tools.javac.api=ALL-UNNAMED --add-exports=jdk.compiler/com.sun.tools.javac.code=ALL-UNNAMED --add-exports=jdk.compiler/com.sun.tools.javac.comp=ALL-UNNAMED --add-exports=jdk.compiler/com.sun.tools.javac.file=ALL-UNNAMED --add-exports=jdk.compiler/com.sun.tools.javac.jvm=ALL-UNNAMED --add-exports=jdk.compiler/com.sun.tools.javac.main=ALL-UNNAMED --add-exports=jdk.compiler/com.sun.tools.javac.model=ALL-UNNAMED --add-exports=jdk.compiler/com.sun.tools.javac.parser=ALL-UNNAMED --add-exports=jdk.compiler/com.sun.tools.javac.processing=ALL-UNNAMED --add-exports=jdk.compiler/com.sun.tools.javac.tree=ALL-UNNAMED --add-exports=jdk.compiler/com.sun.tools.javac.util=ALL-UNNAMED --add-opens=jdk.compiler/com.sun.tools.javac.api=ALL-UNNAMED --add-opens=jdk.compiler/com.sun.tools.javac.code=ALL-UNNAMED --add-opens=jdk.compiler/com.sun.tools.javac.comp=ALL-UNNAMED --add-opens=jdk.compiler/com.sun.tools.javac.file=ALL-UNNAMED --add-opens=jdk.compiler/com.sun.tools.javac.jvm=ALL-UNNAMED --add-opens=jdk.compiler/com.sun.tools.javac.main=ALL-UNNAMED --add-opens=jdk.compiler/com.sun.tools.javac.model=ALL-UNNAMED --add-opens=jdk.compiler/com.sun.tools.javac.parser=ALL-UNNAMED --add-opens=jdk.compiler/com.sun.tools.javac.processing=ALL-UNNAMED --add-opens=jdk.compiler/com.sun.tools.javac.tree=ALL-UNNAMED --add-opens=jdk.compiler/com.sun.tools.javac.util=ALL-UNNAMED --add-exports=jdk.jdeps/com.sun.tools.classfile=ALL-UNNAMED --add-exports=jdk.jdeps/com.sun.tools.javap=ALL-UNNAMED -XX:+IgnoreUnrecognizedVMOptions -Dproject.limitScanRoot=/home/debian:/home/debian/Documents/ejercicio-informe -XX:PerfMaxStringConstLength=10240 --add-exports=jdk.compiler/com.sun.tools.javac.resources=ALL-UNNAMED -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=/home/debian/.config/Code/User/workspaceStorage/c63081ce59aa1a7a0d161e974250c42a/Oracle.oracle-java/userdir/var/log/heapdump.hprof org.netbeans.Main --cachedir /home/debian/.config/Code/User/workspaceStorage/c63081ce59aa1a7a0d161e974250c42a/Oracle.oracle-java/userdir/var/cache --userdir /home/debian/.config/Code/User/workspaceStorage/c63081ce59aa1a7a0d161e974250c42a/Oracle.oracle-java/userdir --nogui --nosplash --branding nbcode --laf com.formdev.flatlaf.FlatDarkLaf --modules --list --locale es --start-java-language-server=listen-hash:0 --start-java-debug-adapter-server=listen-hash:0
debian      2602  0.7  1.0 1063972 42312 ?       Sl   19:20   0:12 /home/debian/.vscode/extensions/vscjava.migrate-java-to-azure-1.5.3-linux-x64/out/mcp-server --serverType codetocloud --codeToCloudDeployWorkflowName quickstart --codeToCloudDeployToExistingWorkflowName deploy-to-existing --codeToCloudContainerizationWorkflowName containerization
debian      2632 10.9 20.4 6454912 819984 ?      Sl   19:20   3:09 /home/debian/.vscode/extensions/redhat.java-1.46.0-linux-x64/jre/21.0.8-linux-x86_64/bin/java --add-modules=ALL-SYSTEM --add-opens java.base/java.util=ALL-UNNAMED --add-opens java.base/java.lang=ALL-UNNAMED --add-opens java.base/sun.nio.fs=ALL-UNNAMED -Declipse.application=org.eclipse.jdt.ls.core.id1 -Dosgi.bundles.defaultStartLevel=4 -Declipse.product=org.eclipse.jdt.ls.core.product -Djava.import.generatesMetadataFilesAtProjectRoot=false -DDetectVMInstallationsJob.disabled=true -Dfile.encoding=utf8 -XX:+UseParallelGC -XX:GCTimeRatio=4 -XX:AdaptiveSizePolicyWeight=90 -Dsun.zip.disableMemoryMapping=true -Xmx2G -Xms100m -Xlog:disable -javaagent:/home/debian/.vscode/extensions/redhat.java-1.46.0-linux-x64/lombok/lombok-1.18.39-4050.jar -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=/home/debian/.config/Code/User/workspaceStorage/c63081ce59aa1a7a0d161e974250c42a/redhat.java -Daether.dependencyCollector.impl=bf -jar /home/debian/.vscode/extensions/redhat.java-1.46.0-linux-x64/server/plugins/org.eclipse.equinox.launcher_1.7.0.v20250519-0528.jar -configuration /home/debian/.config/Code/User/globalStorage/redhat.java/1.46.0/config_linux -data /home/debian/.config/Code/User/workspaceStorage/c63081ce59aa1a7a0d161e974250c42a/redhat.java/jdt_ws --pipe=/run/user/1000/lsp-a20234ad4b383f812ed81ec84494ca87.sock
debian      2761  0.0  1.3 1459550576 55988 ?    Sl   19:20   0:01 /usr/share/code/code /usr/share/code/resources/app/extensions/json-language-features/server/dist/node/jsonServerMain --node-ipc --clientProcessId=2169
debian      5860  1.5  2.4 1461310788 98492 ?    Sl   19:27   0:20 /proc/self/exe --type=utility --utility-sub-type=node.mojom.NodeService --lang=es --service-sandbox-type=none --crashpad-handler-pid=1423 --enable-crash-reporter=e581a95d-79e2-4b0e-8cd4-f0f7a2ff6cc1,no_channel --user-data-dir=/home/debian/.config/Code --standard-schemes=vscode-webview,vscode-file --enable-sandbox --secure-schemes=vscode-webview,vscode-file --cors-schemes=vscode-webview,vscode-file --fetch-schemes=vscode-webview,vscode-file --service-worker-schemes=vscode-webview --code-cache-schemes=vscode-webview,vscode-file --shared-files=v8_context_snapshot_data:100 --field-trial-handle=3,i,5311286946587817577,16475212634692565604,262144 --enable-features=DocumentPolicyIncludeJSCallStacksInCrashReports,EarlyEstablishGpuChannel,EstablishGpuChannelAsync --disable-features=CalculateNativeWinOcclusion,FontationsLinuxSystemFonts,ScreenAIOCREnabled,SpareRendererForSitePerProcess --variations-seed-version
debian      5888  0.0  0.1   8388  5220 pts/0    Ss+  19:27   0:00 /usr/bin/bash --init-file /usr/share/code/resources/app/out/vs/workbench/contrib/terminal/common/scripts/shellIntegration-bash.sh
root        5948  0.0  0.0      0     0 ?        I    19:27   0:00 [kworker/1:0-events]
debian      6728  0.0  0.0   2584  1676 ?        S    19:28   0:00 /bin/sh /usr/bin/xdg-open http://127.0.0.1:38247/signin?nonce=NAWWWBS0GP21VqW+dwL/Ag==
debian      6838  1.4  3.4 34230444 137552 ?     Sl   19:28   0:17 /usr/lib/chromium/chromium --show-component-extension-options --enable-gpu-rasterization --no-default-browser-check --disable-pings --media-router=0 --disable-dev-shm-usage --enable-remote-extensions --load-extension http://127.0.0.1:38247/signin?nonce=NAWWWBS0GP21VqW+dwL/Ag==
debian      6908  0.0  0.0 33569360 1936 ?       Sl   19:28   0:00 /usr/lib/chromium/chrome_crashpad_handler --monitor-self --monitor-self-annotation=ptype=crashpad-handler --database=/home/debian/.config/chromium/Crash Reports --annotation=channel=built on Debian GNU/Linux 12 (bookworm) --annotation=lsb-release=Debian GNU/Linux 12 (bookworm) --annotation=plat=Linux --annotation=prod=Chrome_Linux --annotation=ver=140.0.7339.80 --initial-client-fd=5 --shared-client-connection
debian      6910  0.0  0.0 33561148 2316 ?       S    19:28   0:00 /usr/lib/chromium/chrome_crashpad_handler --no-periodic-tasks --monitor-self-annotation=ptype=crashpad-handler --database=/home/debian/.config/chromium/Crash Reports --annotation=channel=built on Debian GNU/Linux 12 (bookworm) --annotation=lsb-release=Debian GNU/Linux 12 (bookworm) --annotation=plat=Linux --annotation=prod=Chrome_Linux --annotation=ver=140.0.7339.80 --initial-client-fd=4 --shared-client-connection
debian      6914  0.0  0.9 33981604 37600 ?      S    19:28   0:00 /usr/lib/chromium/chromium --type=zygote --no-zygote-sandbox --crashpad-handler-pid=6908 --enable-crash-reporter=,built on Debian GNU/Linux 12 (bookworm) --change-stack-guard-on-fork=enable
debian      6915  0.0  0.9 33981588 37812 ?      S    19:28   0:00 /usr/lib/chromium/chromium --type=zygote --crashpad-handler-pid=6908 --enable-crash-reporter=,built on Debian GNU/Linux 12 (bookworm) --change-stack-guard-on-fork=enable
debian      6917  0.0  0.4 33981616 18736 ?      S    19:28   0:00 /usr/lib/chromium/chromium --type=zygote --crashpad-handler-pid=6908 --enable-crash-reporter=,built on Debian GNU/Linux 12 (bookworm) --change-stack-guard-on-fork=enable
debian      6971  0.5  2.8 34284344 113876 ?     Sl   19:28   0:06 /usr/lib/chromium/chromium --type=gpu-process --disable-dev-shm-usage --enable-gpu-rasterization --ozone-platform=x11 --crashpad-handler-pid=6908 --enable-crash-reporter=,built on Debian GNU/Linux 12 (bookworm) --change-stack-guard-on-fork=enable --gpu-preferences=UAAAAAAAAAAgAAAIAAAAAAAAAAAAAGAAAQAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAYAAAAAAAAABgAAAAAAAAAAQAAAAAAAAAIAAAAAAAAAAgAAAAAAAAA --shared-files --metrics-shmem-handle=4,i,10788610916321964094,16655003188560703662,262144 --field-trial-handle=3,i,10216608074919376368,8005646663942124234,262144 --variations-seed-version
debian      6978  0.2  1.5 33984864 60952 ?      Sl   19:29   0:03 /usr/lib/chromium/chromium --type=utility --utility-sub-type=network.mojom.NetworkService --lang=en-US --service-sandbox-type=none --disable-dev-shm-usage --crashpad-handler-pid=6908 --enable-crash-reporter=,built on Debian GNU/Linux 12 (bookworm) --change-stack-guard-on-fork=enable --shared-files=v8_context_snapshot_data:100 --metrics-shmem-handle=4,i,3343605995233509405,5976779309022495233,524288 --field-trial-handle=3,i,10216608074919376368,8005646663942124234,262144 --variations-seed-version
debian      6991  0.0  1.0 34040036 43776 ?      Sl   19:29   0:00 /usr/lib/chromium/chromium --type=utility --utility-sub-type=storage.mojom.StorageService --lang=en-US --service-sandbox-type=utility --disable-dev-shm-usage --crashpad-handler-pid=6908 --enable-crash-reporter=,built on Debian GNU/Linux 12 (bookworm) --change-stack-guard-on-fork=enable --shared-files=v8_context_snapshot_data:100 --metrics-shmem-handle=4,i,17508048518785974554,8757025216653666806,524288 --field-trial-handle=3,i,10216608074919376368,8005646663942124234,262144 --variations-seed-version
root        7056  0.0  0.1 233792  5508 ?        Ssl  19:29   0:00 /usr/libexec/upowerd
debian      7251  0.1  2.6 1283586316 106228 ?   Sl   19:29   0:02 /usr/lib/chromium/chromium --type=renderer --crashpad-handler-pid=6908 --enable-crash-reporter=,built on Debian GNU/Linux 12 (bookworm) --origin-trial-disabled-features=CanvasTextNg|WebAssemblyCustomDescriptors --change-stack-guard-on-fork=enable --disable-dev-shm-usage --ozone-platform=x11 --disable-gpu-compositing --lang=en-US --num-raster-threads=2 --enable-main-frame-before-activation --renderer-client-id=8 --time-ticks-at-unix-epoch=-1761178596266223 --launch-time-ticks=767822286 --shared-files=v8_context_snapshot_data:100 --metrics-shmem-handle=4,i,6634343352272959735,6671671272758360647,2097152 --field-trial-handle=3,i,10216608074919376368,8005646663942124234,262144 --variations-seed-version
debian      7292  0.0  1.5 1283559724 62996 ?    Sl   19:29   0:00 /usr/lib/chromium/chromium --type=renderer --crashpad-handler-pid=6908 --enable-crash-reporter=,built on Debian GNU/Linux 12 (bookworm) --origin-trial-disabled-features=CanvasTextNg|WebAssemblyCustomDescriptors --change-stack-guard-on-fork=enable --disable-dev-shm-usage --ozone-platform=x11 --disable-gpu-compositing --lang=en-US --num-raster-threads=2 --enable-main-frame-before-activation --renderer-client-id=10 --time-ticks-at-unix-epoch=-1761178596266223 --launch-time-ticks=769797916 --shared-files=v8_context_snapshot_data:100 --metrics-shmem-handle=4,i,8378792144155278407,2685340317655721793,2097152 --field-trial-handle=3,i,10216608074919376368,8005646663942124234,262144 --variations-seed-version
root        7683  0.6  0.0      0     0 ?        I    19:29   0:07 [kworker/0:1-mm_percpu_wq]
root        9004  0.0  0.0      0     0 ?        I    19:32   0:00 [kworker/3:1-cgroup_destroy]
root       11191  0.0  0.0      0     0 ?        I    19:36   0:00 [kworker/u10:0-events_unbound]
root       11262  0.1  0.0      0     0 ?        I    19:37   0:00 [kworker/u10:3-events_unbound]
root       11434  0.1  0.0      0     0 ?        I    19:37   0:00 [kworker/4:2-mm_percpu_wq]
root       11471  0.0  0.0      0     0 ?        I    19:37   0:00 [kworker/2:2]
root       13904  0.0  0.0      0     0 ?        I    19:42   0:00 [kworker/4:0-ata_sff]
root       14730  0.0  0.0      0     0 ?        I    19:44   0:00 [kworker/u10:1-ext4-rsv-conversion]
root       15251  0.1  0.0      0     0 ?        I    19:45   0:00 [kworker/u10:2-events_unbound]
debian     16246  0.0  0.1   8388  5300 pts/1    Ss   19:47   0:00 /usr/bin/bash --init-file /usr/share/code/resources/app/out/vs/workbench/contrib/terminal/common/scripts/shellIntegration-bash.sh
debian     16413  1.4  1.8 1459517856 73568 ?    Sl   19:47   0:01 /usr/share/code/code /home/debian/.vscode/extensions/dbaeumer.vscode-eslint-3.0.16/server/out/eslintServer.js --node-ipc --clientProcessId=2169
debian     16453  0.4  2.0 1459550576 82172 ?    Sl   19:47   0:00 /usr/share/code/code /usr/share/code/resources/app/extensions/markdown-language-features/dist/serverWorkerMain --node-ipc --clientProcessId=2169
root       16558  0.0  0.0      0     0 ?        I    19:47   0:00 [kworker/4:1-ata_sff]
debian     17395 76.9  0.9 3816964 36996 pts/1   Sl+  19:49   0:00 /usr/lib/jvm/java-17-openjdk-amd64/bin/java -XX:+ShowCodeDetailsInExceptionMessages -cp /home/debian/Documents/ejercicio-informe/target/classes es.etg.psp.informe.Main
debian     17414  100  0.1  11224  4820 pts/1    R+   19:49   0:00 ps aux

```

## Uso del Disco
```bash
Filesystem                     Size  Used Avail Use% Mounted on
udev                           1.9G     0  1.9G   0% /dev
tmpfs                          392M  704K  391M   1% /run
/dev/mapper/debian12--vg-root   23G  4.9G   17G  23% /
tmpfs                          2.0G   93M  1.9G   5% /dev/shm
tmpfs                          5.0M     0  5.0M   0% /run/lock
/dev/mapper/debian12--vg-var   9.1G  2.5G  6.2G  29% /var
/dev/mapper/debian12--vg-tmp   1.8G  198M  1.5G  12% /tmp
/dev/mapper/debian12--vg-home  210G  5.0G  194G   3% /home
/dev/sda1                      455M  208M  223M  49% /boot
tmpfs                          392M   32K  392M   1% /run/user/1000

```

## Uso de Memoria
```bash
               total        used        free      shared  buff/cache   available
Mem:           3.8Gi       3.4Gi       111Mi       143Mi       734Mi       474Mi
Swap:          975Mi       621Mi       354Mi

```
