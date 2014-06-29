package com.epam.bp.hardware_shop.entity;

import java.math.BigDecimal;
import java.util.Random;

public class WareFactory {

    public static final int WARES_SUBCLASSES_COUNT = 8;

    private static int minMaxRandom(int min, int max) {
        return new Random().nextInt((max - min) + 1) + min;
    }

    private static int minMaxStepRandom(int min, int max, int step) {
        return (new Random().nextInt((max - min) / step + 1)) * step + min;
    }

    private static boolean boolRandom() {
        return new Random().nextBoolean();
    }

    public static Ware createRandomWare() {
        int x = minMaxRandom(0, WARES_SUBCLASSES_COUNT - 1);
        switch (x) {
            case 0: {
                return createRandomCpu();
            }
            case 1: {
                return createRandomHdd();
            }
            case 2: {
                return createRandomMotherboard();
            }
            case 3: {
                return createRandomMonitor();
            }
            case 4: {
                return createRandomRam();
            }
            case 5: {
                return createRandomVideocard();
            }
            case 6: {
                return createRandomNotebook();
            }
            case 7: {
                return createRandomPc();
            }
        }
        return null;
    }

    public static Ware createRandomCpu() {
        return new Cpu()
                .setSocket(Cpu.Socket.values()[minMaxRandom(0, (Cpu.Socket.values().length) - 1)])
                .setCoreQuantity(minMaxRandom(1, 4))
                .setFrequencyMHz(minMaxStepRandom(1000, 4000, 100))
                .setTechProcessNm(minMaxStepRandom(20, 40, 2))
                .setVendor(Ware.Vendor.values()[minMaxRandom(0, (Ware.Vendor.values().length) - 1)])
                .setModel("Model_" + minMaxRandom(1, 1000))
                .setPrice(BigDecimal.valueOf(minMaxStepRandom(7500, 70000, 500)))
                .setWeight(minMaxStepRandom(50, 300, 20));
    }

    public static Ware createRandomHdd() {
        return new Hdd()
                .setCapacityGb(minMaxStepRandom(500, 4000, 500))
                .setRotatingSpeedRpm(minMaxStepRandom(5000, 7000, 2000))
                .setFormfactorHdd(Hdd.FormFactor.values()[minMaxRandom(0, (Hdd.FormFactor.values().length) - 1)])
                .setVendor(Ware.Vendor.values()[minMaxRandom(0, (Ware.Vendor.values().length) - 1)])
                .setModel("Model_" + minMaxRandom(1, 1000))
                .setPrice(BigDecimal.valueOf(minMaxStepRandom(10000, 90000, 500)))
                .setWeight(minMaxStepRandom(400, 600, 10));
    }

    public static Ware createRandomMotherboard() {
        return new Motherboard()
                .setMaxRamSizeGb(minMaxStepRandom(4, 32, 4))
                .setRaidOnboard(boolRandom())
                .setVgaOnboard(boolRandom())
                .setSataCount(minMaxRandom(0, 10))
                .setDdrCount(minMaxStepRandom(2, 4, 2))
                .setUsbCount(minMaxStepRandom(0, 10, 2))
                .setFormFactor(Motherboard.FormFactor.values()[minMaxRandom(0, (Motherboard.FormFactor.values().length) - 1)])
                .setSocket(Cpu.Socket.values()[minMaxRandom(0, (Cpu.Socket.values().length) - 1)])
                .setVendor(Ware.Vendor.values()[minMaxRandom(0, (Ware.Vendor.values().length) - 1)])
                .setModel("Model_" + minMaxRandom(1, 1000))
                .setPrice(BigDecimal.valueOf(minMaxStepRandom(8000, 88000, 500)))
                .setWeight(minMaxStepRandom(400, 1800, 50));
    }

    public static Ware createRandomMonitor() {
        return new Monitor()
                .setDisplayResolution(Monitor.DisplayResolution.values()[minMaxRandom(0, (Monitor.DisplayResolution.values().length) - 1)])
                .setDisplaySizeInches(minMaxRandom(15, 29))
                .setVgaOut(boolRandom())
                .setDviOut(boolRandom())
                .setHdmiOut(boolRandom())
                .setSpeakersBuiltin(boolRandom())
                .setVendor(Ware.Vendor.values()[minMaxRandom(0, (Ware.Vendor.values().length) - 1)])
                .setModel("Model_" + minMaxRandom(1, 1000))
                .setPrice(BigDecimal.valueOf(minMaxStepRandom(16000, 244000, 500)))
                .setWeight(minMaxStepRandom(2500, 5000, 100));
    }

    public static Ware createRandomRam() {
        return new Ram()
                .setCapacityMb(minMaxStepRandom(1024, 8192, 1024))
                .setMaxFrequencyMHz(minMaxStepRandom(800, 2400, 133))
                .setRamtype(Ram.RamType.values()[minMaxRandom(0, (Ram.RamType.values().length) - 1)])
                .setVendor(Ware.Vendor.values()[minMaxRandom(0, (Ware.Vendor.values().length) - 1)])
                .setModel("Model_" + minMaxRandom(1, 1000))
                .setPrice(BigDecimal.valueOf(minMaxStepRandom(3000, 77000, 500)))
                .setWeight(minMaxStepRandom(100, 100, 20));
    }

    public static Ware createRandomVideocard() {
        return new VideoCard()
                .setVideoCardChipset(VideoCard.VideoCardChipset.values()[minMaxRandom(0, (VideoCard.VideoCardChipset.values().length) - 1)])
                .setRamSizeMb(minMaxStepRandom(1024, 4096, 1024))
                .setBusWidthBit(minMaxStepRandom(32, 512, 32))
                .setCpuFrequencyMHz(minMaxStepRandom(1024, 2048, 32))
                .setRamFrequencyMHz(minMaxStepRandom(2048, 6192, 32))
                .setVendor(Ware.Vendor.values()[minMaxRandom(0, (Ware.Vendor.values().length) - 1)])
                .setModel("Model_" + minMaxRandom(1, 1000))
                .setPrice(BigDecimal.valueOf(minMaxStepRandom(5000, 151000, 500)))
                .setWeight(minMaxStepRandom(500, 2000, 50));
    }

    public static Ware createRandomNotebook() {
        return new Notebook()
                .setDisplaySizeInches(minMaxRandom(10, 18))
                .setDisplayResolution(Monitor.DisplayResolution.values()[minMaxRandom(0, (Monitor.DisplayResolution.values().length) - 1)])
                .setCpu(createRandomCpu())
                .setHdd(createRandomHdd())
                .setVideoCard(createRandomVideocard())
                .setRam(createRandomRam())
                .setVendor(Ware.Vendor.values()[minMaxRandom(0, (Ware.Vendor.values().length) - 1)])
                .setModel("Model_" + minMaxRandom(1, 1000))
                .setPrice(BigDecimal.valueOf(minMaxStepRandom(60000, 987000, 500)))
                .setWeight(minMaxStepRandom(1200, 5000, 100));
    }

    public static Ware createRandomPc() {
        return new Pc()
                .setCpu(createRandomCpu())
                .setVideoCard(createRandomVideocard())
                .setHdd(createRandomHdd())
                .setRam(createRandomRam())
                .setMotherboard(createRandomMotherboard())
                .setMonitor(createRandomMonitor())
                .setMouseAndKeyboardIncluded(boolRandom())
                .setSpeakersIncluded(boolRandom())
                .setPreinstalledOs(Pc.PreinstalledOs.values()[minMaxRandom(0, (Pc.PreinstalledOs.values().length) - 1)])
                .setVendor(Ware.Vendor.values()[minMaxRandom(0, (Ware.Vendor.values().length) - 1)])
                .setModel("Model_" + minMaxRandom(1, 1000))
                .setPrice(BigDecimal.valueOf(minMaxStepRandom(37500, 236500, 500)))
                .setWeight(minMaxStepRandom(1200, 5000, 100));
    }
}
